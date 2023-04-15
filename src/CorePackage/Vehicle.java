package CorePackage;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Vehicle {

    public final static String vehicleBrand[] = {"Togg", "Volkswagen", "Nissan", "Ford", "Toyata",
        "Honda", "Chevrolet", "Hyundai", "Renault", "Skoda", "Fiat", "Tata",
        "Jeep", "Ferrari", "Lamborghini", "Bugatti", "BMW", "Maruti", "Tesla"};

    public final static String vehicleType[] = {"Hatchback", "Sedan", "MPV", "SUV", "Convertible",
        "Pickup", "Coupe"};

    public final static String vehicleFuelType[] = {"Petrol", "Diesel", "Hybrid", "Electric"};

    public final static String pending = "Pending";
    public final static String accepted = "Accepted";
    public final static String available = "Available";
    private String register = available;

    private Dealer dealer;
    private Customer customer;
    private String brand;
    private String model;
    private String color;
    private String type;
    private String fuel;
    private String year;
    private String price;
    static int newId = 100;
    private int id = 0;

    public Vehicle(Dealer dealer, Customer customer, String brand, String model, String color, String type, String fuel, String year, String price) {
        this.dealer = dealer;
        this.customer = customer;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.fuel = fuel;
        this.year = year;
        this.price = price;
        id = newId++;
    }

    public void removeVehicle() {
        Database.getVehicles().remove(this);
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

}