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
 * P0821
 * Modifikatori pristupa: public, protected, package, private
 * Modifikatorima pristupa kontroliramo tko ima pristup klasi, atributima,
 * metodama.
 *
 *  modifier        Class 	Package     Subclass    World
 *  public          Y           Y           Y    	Y
 *  protected       Y           Y           Y   	N
 *  no modifier     Y           Y           N   	N
 *  private         Y   	    N           N       N
 *
 * Klasa može imati samo modifikator pristupa package ili public. Metode i
 * atributi mogu imati bilo koji od modifikatora pristupa.
 */
public class P0821 {

    public static void main(String[] args) {

        Klasa21 objekt = new Klasa21();

        objekt.s = "3";
        objekt.a = 3;
        objekt.d = 3.0;
        objekt.poljeC[2] = 3;

    }
}

class Klasa21 {

    String s;
    protected int a;
    double d;
    public char[] poljeC;
}
