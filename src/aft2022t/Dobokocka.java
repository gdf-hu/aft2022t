/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft2022t;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Dani
 */
public class Dobokocka {

    private static int KockaOldal = 6;
    private static int KockaDarab = 1;

    // [0] = dobasok, [1] = dátum
    private static ArrayList<String[]> Dobasok = new ArrayList<>();
    private static ArrayList<String> JelenlegiDobasok = new ArrayList<>();
    private static int HanyadikDobas;

    /**
     *
     * @return hányszor akarunk dobni
     */
    public static ArrayList<String[]> getDobasok() {
        return Dobasok;
    }

    /**
     *
     * @return éppen hanyadik dobásnál tartunk
     */
    public static int getHanyadikDobas() {
        return HanyadikDobas;
    }

    /**
     *
     * @return hány oldala van a kockának
     */
    public static int getKockaOldal() {
        return KockaOldal;
    }

    /**
     *
     * @param KockaOldal
     */
    public static void setKockaOldal(int KockaOldal) {
        Dobokocka.KockaOldal = KockaOldal;
    }

    /**
     *
     * @return hány darab kockával akarunk dobni
     */
    public static int getKockaDarab() {
        return KockaDarab;
    }

    /**
     *
     * @param KockaDarab beállítjuk hány kockával akarunk dobni
     */
    public static void setKockaDarab(int KockaDarab) {
        Dobokocka.KockaDarab = KockaDarab;
    }

    /**
     *
     * @param oldal init kocka hány oldala legyen darabszám default 1
     */
    public Dobokocka(int oldal) {
        this.KockaOldal = oldal;
        this.KockaDarab = 1;
    }

    /**
     *
     * @param oldal hány oldala legyen a kockának
     * @param darab hány darab kockával akarunk dobni
     */
    public Dobokocka(int oldal, int darab) {
        this.KockaOldal = oldal;
        this.KockaDarab = darab;
    }

    /**
     *
     * @return lista ami tárolja a dobásokat
     * @throws InterruptedException várakozik 100-300 milisecond között
     */
    public static ArrayList<Integer> dobas() throws InterruptedException {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int min = 1;
        int max = Dobokocka.KockaOldal;
        Random rnd = new Random();
        for (int i = 0; i < Dobokocka.KockaDarab; i++) {
            Thread.sleep(rnd.nextLong(300 - 100) + 100);
            lista.add(rnd.nextInt(max - min + 1) + min);
        }

        return lista;
    }

    /**
     *
     * @return 1től a kockaoldalszámának értéke közötti random értéket
     * @throws InterruptedException
     */
    public static int dob() throws InterruptedException {
        int min = 1;
        int max = Dobokocka.KockaOldal;
        Random rnd = new Random();
        int dobottSzam = rnd.nextInt(max - min + 1) + min;
        Thread.sleep(rnd.nextLong(300 - 100) + 100);
        JelenlegiDobasok.add(String.valueOf(dobottSzam));

        HanyadikDobas++;

        if (HanyadikDobas == KockaDarab) {
            String[] tömb = new String[2];
            tömb[0] = String.join("", JelenlegiDobasok);

            tömb[1] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
            Dobasok.add(tömb);
            JelenlegiDobasok.clear();

            System.out.println("Eddigi dobások:");
            for (int i = 0; i < Dobasok.size(); i++) {
                System.out.println(Arrays.toString(Dobasok.get(i)));
            }

            HanyadikDobas = 0;
        }

        return dobottSzam;
    }
}
