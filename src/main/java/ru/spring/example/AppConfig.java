package ru.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.spring.example.entity.auto.Lada;
import ru.spring.example.entity.auto.Mazda;
import ru.spring.example.service.auto.CarService;

@Configuration
//@ComponentScan("ru.spring.example")
@PropertySource("classpath:service.properties")
public class AppConfig {
    // Для демонстрации примера работы, перед дальнейшей работой
    // были удалены аннотации: @ComponentScan(), @Component, @Autowired
    @Bean
    public Lada lada() {return new Lada();}
    @Bean
    public Mazda mazda() {return  new Mazda();}
    @Bean
    public CarService carService() {return new CarService(lada(), mazda());}


}
