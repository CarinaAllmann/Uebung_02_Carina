/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

/**
 *
 * @author Carina Allmann
 */
public class Mensch extends Sauugetier
{

    public Mensch() {
    }

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    
    
    
    
    
    public String printAll()
    {
        return (getName()+"#"+getAlter()+"#"+getGeschlecht());
        
    }
}
