package org.example.module_3.lesson3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lesson3 {
    public static void main(String[] args) {
        //Trace - Вывод информации о ходе выполнения программы
        //Debug - это ключевая техническая информация
        //Info - Информация про бизнес логику
        //Warn - Предупреждение
        //Error - Серьезная ошибка

        //trace -> debug -> info -> warn -> error
        int i = 5;
        log.trace(String.valueOf(i));
        if (i == 5) {
            log.trace("Это пятерка");
        }

        for (int j = 0; j < 1000; j++) {
            if (j == 150) {
                log.error("Это проблема, нам передали пустое значение!");
            } else {
                log.trace(String.valueOf(j));
            }
        }
    }
}
