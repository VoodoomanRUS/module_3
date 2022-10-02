package org.example.module_3.lesson2;

import lombok.Builder;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Builder
@ToString
public class HumanB {
    private String name;
    private int age;
    private boolean isMale;

//    public HumanB(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public HumanB(int age, boolean isMale) {
//        this.age = age;
//        this.isMale = isMale;
//    }
//
//    private HumanB() {
//    }
//
//    public static HumanBuilder builder() {
//        return new HumanBuilder();
//    }
//
//    public static class HumanBuilder {
//        private HumanB humanB;
//
//        public HumanBuilder() {
//            this.humanB = new HumanB();
//        }
//
//        public HumanBuilder name(String name) {
//            this.humanB.name = name;
//            return this;
//        }
//
//        public HumanBuilder age(int age) {
//            this.humanB.age = age;
//            return this;
//        }
//
//        public HumanBuilder isMale(boolean isMale) {
//            this.humanB.isMale = isMale;
//            return this;
//        }
//
//        public HumanB build() {
//            return humanB;
//        }
//    }

}
