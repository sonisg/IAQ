package service;

import dao.VehicleDao;
import model.Car;
import model.CarType;
import model.Reserve;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    VehicleDao vehicleDao = new VehicleDao();

    public void addCars(Car car){
        car.setAvailable(true);
        vehicleDao.getCarList().add(car);
    }

    public List<Car> getAllAvailableCars(){
        List<Car> availableCars = new ArrayList<>();
        for(Car vehicleDao1: vehicleDao.getCarList()) {
            if (Boolean.TRUE.equals(vehicleDao1.isAvailable())) {
                availableCars.add(vehicleDao1);
                System.out.println("Vehicle "+ vehicleDao1.getCar_name() + " Available" );
            }
        }
        return availableCars;
    }

    public Integer getRateOfVehiclePerHrPerKm(Car car){
        if(car.getCarType().equals(CarType.SUV)){
            return 20;
        } else if(car.getCarType().equals(CarType.HATCHBACK)){
            return 50;
        } else{
            return 30;
        }
    }

}
