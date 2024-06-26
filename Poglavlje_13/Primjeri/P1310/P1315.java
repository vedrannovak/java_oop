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
package Poglavlje13.Primjeri.P1310;

/**
 * Primjer P1315
 * Možemo uhvatiti i više različitih iznimki navodeći catch blok za
 * iznimku nadklase. Catch blokovi se moraju navoditi jedan ispod drugoga
 * počevši od konkretnijig iznimki prema apstraktijima.
 */
public class P1315 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "7";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        } catch(NumberFormatException ex) {
            
        } catch(Exception ex) {
            System.out.printf("Nešto ne valja. \n");
        }

    }
}
