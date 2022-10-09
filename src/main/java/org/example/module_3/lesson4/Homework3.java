package org.example.module_3.lesson4;

public class Homework3 {
    public static void main(String[] args) {
        //Создать многомодульный проект, в котором будет 3 модуля.
        //Отправить мне ссылку на новый репозиторий!
        //Модуль #1 Service
        //Версия 1.0
        //В сервисе должен быть реализован класс Phone, поля: string prefix, string number.
        //Оба поля обязательны и не null. Необходимо самостоятельно подключить lombok.
        //Утилитный класс PhoneUtil - метод getFullNumber(Phone phone), возвращает String prefix + number.
        //Версия 1.1
        //В сервисе должно быть реализован класс Phone, поля: string prefix, string number, string bonusCode;
        //prefix, number обязательны и не null, bonusCode - может быть null.
        //Необходимо самостоятельно подключить lombok.
        //Утилитный класс PhoneUtil - ЕЩЕ один метод (т.е. методов будет 2) getPhoneWithCode(Phone phone),
        //возвращает String prefix + number + bonusCode (если bonusCode = null, то '', если bonusCode != null,
        // то в начале ставит '#', т.е. bonusCode = 203, то при prefix = '+7', и number = '91523000321'), результат:
        // '+791523000321#203'
        //
        //Модуль #2 OldApp
        //Данный модуль использует Service версии 1.0.
        //Необходимо самостоятельно подключить lombok + slf4-api.
        //В Модуле OldApp есть класс Runner, который запускает приложение, вызывает getFullNumber с параметрами:
        //"+7", "91222331", логирует результат выполнения метода.
        //
        //Модуль #3 NewApp
        //Данный модуль использует Service версии 1.1.
        //Необходимо самостоятельно подключить lombok + slf4-api.
        //В Модуле NewApp есть класс Runner, который запускает приложение, вызывает getFullNumber с параметрами:
        //"+7", "00000023", логирует результат выполнения метода.
        //вызывает getPhoneWithCode с параметрами:
        //"+7", "00000023", '007', логирует результат выполнения метода.
    }
}
