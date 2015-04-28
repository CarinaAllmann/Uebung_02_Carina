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
public class Sauugetier 
{
    Sauugetier(){ }
    private String name;
    private int alter;
    private String geschlecht;

    public Sauugetier(String name, int alter, String geschlecht) 
    {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    
    
    public String printAll()
    {
        return (getName()+"#"+getAlter()+"#"+getGeschlecht());
        
    }
    
}
