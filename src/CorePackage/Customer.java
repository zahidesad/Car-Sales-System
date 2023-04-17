package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Customer extends User {

    private ArrayList<Vehicle> listedVehicles = new ArrayList();

    public ArrayList<Vehicle> getListedVehicles() {
        return listedVehicles;
    }

    private boolean flagForBuyVehicle = false;

    static int newId = 300;
    int id = 0;

    public Customer(String username, String pass, String name, String email, String phone) {
        super(username, pass, name, email, phone);
        id = newId++;

    }

    public Customer() {

    }

    public void buyVehicle(int vehicleID) {

        for (Vehicle vehicle : Database.getVehicles()) {
            if (vehicle.getId() == vehicleID && !vehicle.getRegisterForCustomer().equals(Vehicle.denied)) {
                vehicle.setRegister(Vehicle.pending);
                vehicle.setRegisterForCustomer(Vehicle.pending);
                vehicle.setCustomer(this);
                this.listedVehicles.add(vehicle);
                setFlagForBuyVehicle(false);
                break;
            } else {
                setFlagForBuyVehicle(true);
                break;
            }
        }

    }

    public void cancelOrder(int VehicleId) {
        for (int i = 0; i < listedVehicles.size(); i++) {
            if (listedVehicles.get(i).getId() == VehicleId) {
                listedVehicles.get(i).setCustomer(null);
                listedVehicles.get(i).setRegister(Vehicle.available);
                listedVehicles.remove(listedVehicles.get(i));
                break;
            }
        }
    }

    public void cancelAllOrder() {
        for (Vehicle listedVehicle : listedVehicles) {
            listedVehicle.setCustomer(null);
            listedVehicle.setRegister(Vehicle.available);

        }

    }

    public int getId() {
        return id;
    }

    public boolean isFlagForBuyVehicle() {
        return flagForBuyVehicle;
    }

    public void setFlagForBuyVehicle(boolean flagForBuyVehicle) {
        this.flagForBuyVehicle = flagForBuyVehicle;
    }
}
