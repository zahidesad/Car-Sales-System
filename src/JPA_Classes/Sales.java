package JPA_Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author zahid
 */
@Entity
@Table(name = "SALES")
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findById", query = "SELECT s FROM Sales s WHERE s.id = :id"),
    @NamedQuery(name = "Sales.findByStatus", query = "SELECT s FROM Sales s WHERE s.status = :status")})
public class Sales implements Serializable {

    public final static String PENDING = "Pending";
    public final static String ACCEPTED = "Accepted";
    public final static String AVAILABLE = "Available";
    public final static String DENIED = "Denied";

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Cars carId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Customer customerId;
    @JoinColumn(name = "DEALER_ID", referencedColumnName = "ID")
    @ManyToOne()
    private Dealer dealerId;

    public Sales() {
    }

    public Sales(Cars carId, Dealer dealerId, Customer customerId, String status) {
        this.carId = carId;
        this.dealerId = dealerId;
        this.customerId = customerId;
        this.status = status;
    }

    public Sales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cars getCarId() {
        return carId;
    }

    public void setCarId(Cars carId) {
        this.carId = carId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Dealer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Dealer dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dealer = " + dealerId + ", Customer = " + customerId + ", Car = " + carId;
    }

}
