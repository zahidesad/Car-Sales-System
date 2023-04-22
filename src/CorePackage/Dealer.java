package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Dealer extends User {

    private ArrayList<Car> listedCars = new ArrayList();

    public ArrayList<Car> getListedCars() {
        return listedCars;
    }

    static int newid = 400;
    private int id = 0;

    public Dealer(String username, String pass, String name, String email, String phone) {
        super(username, pass, name, email, phone);
        id = newid++;

    }

    public Dealer() {

    }

    public void removeCar(int Id) {
        Car selectedCar = null;

        for (Car vehicle : Database.getCars()) {
            if (Id == vehicle.getId()) {
                selectedCar = vehicle;
                break;
            }
        }
        Database.getCars().remove(selectedCar);
        listedCars.remove(selectedCar);

        if (selectedCar != null && selectedCar.getCustomer() != null) {
            selectedCar.getCustomer().getListedCars().remove(selectedCar);
        }

    }

    public void cancelAllOrder() {

        for (Car listedCar : listedCars) {
            if (listedCar.getRegister().equals(Car.accepted) || listedCar.getRegister().equals(Car.denied)) {
                return;
            }
            Database.getCars().remove(listedCar);

            if (listedCar != null && listedCar.getCustomer() != null) {
                listedCar.getCustomer().getListedCars().remove(listedCar);
            }
        }

    }

    public void acceptRequest(int CarID) {
        for (Car listedVehicle : listedCars) {
            if (listedVehicle.getId() == CarID) {
                listedVehicle.setRegister(Car.accepted);
                
            }
        }
    }

    public void denyRequest(int CarID) {
        for (Car listedCar : listedCars) {
            if (listedCar.getId() == CarID) {
                Car vehicle = new Car(listedCar.getId(), listedCar.getDealer(), listedCar.getCustomer(), listedCar.getBrand(), listedCar.getModel(),
                        listedCar.getColor(), listedCar.getType(), listedCar.getFuel(), listedCar.getYear(), listedCar.getPrice());
                listedCar.setRegister(Car.available);
                vehicle.setRegister(Car.denied);
                listedCar.getCustomer().getListedCars().add(vehicle);
                listedCar.setCustomer(null);
            }
        }
    }

    public int getId() {
        return id;
    }

}
