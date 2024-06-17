public class ExOperatori {
    public static void main(String[] args) {

        int var1 = 40;
        int var2= 75;
        int var3= 3;
        int var4= 24;


        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4%var2);

        System.out.println("------");

        var1++;
        var1++;
        var1++;
        //System.out.println(++var1);
        System.out.println(var1);
        //sau varianta cu for

        for (int i=0; i<3; i++) {
            var1++;
        }
        System.out.println(var1);

        var2--;
        var2--;
        System.out.println(var2);




        boolean cond1= (var1+var2+var3+var4)>100;
        System.out.println(cond1);
        boolean cond2= (var1*var2*var3*var4)>1000;
        System.out.println(cond2);

        //SAU
        // faci un:
        // int sumVar=var1+var2+var3+var4;
        // int prodVar=var1*var2*var3*var4;
        //boolean cond1 = sumVar>100;
        //boolean cond2 = prodVar>1000;



        if (cond1 || cond2){
            System.out.println("cel putin una dintre  conditii este adevarata");
        }else {
            System.out.println("nici una din conditii nu este adevarata");
        }

        if (cond1 && cond2){
            System.out.println("ambele conditii sunt adevarate");
        }

// sau:
        //boolean ambeleTrue= cond1||cond2;
        //boolean celputinUnaAdevarata=cond1&&cond2;
        //System.out.println(ambeleTrue);
        //System.out.println(celputinUnaAdevarata);


    }
}
