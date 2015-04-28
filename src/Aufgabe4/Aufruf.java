/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Carina Allmann
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Auto audi2 = new Auto((short)4,(short) 130, (short)5, (short) 4);
        Auto audi3 = new Auto((short)4, (short) 100, (short)5, (short) 4);
        Auto audi4 = new Auto((short)4, (short) 90, (short)5, (short) 4);
        Auto bmw = new Auto((short)4, (short) 150, (short)5, (short) 4);
        Auto audi = new Auto((short)4,(short) 160, (short)5, (short) 4);
    
        ArrayList <Auto> liste = new ArrayList<>();
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi);
        liste.add(audi4);
        liste.add(audi3);
        
        Collections.sort(liste);
        for(Auto a : liste)
        {
            System.out.println(a.getPs());
        }
    }
    
}
