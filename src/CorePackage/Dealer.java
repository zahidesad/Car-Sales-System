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

    public void removeVehicle(String Id) {
        Vehicle selectedVehicle = null;

        for (Vehicle vehicle : Database.getVehicles()) {
            if (Id.equals(vehicle.getId())) {
                selectedVehicle = vehicle;
                break;
            }
        }
        Database.getVehicles().remove(selectedVehicle);
        listedVehicles.remove(selectedVehicle);

        if (selectedVehicle != null) {
            selectedVehicle.getCustomer().getListedVehicles().remove(selectedVehicle);
        }

    }

    public void cancelAllOrder() {
        for (Vehicle listedVehicle : listedVehicles) {
            Database.getVehicles().remove(listedVehicle);

            if (listedVehicle != null) {
                listedVehicle.getCustomer().getListedVehicles().remove(listedVehicle);
            }
        }

    }

    public void acceptRequest(int VehicleID) {
        for (Vehicle listedVehicle : listedVehicles) {
            if (listedVehicle.getId() == VehicleID) {
                listedVehicle.setRegister(Vehicle.accepted);
                Database.getVehicles().remove(listedVehicle);
            }
        }
    }

    public void denyRequest(int VehicleID) {
        for (Vehicle listedVehicle : listedVehicles) {
            if (listedVehicle.getId() == VehicleID) {
                listedVehicle.setRegister(Vehicle.available);
                listedVehicle.setCustomer(null);
            }
        }
    }

    public int getId() {
        return id;
    }

}
