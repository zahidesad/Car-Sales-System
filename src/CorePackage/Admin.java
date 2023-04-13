package CorePackage;

/**
 *
 * @author zahid
 */
public class Admin extends User {

    public Admin(String username, String pass, String name, String email, String phone) {
        super(username, pass, name, email, phone);
    }

    public void deleteUserAccount(String username) {
        for (User user : Database.getUsers()) {
            if (user instanceof Dealer dealer) {
                if (username.equalsIgnoreCase(user.getUsername())) {
                    Database.getUsers().remove(user);
                    dealer.cancelAllOrder();
                }
            } else if (user instanceof Customer customer) {
                if (username.equalsIgnoreCase(user.getUsername())) {
                    Database.getUsers().remove(user);
                    customer.cancelAllOrder();
                }
            }
        }
    }

}
