package JPA_Classes;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author zahid
 */
@Entity
@DiscriminatorValue("Customer")
public class Customer extends Users {

    @OneToMany(mappedBy = "customerId")
    private List<Sales> salesList;

    public Customer() {
    }

    public Customer(String name, String username, String password, String email, Integer phone) {
        super(name, username, password, email, phone);

    }

    public List<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sales> salesList1) {
        this.salesList = salesList1;
    }
}
