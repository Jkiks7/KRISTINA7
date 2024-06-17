public class Algoritmi {
    public static void main(String[] args) {
        int[] numbers = {1, -25, 34, -2, 67, 5, -45, -987};
        for (int n : numbers) {
            System.out.println((n - 1) + " " + (n + 1));
        }
        System.out.println("----------");
        for (int n : numbers) {
            if (n < 0)
                System.out.println(n);
        }


        String text = "Abracadabra";
        String text2 = "Abracadabra";


        System.out.println(text.charAt(3));

        System.out.println(text.concat(text2)); // = sout(text1+text2)

        System.out.println(text.contains("cad"));// daca contine expresia"cad" stringul

        System.out.println(text.endsWith("bra"));// terminatia cuvantului

        System.out.println(text.length());

        System.out.println(text.indexOf('c'));// la ce pozitie se afla un anumit caracter

        System.out.println(text.startsWith("Abr"));// daca expresia incepe cu stringul ABR

        System.out.println(text.substring(6));
        System.out.println(text.substring(6, 9));// pozitia de inceput pana la pozitia de final

        System.out.println("------------");


//ex 4

        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};
//ex 5
        for (String t : tari) {
            System.out.println(t.charAt(0));

        }
        // ex 6
        for (String t : tari) {
            if (t.charAt(0) == 'A')
                System.out.println(t);

        }
        //7
        for (String t : tari) {
            //System.out.println(t.length());
            System.out.println(t + " are nr de litere: " + t.length());
        }

        //exemplu
        /*int max=numbers[0];
        for (int n:numbers){
            if (n>max){max=n;
            }
            System.out.println("max"+max);
        }*/

        //ex 8
        int maxLetters =tari[0].length();
        String taraCuCelMaiLungNume= tari[0];

        for (String  t: tari) {
            if (t.length() > maxLetters) {
                maxLetters = t.length();
                taraCuCelMaiLungNume = t;
            }
            {
                System.out.println("tara cu cel mai lung nume este" +taraCuCelMaiLungNume);
            }

            int minLetters=tari[0].length();
            String celMaiScurt= tari[0];

            /*for (String t: tari) {
                if (t.length() < minLetters) {
                    minLetters = t.length();
                    celMaiScurt = t;
                }
            }
            System.out.println("tara cu cel mai scurt nume"+celMaiScurt);*/


        }
    }
}
