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
public class Aufruf 
{
    
    //https://netbeans.org/kb/docs/ide/git.html GIT repository erstellen
    public static void main (String[] args)
    {
        Mensch frau = new Mensch("Julia", 19, "weiblich");
        
        System.out.println(frau.printAll());
    }
    
}
