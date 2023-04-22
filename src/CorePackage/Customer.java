package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Customer extends User {

    private ArrayList<Car> listedCars = new ArrayList();

    public ArrayList<Car> getListedCars() {
        return listedCars;
    }

    private boolean flagForBuyCar = false;

    static int newId = 300;
    int id = 0;

    public Customer(String username, String pass, String name, String email, String phone) {
        super(username, pass, name, email, phone);
        id = newId++;

    }

    public Customer() {

    }

    public void buyCar(int carID) {
        for (Car car : Database.getCars()) {
            if (car.getId() == carID) {
                if (this.listedCars.contains(car)) {
                    for (Car listedCar : listedCars) {
                        if (listedCar.getId() == car.getId() && listedCar.getRegister().equals(Car.denied)) {
                            setFlagForBuyCar(true);
                            return;
                        }
                    }
                }
                car.setRegister(Car.pending);
                car.setCustomer(this);
                this.listedCars.add(car);
                setFlagForBuyCar(false);
                break;
            }
        }

    }

    public void cancelOrder(int carID) {
        for (int i = 0; i < listedCars.size(); i++) {
            if (listedCars.get(i).getId() == carID) {
                listedCars.get(i).setCustomer(null);
                listedCars.get(i).setRegister(Car.available);
                listedCars.remove(listedCars.get(i));
                break;
            }
        }
    }

    public void cancelAllOrder() {
        for (Car listedCar : listedCars) {
            listedCar.setCustomer(null);
            if (!listedCar.getRegister().equals(Car.accepted)) {
                listedCar.setRegister(Car.available);
            }

        }

    }

    public int getId() {
        return id;
    }

    public boolean isFlagForBuyCar() {
        return flagForBuyCar;
    }

    public void setFlagForBuyCar(boolean flagForBuyCar) {
        this.flagForBuyCar = flagForBuyCar;
    }
}
