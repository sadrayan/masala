package com.sonic.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by sadra on 11/1/14.
 */
@Entity
@Table(name="meal")
public class Meal {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int customer_id;
    private Date date;
    private int quantity;
    private Integer rating;
    private Timestamp ordered_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Timestamp getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(Timestamp ordered_at) {
        this.ordered_at = ordered_at;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", date=" + date +
                ", quantity=" + quantity +
                ", rating=" + rating +
                ", ordered_at=" + ordered_at +
                '}';
    }
}
