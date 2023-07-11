package ru.spring.example.service.auto;

import org.springframework.beans.factory.annotation.Value;
import ru.spring.example.entity.auto.Auto;

//@Component("carService")
//@Scope("prototype")
public class CarService {

    // Здесь введена зависимость к реализующим интерфейс авто
    // Аннотация Qualifier у зависимости означает - ожидать бин с Qualifier' ом "Mazda"
    // В противном случае будет выброшенна ошибка неоднозначности
    // Qualifier сильнее Primary
    //@Autowired
    //@Qualifier("Mazda")
    private Auto auto1;
    private Auto auto2;

    @Value("${carService.available}")
    private boolean available;

    @Value("${carService.count}")
    private int count;

    public CarService(Auto auto1){
        this.auto1 = auto1;
    };
    public CarService(Auto auto1, Auto auto2){
        this.auto1 = auto1;
        this.auto2 = auto2;
    };

    //@PostConstruct
    public void doMyInit(){
        System.out.println("doMyInit activated!");
    }
    //@PreDestroy
    public void doMyDestroy(){
        System.out.println("doMyDestroy activated!");
    }

    public Auto getAuto1() {
        return auto1;
    }

    public void setAuto1(Auto auto1) {
        this.auto1 = auto1;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "auto1=" + auto1 +
                ", available=" + available +
                ", count=" + count +
                "; auto2=" + auto2+'}';
    }
}
