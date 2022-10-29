package maven_tutorial.unit;

import lombok.SneakyThrows;
import org.example.module_3.lesson7.homework.BrickFactory;
import org.example.module_3.lesson7.homework.NotEnoughResourcesException;
import org.example.module_3.lesson7.homework.Worker;
import org.example.module_3.lesson7.homework.WorkerTiredException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

public class BrickFactoryTest {

    @Nested
    public class testGroup {
        @Test
        @DisplayName("Проверка выброса ошибки фабрики, если рабочий устал")
        @SneakyThrows
        public void workerIsTyredExceptionTest() {
            Worker workerMock = Mockito.mock(Worker.class);
            Mockito.when(workerMock.createBrick()).thenThrow(new WorkerTiredException());
            BrickFactory brickFactory = new BrickFactory(workerMock, 12000, 12000);
            Assertions.assertThrows(WorkerTiredException.class, brickFactory::createBrick);
        }

        @Test
        @DisplayName("Проверка наличия рабочего на фабрике")
        public void isFactoryHasWorker() {
            Worker workerMock = Mockito.mock(Worker.class);
            BrickFactory brickFactoryWithWorker = new BrickFactory(workerMock, 12000, 12000);
            BrickFactory brickFactoryWithoutWorker = new BrickFactory(null, 12000, 12000);
            Assertions.assertTrue(brickFactoryWithWorker.checkFactoryHasWorker());
            Assertions.assertFalse(brickFactoryWithoutWorker.checkFactoryHasWorker());

        }

        @Test
        @SneakyThrows
        public void bricksCountTest() {
            Worker workerMock = Mockito.mock(Worker.class);
            BrickFactory brickFactory = new BrickFactory(workerMock, 10000, 10000);
            int bricksCount = 0;
            try {
                while (true) {
                    brickFactory.createBrick();
                    bricksCount++;
                }
            } catch (NotEnoughResourcesException e) {
                System.out.println(e.getMessage() + ", создано кирпичей " + bricksCount);
                Assertions.assertEquals(10, bricksCount);
            }
        }

        @ParameterizedTest
        @DisplayName("Параметризованный тест")
        @CsvFileSource(resources = "/factory_sources.csv", delimiter = ';')
        @SneakyThrows
        public void paramTest(Integer water, Integer sand, Integer brickCount) {
            Worker workerMock = Mockito.mock(Worker.class);
            BrickFactory brickFactory = new BrickFactory(workerMock, sand, water);
            int actual = 0;
            for (int i = 0; i < brickCount; i++) {
                brickFactory.createBrick();
                actual++;
            }
            Assertions.assertEquals(brickCount, actual);
        }
    }




}
