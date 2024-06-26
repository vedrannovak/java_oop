/*
 **********************************************************
 *                                                        *
 *       Objektno-orijentirano programiranje u Javi.      *
 *                                                        *
 *             Copyright © 2024 Vedran Novak              *
 *                  www.vedrannovak.com                   *
 *                                                        *
 **********************************************************
 */

import java.util.ArrayList;

/**
 * P0772 Klasa ArrayList i neke metode klase ArrayList za rad sa podacima.
 */
class P0772 {

    public static void main(String[] args) {

        ArrayList<String> mojaLista = new ArrayList<String>();

        String str = " je";
        mojaLista.add("Java");
        mojaLista.add(str);
        mojaLista.add(str + "stiva.");

        System.out.println("Nakon dodavanja: " + mojaLista);

        System.out.println("Da li sadrži \" je\"? " + mojaLista.contains(str));
        System.out.println("Da li sadrži \"Java\"? " + mojaLista.contains("Java"));

        mojaLista.remove(str);
        System.out.println("Nakon štos mo maknuli \" je\": " + mojaLista);

        mojaLista.remove(1);
        System.out.println("Nakon štos mo maknuli element na indeksu 1: " + mojaLista);

    }
}
