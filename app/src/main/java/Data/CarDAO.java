package Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

@Dao
public interface CarDAO {

    @Insert
    long addCar(Car car);

    @Update
    void updateCar(Car car);

    @Delete
    void deleteCar(Car car);

    @Query("select * from cars")
    List<Car> getAllCars();

    @Query("select * from cars where car_id ==:carId")
    Car getCar(long carId);
}
