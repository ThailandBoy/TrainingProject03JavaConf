package ru.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spring.example.entity.animal.Cat;
import ru.spring.example.entity.animal.Dog;
import ru.spring.example.entity.animal.Pet;
import ru.spring.example.entity.auto.Auto;
import ru.spring.example.entity.auto.Lada;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.example.entity.human.Human;
import ru.spring.example.service.PetService;
import ru.spring.example.service.auto.CarService;
import ru.spring.example.service.human.HumanService;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CarService carService = context.getBean("carService", CarService.class);
        System.out.println(carService);

        context.close();

    }
}
