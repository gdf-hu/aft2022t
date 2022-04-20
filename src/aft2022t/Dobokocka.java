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

    private static int KockaOldal = 6;
    private static int KockaDarab = 1;

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

    public Dobokocka(int oldal) {
        this.KockaOldal = oldal;
        this.KockaDarab = 1;
    }

    public Dobokocka(int oldal, int darab) {
        this.KockaOldal = oldal;
        this.KockaDarab = darab;
    }

    public static ArrayList<Integer> dobas() throws InterruptedException {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int min = 1;
        int max = Dobokocka.KockaOldal;
        Random rnd = new Random();
        for (int i = 0; i < Dobokocka.KockaDarab; i++) {
            Thread.sleep(rnd.nextLong(300-100)+100);
            lista.add(rnd.nextInt(max - min + 1)+min);
        }

        return lista;
    }
}
