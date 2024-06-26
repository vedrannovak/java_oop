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
 * P0722
 * Rad sa dvodimenzionalnim poljima
 */
class P0722 {

    public static void main(String[] args) {

        int[][] polje2D = {
            {2, 3, 7, 5, 4, 6},
            {3, 5, 6, 8},
            {2},
            {7, 2, 8, 7, 6, 3, 9, 5}
        };

        int elementPodpolja = polje2D[1][2] = 7;
        int duljinaPodpolja = polje2D[0].length;
        int duljinaPolja2D = polje2D.length;

        System.out.println("Polje polje2D: " + dvaDPoljeToString(polje2D));

    }

    public static String dvaDPoljeToString(int[][] p) {

        String s = "[";
        for(int i = 0; i < p.length; i++) {

            String t = "[";
            for(int j = 0; j < p[i].length; j++) {
                t += p[i][j] + ",";
            }

            t = t.substring(0, t.length() - 1) + "]";
            s += t + ",";
        }

        s = s.substring(0, s.length() - 1) + "]";
        return s;
    }
}
