package org.example.module_3.lesson1;

import lombok.Data;

@Data
public class Animal {
    private String name;
    public void eat() {
        System.out.println("Животное ест");
    }
}
