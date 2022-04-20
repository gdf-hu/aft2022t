/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft2022t;

import java.util.*;

/**
 *
 * @author Dani
 */
public class Dobokocka {
    
    private static int KockaOldal;
    private static int KockaDarab;
    private static ArrayList<Integer> Dobasok = new ArrayList<Integer>();

    public static int getKockaOldal() {
        return KockaOldal;
    }

    public static void setKockaOldal(int KockaOldal) {
        Dobokocka.KockaOldal = KockaOldal;
    }

    public static int getKockaDarab() {
        return KockaDarab;
    }

    public static void setKockaDarab(int KockaDarab) {
        Dobokocka.KockaDarab = KockaDarab;
    }
    
    public Dobokocka (int oldal){
        this.KockaOldal=oldal;
        this.KockaDarab=1;
    }
    
    public Dobokocka (int oldal,int darab){
        this.KockaOldal=oldal;
        this.KockaDarab=darab;
    }
    
    public static int dobas(int oldal){
        int min = 1;
        int max = Dobokocka.KockaOldal;
        Random rnd = new Random();
        Dobokocka.Dobasok.add(rnd.nextInt(max-min+1));
        return rnd.nextInt(max-min+1);
    }
}
