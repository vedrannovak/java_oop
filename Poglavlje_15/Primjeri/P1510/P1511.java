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
package Poglavlje15.Primjeri.p1510;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Primjer P1511
 * Čitanje i pisanje sa FileWriter i FileReader objektima.
 * Primjetimo problem: ukoliko se tokom čitanja dogodi iznimka otvorena datoteke
 * nikada neće biti zatvorena.
 */
class P1511 {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("C:/Users\\Vedran\\Desktop\\test.txt"));
            fw.write("Hello world, ja sam u datoteci!");
            fw.flush();
            
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }

        try {
            char[] chr = new char[35];
            FileReader fr = new FileReader(new File("C:\\Users\\Vedran\\Desktop\\test.txt"));
            fr.read(chr);
            for (char c : chr) {
                System.out.println(c);
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
