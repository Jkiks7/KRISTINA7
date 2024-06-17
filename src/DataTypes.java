public class DataTypes {
}

public static void main(String[] args) {
    boolean myBoolean = true;
    //myBoolean = false;
    boolean myBoolean2 = myBoolean;
    myBoolean = false;

    System.out.println(myBoolean);
    System.out.println(myBoolean2);

    char myChar ='A';
    System.out.println(myChar);


    byte myByte = 100;
    System.out.println(myByte);

    short myShort = 10000;
    System.out.println(myShort);

    int myInt = 10000000;
    System.out.println(myInt);

    long myLong = 1000000000000000L;
    System.out.println(myLong);

    float myFloat = 5.5f;
    System.out.println(myFloat);

    double myDouble = 23.5322274;
    System.out.println(myDouble);


    //Casting exemple;
    //casting implicit (de la mic la mare)

    int x = 5;
    double y = x;
    System.out.println(y);

    //casting explicit (de la mare la mic)
    int z =(int) y;
    System.out.println(z);

    //tipuri de date non-primitve ( cu litera mare)

    //String:



}