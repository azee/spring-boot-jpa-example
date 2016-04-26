package io.fourfinanceit.homework.beans;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

/**
 * Created by azee on 25.04.16.
 */
@Entity
public class User {

    @Id
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private long lastAccess;

    @Column(nullable = false)
    @NaturalId
    private long lastApi;

    @OneToMany
    private List<Loan> loans;

    public User(String id, String firstName, String lastName, long lastAccess, long lastApi, List<Loan> loans) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastAccess = lastAccess;
        this.lastApi = lastApi;
        this.loans = loans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(long lastAccess) {
        this.lastAccess = lastAccess;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public long getLastApi() {
        return lastApi;
    }

    public void setLastApi(long lastApi) {
        this.lastApi = lastApi;
    }
}
