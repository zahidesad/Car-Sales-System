package JPA_Classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author zahid
 */
@Entity
@DiscriminatorValue("Customer")
public class Customer extends Users {

}
