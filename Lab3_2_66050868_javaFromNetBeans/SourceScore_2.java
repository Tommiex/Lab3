/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package com.mycompany.lab3_2_66050868;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author tommi
 */
public class SourceScore_2 implements Serializable {
    
    public static final String SCORELINE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public SourceScore_2() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getscoreLine() {
        return scoreLine;
    }
    
    public void setscoreLine(String value) {
        String oldValue = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
