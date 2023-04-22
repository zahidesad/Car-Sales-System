package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Database {

//  ################# ArrayLists Declerations #################
    private static final ArrayList<User> users = new ArrayList<>();
    private static final ArrayList<Car> cars = new ArrayList<>();

//  ################# Encapsulate ArrayLists #################
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<Car> getCars() {
        return cars;
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

    //to delete all cars of given dealer
    public static void deleteAllCars(Dealer dealer) {
        for (int i = 0; i < getCars().size(); i++) {
            if (getCars().get(i).getDealer().equals(dealer) && !getCars().get(i).getRegister().equals(Car.accepted)) {
                getCars().remove(getCars().get(i));

                if (getCars().get(i).getRegister().equals(Car.available)) {
                    dealer.getListedCars().remove(getCars().get(i));
                    break;
                }
            }

        }
    }

}
