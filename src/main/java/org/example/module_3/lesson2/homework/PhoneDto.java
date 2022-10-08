package org.example.module_3.lesson2.homework;

import lombok.*;

@Builder
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class PhoneDto {
    //Создать класс PhoneDto.
    //Подумать какую(ие) аннотацию использовать: builder, superbuilder, noargsconstructor, requiredconstructor,
    //data, value
    //поля: string number - не null, boolean isGovernment, PhoneType phoneType - не null, string clientFio
    //При выводе в String убрать поля isGoverment, phoneType
    @NonNull
    private String number;
    private boolean isGovernment;
    @NonNull
    @ToString.Exclude
    private PhoneType phoneType;
    @ToString.Exclude
    private String clientFio;
}
