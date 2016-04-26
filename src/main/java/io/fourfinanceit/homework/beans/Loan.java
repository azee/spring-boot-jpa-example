package io.fourfinanceit.homework.beans;


import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.*;

/**
 * Created by azee on 25.04.16.
 */
@Entity
public class Loan {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private int amount;

    @ManyToOne(optional = false)
    private User user;

    public Loan() {
    }

    public Loan(long id, int amount, User user) {
        this.id = id;
        this.amount = amount;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
