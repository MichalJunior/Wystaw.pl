package pl.it.portfolio.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "tproduct")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany
    private Set<Order> orders = new HashSet<>();
    private String name;
    private int prize;
    private int quantity;
    private String description;
    @Enumerated(EnumType.STRING)
    private Localization localization;
    @Enumerated(EnumType.STRING)
    private State state;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Delivety delivery;

    public Product(int id, Delivety delivery, Set<Order> orders, String name, int prize,
                   int quantity, String description, Localization localization, State state, Category category) {
        this.delivery=delivery;
        this.id = id;
        this.orders = orders;
        this.name = name;
        this.prize = prize;
        this.quantity = quantity;
        this.localization = localization;
        this.description = description;
        this.state = state;
        this.category = category;
    }


    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public Localization getLocalization() {
        return localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public enum Localization {
        WARSZAWA,
        KRAKOW,
        LODZ,
        POZNAN,
        GDANSK,
        SZCZECIN,
        BYDGOSZCZ,
        KATOWICE,
        GDYNIA,
        CZESTOCHOWA,
        RADOM,
        RZESZOW;

    }
    public enum Delivety {
        INPOST,
        ABROAD,
        COURIER;
    }

    public enum State {
        NEW,
        USED,
        DAMAGED
    }

    public enum Category {
        ELEKTRONIA,
        MODA,
        DZIECKO,
        SPUERMARKET,
        DOMIOGROD,
        URODA,
        ZDROWIE,
        KULTURAIROZRYWKA,
        SPORTITURYSTYKA,
        MOTORYZACJA,
        NIERUCHOMOSCI,
        KOLEKCJEISZTUKA,
        RIRMAIUSLUGI
    }

}
