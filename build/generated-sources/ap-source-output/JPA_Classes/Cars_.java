package JPA_Classes;

import JPA_Classes.Sales;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-02T14:12:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cars.class)
public class Cars_ { 

    public static volatile SingularAttribute<Cars, String> color;
    public static volatile SingularAttribute<Cars, String> fuel;
    public static volatile SingularAttribute<Cars, Integer> price;
    public static volatile ListAttribute<Cars, Sales> salesList;
    public static volatile SingularAttribute<Cars, String> model;
    public static volatile SingularAttribute<Cars, Integer> id;
    public static volatile SingularAttribute<Cars, String> type;
    public static volatile SingularAttribute<Cars, String> brand;
    public static volatile SingularAttribute<Cars, Integer> age;

}