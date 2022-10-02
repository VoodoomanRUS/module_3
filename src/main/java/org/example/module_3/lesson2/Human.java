package org.example.module_3.lesson2;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Human {
    @ToString.Exclude
    @NonNull
    private String name;
    private final int age;
    @NonNull
    private Boolean isMale;


    //    @RequiredArgsConstructor
//    public Human(@NonNull String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    @NoArgsConstructor
//    public Human() {
//    }

//    @AllArgsConstructor
//    public Human(@NonNull String name, int age, boolean isMale) {
//        this.name = name;
//        this.age = age;
//        this.isMale = isMale;
//    }

    public static void main(String[] args) {
        Human human = new Human("Petr", 10, true);
        System.out.println(human);
        final int i = 100;
    }
}
