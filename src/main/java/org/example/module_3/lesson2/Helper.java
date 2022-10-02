package org.example.module_3.lesson2;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import lombok.val;

import java.io.FileWriter;
import java.util.Set;
import java.util.stream.Stream;

@UtilityClass
public class Helper {
    public int count = 5;

    public static void main(String[] args) {
        Stream.of(2, 1).forEach(e -> getError(e));
    }

    public void getBeautiful() {
        System.out.println("You are beautiful!");
    }

    public void getAngry() {
        System.out.println("You are Angry!");
    }

    @SneakyThrows
    public void getError(int i) {
        if (i == 1) {
            throw new Exception("Это проверяемая ошибка!");
        }
        System.out.println(i);
    }

    @SneakyThrows
    public void writeFile() {
        @Cleanup FileWriter writer = new FileWriter("1.txt");
        writer.write("hello");
        var myName = Set.of(12, 12);
        myString(myName);
        val myNameFinal = "123";
    }

    public static <T> void myString(T name) {

    }
}
