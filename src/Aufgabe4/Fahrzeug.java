/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4;

/**
 *
 * @author Carina Allmann
 */
public class Fahrzeug 
{
     public Fahrzeug(short reifen, short ps,short tueren)
   {     
      this.reifen = reifen;
       this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindkeit = 0;
   }
   
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindkeit;
    public static int anzahl; //erhöht die Anzahl bei jeder Benützung um 1


    public short getReifen() {
        return reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public short getPs() {
        return ps;
    }

    public short getTueren() {
        return tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getGeschwindkeit() {
        return geschwindkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setGeschwindkeit(short geschwindkeit) {
        this.geschwindkeit = geschwindkeit;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }

    
    public void starten()
    {
        gestartet = true;
    }
    
    public void stoppen()
    {
        gestartet = false;
    }
    public void beschleunigen (   short g)
    {
       if (gestartet = true) 
       {
           if (geschwindkeit + g <= 250)
           {
               geschwindkeit += g;
           }           
       }
    }
       
     public void bremsen ( short g)
      {
          if (gestartet = true)
          {
              if (geschwindkeit -g > 0)
              geschwindkeit -= g;
          }
      }
     
}
