/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borrow_app;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author max
 */
public class Borrow_App {

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        
        FlatLaf.registerCustomDefaultsSource("Borrow_App");
        FlatLightLaf.setup();
       
            UIManager.put("Component.arc", 10); 
            UIManager.put("Button.arc", 10);   
            UIManager.put("TextComponent.arc", 10); 

        UIManager.put("TableHeader.background", new Color(16,42,67));
        UIManager.put("TableHeader.foreground", Color.white);
        UIManager.put("Table.alternateRowColor", new Color(240,240,240));
        
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
}
