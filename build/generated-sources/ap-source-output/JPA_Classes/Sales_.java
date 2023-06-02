package JPA_Classes;

import JPA_Classes.Cars;
import JPA_Classes.Customer;
import JPA_Classes.Dealer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-02T14:12:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Dealer> dealerId;
    public static volatile SingularAttribute<Sales, Customer> customerId;
    public static volatile SingularAttribute<Sales, Integer> id;
    public static volatile SingularAttribute<Sales, String> status;
    public static volatile SingularAttribute<Sales, Cars> carId;

}