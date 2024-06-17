public class Operators {
    public static void main(String[] args) {
        int a= 100;
        int b= 50;
        int c= 30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //MODULO ne da duppa impartire partea neintreaga modulo= procentul

        System.out.println(a%b);
        System.out.println("---------");
        System.out.println(a%c);

        // ++a operator de incrementare; creste incrementarea cu o unitate; prima data incrementeaza si dupa afiseaza
        //System.out.println(++a);

        //a++; prima data afiseaza si dupa scade si incremneteaza;

        System.out.println(++a);
        System.out.println(a);

        // decrementare : -- ,descreste valoarea unei variabile cu o unitate

        System.out.println(--b);


        System.out.println(b--);
        System.out.println(b);

        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(a+50);

        System.out.println("-----------");

        //Operatori de atribuire

        int d = 10;
        int e = d;

        // +=

        d+=2; // echivalent cu  d=d+2
        System.out.println(d);

        // -=

        d-=3; // d=d-3;
        System.out.println(d);

        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        for (int i=10; i>=0; i--){
            System.out.println(i);
        }

        System.out.println("----------");

        //comparare rezultate de tip true sau false
        System.out.println(a>b);
        System.out.println(b>a);
        System.out.println(a>=b);
        System.out.println(b>=a);

        // comparam: daca doua valori sunt EGAL CU ==

        System.out.println(5==5);

        System.out.println(a==b);

        // alt semn de comparare : DIFERIT DE !=
        System.out.println(a!=b);

        boolean iLoveJava = false;
        System.out.println(iLoveJava);

        System.out.println(!iLoveJava);

        // boolean iLoveJava =false;
        //System.out.println(iLoveJava);

        System.out.println("------------------");

        if (iLoveJava){
            System.out.println("Learn Test Automation");
        }

        else {
            System.out.println("Still learning");
        }


        //OPERATORI LOGICI

        System.out.println(d); //d=9
        System.out.println(e); //e=10

        //SI -> &&; ambele conditii trebuie sa fie adevarate din paranteza

        if (d<10 && e<=10){
            System.out.println("d mai mic decat 10 SI e mai mic sau egal cu 10");
        }

        // SAU -> ||; doar o conditie trebuie sa fie adevarata

        if (d<10 ||  e<10){
            System.out.println("d SAU e mai mic sau egal cu 10");
        }

        System.out.println(10*6);
        System.out.println(10/5);

        int x=10;
        ++x;
        System.out.println(x);


        x += 5;
        System.out.println(x);


        int r= 2;
        int f= 30;
        int result= f+r;

        if (result>=10){
            System.out.println("suma este mai mare decat 10");
            } else {
            System.out.println("suma este mai mica decat 10");
        };

        if (result % 2==0){
            System.out.println("suma este numar par");
        }



    }
}
