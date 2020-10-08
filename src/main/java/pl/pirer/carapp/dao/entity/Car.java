package pl.pirer.carapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String brand;
    private int power;

    public Car() {
    }

    public Car(int id,String brand, int power) {
        this.id = id;
        this.brand = brand;
        this.power = power;
    }
}
