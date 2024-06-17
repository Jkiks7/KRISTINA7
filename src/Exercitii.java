public class Exercitii {
}

public static void main(String[] args) {

    int myNum = 9;
    System.out.println(myNum);

    float myFloatNum = 8.99f;
    System.out.println(myFloatNum);

    char myLetter = 'A';
    System.out.println(myLetter);

    boolean myBoolean = false;
    System.out.println(myBoolean);

    String myText = " hello world";
    System.out.println(myText);


    String myOtherText = "1a2b3c";
    System.out.println(myOtherText);

    byte myByte = 98;
    System.out.println(myByte);
    int number= myByte;
    System.out.println(number);

    float myFloat= 2.72f;
    int kik= (int) myFloat;
    System.out.println(kik);

    String tara= "Italy";
    int litere = tara.length();
    System.out.println(litere);




    double[] myDob ={47.3721,62.9875,78.2345,98.7665};

    System.out.println(myDob[1]);
    System.out.println(myDob[3]);
    System.out.println(myDob.length);



    float myRata1 = 7.7f;
    float myRata2 = 8.2f;
    System.out.println(myRata1+myRata2);
    System.out.println(myRata2-myRata1);
    System.out.println(myRata1*myRata2);


    String myFavouriteMovie = "Anna Karenina ";
    System.out.println("My favourite move is \"Anna Karenina\"");

    String movieBig= myFavouriteMovie.toUpperCase();
    System.out.println(myFavouriteMovie.toUpperCase());

    String movieMini = myFavouriteMovie.toLowerCase();
    System.out.println(myFavouriteMovie.toLowerCase());

    int lungime = myFavouriteMovie.length();
    System.out.println(lungime);


    char[] elemente ={'a','b','c','d'};
    System.out.println(elemente[0]);
    System.out.println(elemente[1]);
    System.out.println(elemente[3]);

    System.out.println("---------");

    for(int i=0;i<elemente.length; i++){
        System.out.print(elemente[i]);
    }
// Afisti elementele FOR




}