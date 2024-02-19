package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class VehicleDao {

    private List<Car> carList;

    public VehicleDao() {
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
