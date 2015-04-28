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
public class Auto extends Fahrzeug implements Comparable < Auto> 
{
    private boolean klimaanlage;
    private short aribags;
    private color farbe;
    
    public enum color //Aufgabe 5
    {
        silver, red, black, blue, white;
    }


    public Auto( short reifen, short ps, short tueren, short aribags) 
    {
        super(reifen, ps, tueren);
        this.klimaanlage = false;
        this.aribags = aribags;
        this.farbe = color.black;
        anzahl ++;
    }
    
  

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public short getAribags() {
        return aribags;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public void setAribags(short aribags) {
        this.aribags = aribags;
    }
    
    public void klimaanlageAn()
    {
       if(klimaanlage == false)
       {
           klimaanlage = true;
       }
       else
       {
           System.out.println("Klimaanlage läuft bereits!");
       }
    }
    
    public void klimaanlageAus()
    {
        if (klimaanlage == true)
        {
            klimaanlage = false;
        }
        else 
        {
             System.out.println("Klimaanlage ist bereits aus!");
        }
    }

    @Override
    public String toString() {
    return ("Mein Auto hat "+ getPs()+ " und fährt mit "+getGeschwindkeit());
    }
    
   

    @Override
    public int compareTo(Auto o) //Aufgabe 4
    {
       
       if (this.getPs() < o.getPs()) //
       {
           return 1;
       }
       
       if (this.getPs() > o.getPs())
       {
           return -1;
       }
       else
       {
           return 0;
       }
    }

}
