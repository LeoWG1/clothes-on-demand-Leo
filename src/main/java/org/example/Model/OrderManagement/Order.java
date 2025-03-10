package org.example.Model.OrderManagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Order {
    private long id;
    private String name;
    private String status; // Attribute for Observer
    // Observer-pattern
    private final PropertyChangeSupport propertyChangeSupport;

    public Order(){
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

            this.propertyChangeSupport.firePropertyChange("Order Status:", null, this.status);
    }
}
