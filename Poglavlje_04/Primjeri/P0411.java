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
 * P0411 Primjer naredbe return i povratne vrijednosti metode.
 */
class P0411 {

    public static void main(String[] args) {

        int in = metodaInt();
        float fl = metodaFloat();
        double db = metodaDouble();

        metodaVoid();

        System.out.println(metodaString());
    }

    static void metodaVoid() {

        System.out.println("Ovo je metoda koju smo pozvali, ne vraća ništa.");
        return;
    }

    static int metodaInt() {

        return 5;
    }

    static double metodaDouble() {

        return 5.3;
    }

    static float metodaFloat() {

        return 5.3f;
    }

    static String metodaString() {

        return "ja sam metoda koja vraca String";
    }
}
