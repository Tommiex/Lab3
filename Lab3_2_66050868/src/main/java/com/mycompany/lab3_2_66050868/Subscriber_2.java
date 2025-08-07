/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_2_66050868;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author tommi
 */
public class Subscriber_2 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
         System.out.println(evt.getNewValue());
    }
    
}
