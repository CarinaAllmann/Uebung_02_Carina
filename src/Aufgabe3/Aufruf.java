/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author Carina Allmann
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Mensch eins = new Mensch("Carina", "Allmann", 20);
        eins.status();
        
        eins = new Student(1410653052, "WEB 14", "Carina", "Allmann", 20);
        eins.status();
    }
    
}
