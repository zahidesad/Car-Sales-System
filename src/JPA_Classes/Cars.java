package JPA_Classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author zahid
 */
@Entity
@Table(name = "CARS")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c"),
    @NamedQuery(name = "Cars.findById", query = "SELECT c FROM Cars c WHERE c.id = :id"),
    @NamedQuery(name = "Cars.findByBrand", query = "SELECT c FROM Cars c WHERE c.brand = :brand"),
    @NamedQuery(name = "Cars.findByModel", query = "SELECT c FROM Cars c WHERE c.model = :model"),
    @NamedQuery(name = "Cars.findByColor", query = "SELECT c FROM Cars c WHERE c.color = :color"),
    @NamedQuery(name = "Cars.findByType", query = "SELECT c FROM Cars c WHERE c.type = :type"),
    @NamedQuery(name = "Cars.findByFuel", query = "SELECT c FROM Cars c WHERE c.fuel = :fuel"),
    @NamedQuery(name = "Cars.findByAge", query = "SELECT c FROM Cars c WHERE c.age = :age"),
    @NamedQuery(name = "Cars.findByPrice", query = "SELECT c FROM Cars c WHERE c.price = :price")})
public class Cars implements Serializable {

    public final static String[] carBrand = {"Togg", "Volkswagen", "Nissan", "Ford", "Toyata",
        "Honda", "Chevrolet", "Hyundai", "Renault", "Skoda", "Fiat", "Tata",
        "Jeep", "Ferrari", "Lamborghini", "Bugatti", "BMW", "Maruti", "Tesla"};

    public final static String[] carType = {"Hatchback", "Sedan", "MPV", "SUV", "Convertible",
        "Pickup", "Coupe"};

    public final static String[] carFuelType = {"Petrol", "Diesel", "Hybrid", "Electric"};

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "FUEL")
    private String fuel;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "PRICE")
    private Integer price;
    @OneToMany(mappedBy = "carId", cascade = CascadeType.REMOVE)
    private List<Sales> salesList;

    public Cars() {
    }

    public Cars(String brand, String model, String color, String type, String fuel, Integer age, Integer price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.fuel = fuel;
        this.age = age;
        this.price = price;
    }

    public Cars(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sales> salesList) {
        this.salesList = salesList;
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
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return model;
    }

}
