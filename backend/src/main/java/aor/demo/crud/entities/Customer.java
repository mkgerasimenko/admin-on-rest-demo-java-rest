package aor.demo.crud.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Where(clause="published=1")
@TableGenerator(name="customer", initialValue=0, allocationSize=50)
public class Customer {
    @Id @GeneratedValue(strategy=GenerationType.TABLE, generator="customer")
    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String birthday;
    public String address;
    public String zipcode;
    public String city;
    public String avatar;
    public String firstSeen;
    public String lastSeen;
    public boolean hasNewsLetter;
    //TODO latest purchase
    //TODO groups
    public int nbCommands;
    public double totalSpent;
    public boolean published = true;

    public Customer() {}

    @JsonCreator
    public Customer(int id) {
        this.id = id;
    }
}