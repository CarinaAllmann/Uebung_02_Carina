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
public class Mensch 
{
    Mensch(){}
            
    private String vorname;
    private String nachname;
    private int alter;

    public Mensch(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    
    public void status()
    {
        System.out.println("Dieser Mensch heißt "+ getVorname()+" " + getNachname()+" und ist "+getAlter()+" Jahr alt");  
    }
    
}
