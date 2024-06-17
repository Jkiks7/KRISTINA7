import javax.swing.*;

public class OverLoading {
}

public static void main(String[] args) {

    //OVERLOADING= cand ai aceeasi metoda ca si nume dar cu parametri diferiti
    //Metodele cu void nu returneaza nimic doar fac afisari : ex public static void si afisare
    //Metodele  care returneaza un rezultat se numesc Metode tip RETURN;returneaza o valoare din interiorul unei functii

//sum(5,10);

    System.out.println(sum(5,10));
    System.out.println(concatenateTwoStrings("String A","String B"));
    System.out.println(aDouaLitera("Java"));
    System.out.println(lungimeaCuvantului("Zebra"));


    System.out.println(revNumber(-34));
    System.out.println(revNumber(75));
    System.out.println(revNumber(110));
    System.out.println(revNumber(-899));
    System.out.println(revNumber(-9));

    System.out.println(theBiggestNumber(10,100));
    System.out.println(theBiggestNumber(89,46));

    System.out.println(sumAverage(9,11,5));
    System.out.println(sumAverage(72,8,40));

    boolean bool1=true;
    boolean bool2=!bool1;
    boolean bool3=bool1 && bool2;
    System.out.println(!bool3);


    int a =5;
    int b =10;
    int c =8;
    boolean abc= a>b || c>b || c>a;
    System.out.println(abc);

    int x=5;
    while (x<10){
        System.out.println(x);
        x+=2;
    }


String [] kifre={"unu","doi","trei"};
    System.out.println(kifre[1]);
    for (String k: kifre)
    {
        System.out.println(k);}



    boolean suntemCuminti = true;
    boolean vineMosul;
    if(!suntemCuminti){vineMosul=false;} // daca != NU => daca Nu suntem cuminti Nu vine mosul adica false
    else  vineMosul=true;                // else= adica daca suntem cuminti atunci vine mosul!
    System.out.println(vineMosul);




    //Ex optionale
    vremeBuna();

    System.out.println(numarPar(8));

    System.out.println(reverseWord("Kutyagumi"));

    System.out.println(returneazaMaximulAPatruNr(-9,88,3,7));

    System.out.println(returneazaCaractereleDinMijloc("cuvant"));
    System.out.println(returneazaCaractereleDinMijloc("casca"));

    System.out.println(returneazaSumacifrelor(-22));

    System.out.println(moveIt("Kristina"));
    System.out.println(cNegativeNumbers(-));









}

//metode cu return

private static int sum(int a, int b) {


    int sum = a + b;
    return sum;
}

private static String concatenateTwoStrings(String a, String b){
    String concat = a+b;
    return concat;
    // return a+b;

    // ori: doar scriem: return a+b;
}

//returnam ceva ce nu are legatura cuc ce paramteru [rimeste

private static char aDouaLitera(String cuvant){
    return cuvant.charAt(1);
}

//ex.1
private static int revNumber(int x) {
    if (x > 0) ;
    return -x;
}
/* ex1.
private static int returneaza invers(int numar){
int invers=-numar
return invers;}

SAU
return-numar;

 */

//ex.2
private static int theBiggestNumber(int x, int y){
    if (x>y)
        return x;
    else
        return y;
}
/*
private static int returneazaMaximul(int x, int y){
int max;
if(x>y){max=x};
else max=y;
return max;

 */


//ex.3 (a+b+c)/30

private static float sumAverage(int m, int n ,int p){
 float sumAverage = (m+n+p)/3f;
 return sumAverage;
}

/*
private static double returneazaMediaAritmetica(int x, int y, int z){
return(x+y+z)/3.0;
 */

// Ex.4

private static int lungimeaCuvantului(String cuvant){
    return cuvant.length();
}

//Ex.6
//charAt pozitia are 5 pozitii; length e lungimea;
 private static String reverseWord(String word){
    String invers ="";
    int lungimeaStringului=word.length();
    // parcurgem sirul de la pozitia 5 la 1;
     for (int i= lungimeaStringului-1; i>=0;i--){
         invers=invers+word.charAt(i);
     }
     return invers;



 }

 /* vagy igy:egy masik "FOR"-al is lehet :)
 for (int i=0; i<lungimeaStringului:i++){
 invers = invers+word.charAt(lungimeaStringului-i);}
 return invers;

  */

//EXERCITII OPTIONALE

//1.
private static void vremeBuna(){
    System.out.println("In sfarsit e vreme buna!");

}

//2.
private static boolean numarPar(int n) {

    if (n % 2 == 0) {
        return true;
    } else {
        return false;


    }

    //sau: return n%2==0;
}

//3.

/*public static String returneazaAnotimpul(int luna) {
    String[] anotimp;
    if (luna.equalsIgnoreCase("martie"))||
    luna.equalsIgnoreCase("aprilie"))||
    luna.equalsIgnoreCase("mai"))||
    anotimp="primavara";

    return anotimp;


      //Ex.4
   private static int douaNumere(int t, int z){

       if (t>z)
           return t;
       else
           return z;
   }*/

//Ex5.optionale

private static int returneazaMaximulAPatruNr(int x,int y, int z,int w){
    int max=x;
    int numere[]={x,y,z,w};
    for (int n: numere){
       if(n>=max) {
           max=n;
       }
    }
    return max;
}

//Ex.6 optionale

// nu primeste int ci String si trebuie  lungimea stringului cu modulo de la ex 2 optional


//Ex. 7 optional

private  static String returneazaCaractereleDinMijloc(String cuvant){
    String mijloc;
    //Ce ne intereseaza prima data? Lungimea stringului!

    int lungime= cuvant.length();

    //Caz1. nr litere IMPAR- o singura litera
    if (lungime%2!=0){
       mijloc = cuvant.substring(lungime/2,lungime/2+1);
       //  alta varianta:   mijloc= String.valueOf(cuvant.charAt(lungime/2));
//Caz 2. nr litere Par - trebuie 2 litere
    } else mijloc=cuvant.substring(lungime/2-1,lungime/2+1);

    return  mijloc;

}
//Ex. 8 optional
public static int returneazaSumacifrelor(int numar) {
    int sumaCifrelor = 0;
    int rest;
    //if (numar<0){numar=numar*(-1);}
    do {
        rest = numar % 10;
        numar = numar / 10;

        sumaCifrelor = sumaCifrelor + rest;

    }
    while (numar >= 0);

    return sumaCifrelor;
}

// Ex. optional move it

private static String moveIt(String nume) {

   return "I like to move it move it \n I like to move it move it\n I like to move it move it\n " + nume + " likes to move it move it";



}

public static int cNegativeNumbers(int[]array) {
    int count=0;
    int negative;
    for (int number : array) {
        if (number < 0) {
            count ++;
        }

    }
    return count;
}




/*public static int finddNumber(int[] sum) {
    int num = 0;
    for (int i = 0; i < sum.length ; i++) {
        if(sum[i] < num) {
            num = sum[i];
        }
    }
    return num;
}*/











































































































































































































































































































































