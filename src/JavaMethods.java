import javax.swing.*;

public class JavaMethods {
    public static void main(String[] args) {
        // au rolul de a face ceva -metodele

        afiseazaCeva();
        afiseazaCeva();
        afiseazaCeva();

        helloNume("Mihail");
        helloNume("Raluka");

        helloNumber(4);
        helloNumber(10);

        calculeazaSuma(8, 9);
        calculeazaDiferenta(20, 4);
        calculeazaProdus(10, 8);
        calculeazaSuma(2.5, 9.0);
        metoda1("Kutya");
        metoda1("un nume");
        metoda1("un nume", "alt nume");


        learningJava();
        learningJava();
        learningJava();


        learning2Code(" Java");
        learning2Code(" Python");
        learning2Code(" C++");
        learning2Code(" JavaScript");
        aflaNumarulmaiMare(76,8);
        lungimeaCuvantului("Dinozaur");







    }


    //Modificator de acces=>"private static void'"  ; metodele se scriu cu litera mica, ca sa fie metoda trebuie sa punem paranteza dupa;
    //dupapunem acolade{in corpul metodei} unde va fi executata metoda mea
    // metodele le scriem odata si le folosim de cate ori vrem in main(string[]{


    private static void afiseazaCeva() {
        System.out.println("Hello World");

    }

    private static void helloNume(String nume) {
        System.out.println("Hello" + nume);
    }


    //( ) reprezinta parametrul prin care lucreaza metoda ex. String nume

    private static void helloNumber(int number) {
        System.out.println("hello" + number);
    }

    //private static void afiseazaNumeVarsta(String nume, int varsta) {
        //System.out.println("Ma numesc +nume si am + varsta  ani");
    //}

    private static void calculeazaSuma(int x, int y) {
        System.out.println(x + y);
    }

    private static void calculeazaDiferenta(int x, int y) {
        System.out.println(x - y);
    }

    private static void calculeazaProdus(int x, int y) {
        System.out.println(x * y);
    }

    private static void calculeazaSuma(double x, double y) {
        System.out.println(x + y);
    }


    private static void metoda1() {
        System.out.println("metoda1");
    }

    private static void metoda1(String nume) {
        System.out.println("metoda1 cu nume");//String "nume" este o variabila locala
    }

    private static void metoda1(String nume1, String nume2) {
        System.out.println("metoda 1 cu doua nume");
    }

    private static void learningJava(){
        System.out.println("It's easy to learn Java");
    }


    private static void learning2Code(String limbajProgramare){
        System.out.println("It's easy to learn" + limbajProgramare);
    }

    private static  void aflaNumarulmaiMare(int x, int y){
        System.out.println("Numarul mai mare este ");
    if (x>y){
        System.out.println(x);}
    else System.out.println(y);
    }

    private static void lungimeaCuvantului( String x) {
        System.out.println("Lungimea cuvantului dat este: " + x.length());}

    //private static void vocalaSauConsoana(String cuvant){
        //String cuvantCuLitereMici=cuvant.toLowerCase();
        //if (cuvantCuLitereMici.charAt(0)=='a';
            //cuvantCuLitereMici.charAt(0)=='e';
           // cuvantCuLitereMici.charAt(0)=='i';
            //cuvantCuLitereMici.charAt(0)=='o';
            //cuvantCuLitereMici.charAt(0)=='u');{
            //System.out.println(cuvant+ "incepe cu vocala");
        //else{
            //System.out.println("incepe cu consoana");}

        //}

    //ex.5
    /*private static void vocalaSauConsoanaCuFor(String cuvant){
       char primaLitera =cuvant.toLowerCase().charAt(0)
                char vocale[]={'a','e','i','o','u'};
        for (char v:vocale){
            if (primaLitera==y)
                System.out.println("");*/
        }

   /* private static void ceVarstaAi(int varsta){
        if (varsta < 18) {
            System.out.println("too young varsta");
            else if (varsta =>18 && varsta < 60);
            {
                System.out.println("just fine");
            }
       else(varsta > 60) {
                System.out.println("too old");
            }
        }*/

     //OVERLOADING= cand ai aceeasi metoda ca si nume dar cu parametri diferiti







