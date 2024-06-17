import javax.swing.*;

public class FelLops {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("------");

        for (int m = 20; m < 21; m--) {
            if (m == 9) {
                break;
            }
            System.out.println("m= " + m);
        }
        System.out.println("------");

        for (int k = 0; k < 101; k++) {
            if (k % 2 == 1) {
                continue;
            }
            System.out.println("k= " + k);
        }
        System.out.println("---------");

        String numeFruct[] = {"Mere", "Capsuni", "Pere", "Banane"};
        for (String f : numeFruct) {
            System.out.println("Imi place sa mananc " + f);
        }

        System.out.println("---------");

        int numeleLunii = 5;
        switch (numeleLunii) {
            case 1:
                System.out.println("ianuarie");
                break;
            case 2:
                System.out.println("februarie");
                break;
            case 3:
                System.out.println("martie");
                break;
            case 4:
                System.out.println("aprilie");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("iunie");
                break;
            case 7:
                System.out.println("iulie");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("septembrie");
                break;
            case 10:
                System.out.println("octombrie");
                break;
            case 11:
                System.out.println("noiembrie");
                break;
            case 12:
                System.out.println("decembrie");
                break;
            default:
                System.out.println("Luna nu este valida");
        }
        System.out.println("----------");


        //EXERCITII OPTIONALE
        //1.

        int temperature = 23;
        if (temperature > 18 && temperature < 22) {
            System.out.println("Ok");
        }
        if (temperature < 18) {
            System.out.println("Prea frig!");
        } else if (temperature > 22) {
            System.out.println("Prea cald!");
        }

        // Ex.2 IF in IF
        char gender = 'm';
        boolean casatorit = true;

        if (gender == 'm') {
            System.out.println("Domnul");
        } else if (gender == 'f') {
            if (casatorit)
                System.out.println("Doamna");
        } else {
            System.out.println("Domnisoara");
        }


        //Ex.3
        int x = 32;
        int y = 7;
        int z = 5;

        if (x > y) {
            System.out.println(x + " este mai mare decat " + y);
        } else if (x < y) {
            System.out.println(y + "este mai mare decat" + y);
        }


        //Ex.4
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);

        }

        /*alta varianta:
        int max=x;

        if(y>max){
        max=y;
        }
        if(z>max){
        max=z;
        }

        System.out.println("cel mai mare numar dintre cele 3 este"+max);*/


        //Ex.5

        char letter = 'm';
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(" este vocala");
        } else {
            System.out.println("consoana");


            System.out.println("------------");


            //Extra challenge
        /*for (int rand = 0; rand <= 1; rand++) {

            System.out.println("Happy birthday to you");
        }
        for (int rand = 2; rand == 2; rand++) {
            break;
        }
        {
            System.out.println("Happy birthday dear Gabriel");
        }
        for (int rand = 3; rand == 3; rand++) {
            break;
        }
        {
            System.out.println("Happy birthday to you!");

        }*/
            for (int rand = 0; rand <= 7; rand++) {

                if (rand == 2 || rand == 6) {
                    System.out.println("Happy birthday dear Gabriel");
                } else {
                    System.out.println("Happy birthday to you");
                }
                if (rand == 3) {
                    System.out.println();
                }
            }

            /*
            String happyBirthday="Happy birthday to you";
            String happyBirthdayGabriel="Happy Birthday dear Gabriel";

            for(int i=0;i<2:i++){ //=> repeta strofa de 2 ori primul for
             for( int j=0;i<2;i++){// al doilea for=> repeta versurile
            sout(happyBirthday)
            }
            sout(happyBirthdayDearGabriel);
            sout(happyiBrthday)
            sout(pentru linia dintre)
             */

        }
    }
}















































