package org.example.Model.People;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CEO implements PropertyChangeListener {
    private long id;
    private String name;

    public CEO(){}

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Meddelande till VD: " + evt.getNewValue());
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
}
