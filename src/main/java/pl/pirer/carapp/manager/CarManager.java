package pl.pirer.carapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.pirer.carapp.dao.CarRepo;
import pl.pirer.carapp.dao.entity.Car;

import java.util.Optional;

@Service
public class CarManager {

    private CarRepo carRepo;

    @Autowired
    public CarManager(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Optional<Car> findById(Integer id){
        return carRepo.findById(id);
    }

    public Iterable<Car> findAll(){
        return carRepo.findAll();
    }

    public Car save(Car car){
        return carRepo.save(car);
    }

    public void deleteById(Integer id){
        carRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Car(1,"BMW",306));
        save(new Car(2,"Audi",254));
    }

}
