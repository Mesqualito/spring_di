package com.eigenbaumarkt.spring_di_ways.controller;

import com.eigenbaumarkt.spring_di_ways.controller.best_practice.BpConstructorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ControllerTest {

    @Autowired
    FieldController fieldController;

    @Autowired
    PrivateFieldController privateFieldController;

    @Autowired
    SetterController setterController;

    @Autowired
    ConstructorController constructorController;

    @Autowired
    BpConstructorController bpConstructorController;

    @Test
    void testFieldController() {

        System.out.println("A field controller says: " + fieldController.saySomething());

        System.out.println("A private field controller says: " + privateFieldController.saySomething());

        System.out.println("A setter controller says: " + setterController.saySomething());

        System.out.println("A constructor controller says: " + constructorController.saySomething());

        System.out.println("The best practice controller says: " + bpConstructorController.saySomething());

    }

}
