package JPA_Classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author zahid
 */
@Entity
@DiscriminatorValue("Dealer")
public class Dealer extends Users{

}
