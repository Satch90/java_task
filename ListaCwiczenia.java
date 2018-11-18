import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class ListaCwiczenia {

    public static List<Integer> pobierzWiek(){

        List<Integer> wiek = new ArrayList<Integer>();
        wiek.add(13);
        wiek.add(14);
        wiek.add(50);
        wiek.add(80);
        wiek.add(1);

        return wiek;

    }
    public static double obliczpotege(int podstawaPotegi, int wykladniPotegi) {
        return pow(podstawaPotegi, wykladniPotegi);
    }

    public static int modulo(int pierwszy, int drugi) {
        return pierwszy % drugi;
    }

    public static double suma(double pierwszaWartosc, int drugaWartosc){
        return pierwszaWartosc + drugaWartosc;
    }

}