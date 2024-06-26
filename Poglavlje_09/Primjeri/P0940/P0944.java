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
package Poglavlje09.Primjeri.p0940;

import Poglavlje09.Primjeri.p0940.klase.Hrcak;
import Poglavlje09.Primjeri.p0940.klase.Macka;
import Poglavlje09.Primjeri.p0940.klase.Riba;
import Poglavlje09.Primjeri.p0940.klase.Zivotinja;
import Poglavlje09.Primjeri.p0940.klase.Pas;

/**
 * P0944
 * DownCasting, ručni cast objekta u njegovu podklasu. Operatorom instanceof
 * provjeravamo tip objekta.
 */
public class P0944 {

    public static void main(String[] args) {

        Zivotinja[] zoo = {
            new Pas().setZivotinja("Rex", "Pas"),
            new Macka().setZivotinja("Tula", "Macka"),
            new Hrcak().setZivotinja("Fifi", "Hrcak"),
            new Riba().setZivotinja("Blub", "Riba")
        };

        for (int i = 0; i < zoo.length; i++) {
            String s = zoo[i].toString() + ", ";
            if (zoo[i] instanceof Pas) {
                s += "Bali: " + ((Pas) zoo[i]).koeficijentBaljenja();
            }
            if (zoo[i] instanceof Macka) {
                s += "Ignorira: " + ((Macka) zoo[i]).nivoIgonoriranjaVlasnika();
            }
            if (zoo[i] instanceof Hrcak) {
                s += "Spava: " + ((Hrcak) zoo[i]).prosjecniBrojDanaHibernacije();
            }
            if (zoo[i] instanceof Riba) {
                s += "Pliva: " + ((Riba) zoo[i]).brzinaPlivanja();
            }
            System.out.println(s);
        }

    }
}
