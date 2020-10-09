package pl.pirer.carapp.dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
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
