package org.example.module_3.lesson2.homework;

import lombok.ToString;
import lombok.Value;

@Value
public class PhoneType {
    //Создать класс PhoneType, сделать поля неизменяемыми. Все поля должны быть не null.
    //Подумать какую(ие) аннотацию использовать: builder, superbuilder, noargsconstructor, requiredconstructor,
    //data, value
    //поля: string name, string code, boolean isMobile
    //При выводе в String убрать поле isMobile
    String name;
    String code;
    @ToString.Exclude
    boolean isMobile;
}
