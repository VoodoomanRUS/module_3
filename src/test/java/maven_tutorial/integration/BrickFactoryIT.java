package maven_tutorial.integration;

import lombok.SneakyThrows;
import org.example.module_3.lesson7.homework.BrickFactory;
import org.example.module_3.lesson7.homework.NotEnoughResourcesException;
import org.example.module_3.lesson7.homework.Worker;
import org.example.module_3.lesson7.homework.WorkerTiredException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BrickFactoryIT {
    @Test
    @DisplayName("проверка неработоспособности фабрики при уставшем рабочим")
    @SneakyThrows
    public void brickFactoryAndWorkerTest() {
        Worker worker = new Worker(true);
        BrickFactory brickFactory = new BrickFactory(worker, 10000, 10000);
        Assert.assertThrows(WorkerTiredException.class, brickFactory::createBrick);
    }

    @Test
    @DisplayName("проверка неработоспособности фабрики при недостатке ресурсов")
    @SneakyThrows
    public void brickFactoryLowResourcesTest() {
        Worker worker = new Worker(false);
        BrickFactory brickFactory = new BrickFactory(worker, 100, 500);
        Assert.assertThrows(NotEnoughResourcesException.class, brickFactory::createBrick);
    }

    @ParameterizedTest
    @DisplayName("проверка работоспособности фабрики в расчёте на 2 кирпича")
    @CsvSource(value = {"2000;2000;2"}, delimiter = ';')
    @SneakyThrows
    public void paramTest(Integer water, Integer sand, Integer brickCount) {
        BrickFactory brickFactory = new BrickFactory(new Worker(false), sand, water);
        int actual = 0;
        for (int i = 0; i < brickCount; i++) {
            brickFactory.createBrick();
            actual++;
        }
        Assertions.assertEquals(brickCount, actual);
    }
}
