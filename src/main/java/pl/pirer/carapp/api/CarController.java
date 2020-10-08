package pl.pirer.carapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pirer.carapp.dao.entity.Car;
import pl.pirer.carapp.manager.CarManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarManager cars;

    @Autowired
    public CarController(CarManager cars) {
        this.cars = cars;
    }

    @GetMapping("/all")
    public Iterable<Car> getAll(){
        return cars.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getByid(@PathVariable("id") Integer id){
        return cars.findById(id);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car){
        return cars.save(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car){
        return cars.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable("id") Integer id){
        cars.deleteById(id);
    }
}
