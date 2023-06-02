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
@DiscriminatorValue("Dealer")
public class Dealer extends Users {

    @OneToMany(mappedBy = "dealerId")
    private List<Sales> salesList;

    public Dealer() {
    }

    public Dealer(String name, String username, String password, String email, Integer phone) {
        super(name, username, password, email, phone);
    }

    public List<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sales> salesList) {
        this.salesList = salesList;
    }
}
