package CorePackage;

/**
 *
 * @author zahid
 */
public class User {

    private String username;
    private String pass;
    private String name;
    private String email;
    private String phone;

    public User(String username, String pass, String name, String email, String phone) {
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }

    public User findUser(int id) {

        User foundedPerson = null;
        for (User user : Database.getUsers()) {
            if (user instanceof Customer customer ) {
                if (customer.getId() == id) {
                    foundedPerson = user;
                    break;
                }
            } else if (user instanceof Dealer dealer) {
                if (dealer.getId() == id) {
                    foundedPerson = user;
                    break;
                }
            }
        }
        return foundedPerson;
    }

    public void deleteAccount() {
        Database.getUsers().remove(this);
        if (this instanceof Customer user) {
            user.cancelAllOrder();
        } else if (this instanceof Dealer user) {
            user.cancelAllOrder();
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
