package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Dealer extends User {

    private ArrayList<Vehicle> listedVehicles = new ArrayList();

    public ArrayList<Vehicle> getListedVehicles() {
        return listedVehicles;
    }

    static int newid = 400;
    private int id = 0;

    public Dealer(String username, String pass, String name, String email, String phone) {
        super(username, pass, name, email, phone);
        id = newid++;

    }

    public Dealer() {

    }

    public void removeVehicle(int Id) {
        Vehicle selectedVehicle = null;

        for (Vehicle vehicle : Database.getVehicles()) {
            if (Id == vehicle.getId()) {
                selectedVehicle = vehicle;
                break;
            }
        }
        Database.getVehicles().remove(selectedVehicle);
        listedVehicles.remove(selectedVehicle);

        if (selectedVehicle != null && selectedVehicle.getCustomer() != null) {
            selectedVehicle.getCustomer().getListedVehicles().remove(selectedVehicle);
        }

    }

    public void cancelAllOrder() {

        for (Vehicle listedVehicle : listedVehicles) {
            if (listedVehicle.getRegister().equals(Vehicle.accepted) || listedVehicle.getRegister().equals(Vehicle.denied)) {
                return;
            }
            Database.getVehicles().remove(listedVehicle);

            if (listedVehicle != null && listedVehicle.getCustomer() != null) {
                listedVehicle.getCustomer().getListedVehicles().remove(listedVehicle);
            }
        }

    }

    public void acceptRequest(int VehicleID) {
        for (Vehicle listedVehicle : listedVehicles) {
            if (listedVehicle.getId() == VehicleID) {
                listedVehicle.setRegister(Vehicle.accepted);
                
            }
        }
    }

    public void denyRequest(int VehicleID) {
        for (Vehicle listedVehicle : listedVehicles) {
            if (listedVehicle.getId() == VehicleID) {
                Vehicle vehicle = new Vehicle(listedVehicle.getId(), listedVehicle.getDealer(), listedVehicle.getCustomer(), listedVehicle.getBrand(), listedVehicle.getModel(),
                        listedVehicle.getColor(), listedVehicle.getType(), listedVehicle.getFuel(), listedVehicle.getYear(), listedVehicle.getPrice());
                listedVehicle.setRegister(Vehicle.available);
                vehicle.setRegister(Vehicle.denied);
                listedVehicle.getCustomer().getListedVehicles().add(vehicle);
                listedVehicle.setCustomer(null);
            }
        }
    }

    public int getId() {
        return id;
    }

}
