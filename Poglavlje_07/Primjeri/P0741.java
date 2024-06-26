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

/**
 * P0741
 * Korištenje vararg metode, metoda sa varijabilnim brojem argumenata/parametara
 */
class P0741 {

    public static void main(String[] args) {

        int[] polje1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(poljeToString(polje1));

        int[] polje2 = metodaVararg(5, polje1);
        System.out.println(poljeToString(polje2));

        int[] polje3 = metodaVararg(3, 5, 4, 6, 7, 5, 4);
        System.out.println(poljeToString(polje3));

    }

    static int[] metodaVararg(int faktor, int... brojevi) {
        for(int i = 0; i < brojevi.length; i++) {
            brojevi[i] *= faktor;
        }
        return brojevi;
    }

    static String poljeToString(int[] p) {

        String s = "[";
        for(int i = 0; i < p.length; i++) {
            s = s + p[i] + ",";
        }
        s = (s.substring(0, s.length() - 1)) + "]";
        return s;

    }
}
