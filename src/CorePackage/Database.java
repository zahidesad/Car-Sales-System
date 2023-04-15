package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Database {

//  ################# ArrayLists Declerations #################
    private static final ArrayList<User> users = new ArrayList<>();
    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();

//  ################# Encapsulate ArrayLists #################
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

//  ################# Methods #################
    public static User loginVerification(String username, String password) {
        User account = null;
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPass().equals(password)) {
                account = user;
                break;
            }
        }

        return account;
    }

    public static boolean checkUsername(String username) {
        boolean flag = false;
        for (User user : Database.getUsers()) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //to delete all vehicles of given dealer
    public void deleteAllVehicle(Dealer dealer) {
        for (int i = 0; i < getVehicles().size(); i++) {
            if (getVehicles().get(i).getDealer().equals(dealer)) {
                getVehicles().remove(getVehicles().get(i));

                if (getVehicles().get(i).getRegister().equals(Vehicle.available)) {
                    dealer.getListedVehicles().remove(getVehicles().get(i));
                    break;
                }
            }

        }
    }

}
