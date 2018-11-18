

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        String b = "asdf";
        char na = 'E';
        int s = 2;
        double f = 1.2;
        float n = 8;
        Integer m = 10;

        int tab[] = {1, 2};

//        System.out.println("zimno dzis");
//
//        potega1 = obliczpotege();
//        potega2 = modulo();
//        System.out.println("Potega: " + potega1 + " modulo: " + potega2);


//        System.out.println(obliczpotege(4,6));
//        System.out.println(modulo(10,2));
//        System.out.println(suma(obliczpotege(2,2),modulo(10,2)));

        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


        List<Integer> testLista;
        testLista = ListaCwiczenia.pobierzWiek();
//        System.out.println(testLista.size());
//
//        for (int i = 0; i < testLista.size(); i++){
//            System.out.println(testLista.get(i) * 2);
//
//        }
//        System.out.println(Zadania.isWhiteSpace( '1'));

//        System.out.println(ListaCwiczenia.obliczpotege(2,2));

//        System.out.println(Zadania.smallestNumber(8,6,0));
//        System.out.println(Zadania.averageNumbers(8,3,4.8));
//        Zadania.letterNumbers("Programowanie");
//        System.out.println(Zadania.findMiddleChars("Appywdp"));
//       System.out.println(verifyItIsChars("ASSS", '1'));
//        System.out.println("Wynik to: " + Zadania.findCharsCount("sadf", 'a'));
//        System.out.println(Zadania.addNumbers("1911"));
//        Zadania.halfChristmasTree(9);
        System.out.println(Zadania.validPassword("sadf234"));
//
//        ////////////////////////////
//        List<Integer> lisa = new ArrayList<Integer>();
//        lisa.add(1);
//        lisa.add(2);
//        lisa.add(3);
//
//        System.out.println(Zadania.avarrageList(lisa));
//        ///////////////////////////
    }

    public static int verifyItIsChars(String nazwa, char c) {
        boolean status = Character.isDigit(c);
        if (status == false) {
            System.out.println("Wynik to: " + Zadania.findCharsCount(nazwa, c));
        }
        if (status == true) {
            System.out.println("Wynik to: " + "zły znak");
        }
        return 0;
    }




    public static int isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return 0;
        }
        return Zadania.addNumbers(str);
    }

}