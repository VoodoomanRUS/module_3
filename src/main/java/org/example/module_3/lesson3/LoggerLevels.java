package org.example.module_3.lesson3;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class LoggerLevels {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            log.trace("Покупатель №{} создан", i);
            customers.add(new Customer(i));
        }
        int allMoney = 0;
        for (Customer customer : customers) {
            if (customer.getMoney() < 10) {
                log.warn("Осторожно у покупателя мало денег: {}", customer.getMoney());
            }
            allMoney += customer.getMoney();
        }
        log.info("Сумма всех денег покупателей: {}", allMoney);
    }
}
