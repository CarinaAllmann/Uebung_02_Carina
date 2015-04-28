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
public class Student extends Mensch
{
    private int martrikelnummer;
    private String studiengang;

       public Student(int martrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.martrikelnummer = martrikelnummer;
        this.studiengang = studiengang;
        
        
        
        
    }

    public int getMartrikelnummer() {
        return martrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setMartrikelnummer(int martrikelnummer) {
        this.martrikelnummer = martrikelnummer;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    @Override
    public void status() {
      System.out.println("Dieser Student heißt "+ getVorname()+" " + getNachname()+" und ist "+getAlter()+" Jahr alt, studiert " +getStudiengang()+" Matrikelnummer: "+getMartrikelnummer());  
    }
    
}
