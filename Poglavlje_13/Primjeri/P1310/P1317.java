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
 * Primjer P1317
 * Try blok mora imati ili barem jedan catch blok ili finally blok, a može
 * imati i više catch blokova i finally blok.
 *
 * Java7: multi catch statement, u jednom catch bloku možemo uhvatiti više
 * različitih iznimki pa smo spriječili ponavljanje koda. U ovakvom bloku
 * parametar je final. Generirani bytecode je efikasniji.
 */
public class P1317 {

    public static void main(String[] args) {

        int[] brojevi = {2, 5, 3, 5, 4, 2, 3};
        String element = "7";

        try {
            int br = Integer.parseInt(element);
            int zadnji = brojevi[br];
            System.out.printf("Zadnji broj je: %d", zadnji);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            System.out.printf("Element je nedohvatljiv! \n");
        } finally {
            System.out.printf("Kako god bilo, ja se izvršim. \n");
        }

    }
}
