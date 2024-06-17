public class MyString {
}

public static void main(String[] args) {
    String text = "Hello ";
    String nume = "Kristina";
    System.out.println(text+nume);

    String numeMare =nume.toUpperCase();
    System.out.println(numeMare);
    String numeMic = nume.toLowerCase();
    System.out.println(numeMic);

    String propozitie = "Ana are mere";
    int lungime = propozitie.length();
    System.out.println(lungime);

    //care e primul caracter din propozitia  ana are mere?
    // in programare prima pozitie este 0!!!!

    char primaLitera = propozitie.charAt(0);
    System.out.println(primaLitera);
// a a 6-a litera este defapt a 5-a litera pt ca prima se considera a fi 0, a doua litera 1, a 3a 2 si asa mai departe;
    char a6aLitera = propozitie.charAt(5+1);
    System.out.println(a6aLitera);

    // functia char tine minte doar o singura litera;

    String filmulPreferat = "Filmul meu preferat este 'Anna Karenina'";
    System.out.println(filmulPreferat);

    String filmulmeuPreferat = "Filmul meu preferat este\n\"Anna Karenina\"";
    System.out.println(filmulmeuPreferat);
    // \"Anna karenina\" se numeste ESCAPE character;
    // daca vrem sa afisam un rand nou unul dupa altul folosim \n sau \n\




}