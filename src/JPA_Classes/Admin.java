package JPA_Classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author zahid
 */
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Users{

}
