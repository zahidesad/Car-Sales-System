package JPA_Classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author zahid
 */
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Users {

    public Admin() {
    }

    public Admin(String name, String username, String password, String email, Integer phone) {
        super(name, username, password, email, phone);

    }
}
