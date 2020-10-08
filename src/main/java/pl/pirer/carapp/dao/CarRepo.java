package pl.pirer.carapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pirer.carapp.dao.entity.Car;

@Repository
public interface CarRepo extends CrudRepository<Car, Integer> {
}
