import java.time.chrono.MinguoChronology;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("Hello");
        System.out.println("Diana");

        printName();

        int x = 6;
        int y = 3;
        System.out.println(x + y);

        float result = 9f / 2;
        System.out.println(result);

        System.out.println(-5 + 8 * 6);

        int resulta = -5 + 8 * 6;
        System.out.println("Rezultatul este " + resulta);

        int Result1 = Result1(-5, 8, 6);
        System.out.println("Rezultatul " + Result1);

        double resultb = (55 + 9) % 9;
        System.out.println("Rezultatul este " + resultb);

        double Result2 = Result2(55d, 9d, 9d);
        System.out.println("Rezutatul " + Result2);


        double resultc = 20 + (-3 * 5) / 8d;
        System.out.println("Rezultatul este " + resultc);

        double Result3 = Result3(20d, -3, 5, 8d);
        System.out.println("Rezultatul " + Result3);

        double resultd = 5 + 15d / 3 * 2 - 8 % 3;
        System.out.println("Rezultatul este " + resultd);

        double Result4 = Result4(5, 15d, 3, 2, 8, 3);
        System.out.println("Rezultatul " + Result4);

        System.out.println("Rezultatele pentru Tema 2");

        System.out.println("Rezultatul este " + adunare(3, 6));
        System.out.println("Rezultatul este " + scadere(3, 6));
        System.out.println("Rezultatul este " + inmultire(3, 6));
        System.out.println("Rezultatul este " + impartire(3, 6));

        System.out.println("Rezultatele pentru Tema 3");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println("J   J  aaaaa  v v  aaaaa");
        System.out.println(" J J  a     a  v  a     a");

        System.out.println("Rezultatele pentru Tema 4");

        double mediaAritmetica = sum(2, 3, 4) / 3d;
        System.out.println(mediaAritmetica);

        System.out.println("Rezultatele pentru Tema 5");

        System.out.println(" +" + "\"\"\"\"\"" + "+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        System.out.println("Rezultatele pentru Tema 6");

        System.out.println("Rezultatul este " + rest(15f, 4f));


        System.out.println("Rezultatele pentru Tema 7");

        System.out.println("Temperatura in Celsius este " + tempC(102f));


        System.out.println("Rezultatele pentru Tema 8");
        System.out.println("1 Inch reprezinta " + inchToMeter(120) + " metri");

        System.out.println("Rezultatele pentru Tema 9");

        float distanta = 125000f;
        float hr = 2f;
        float min = 15f;
        float sec = 45f;
        float timpHr = hr + (min / 60f) + (sec / 3600f);

        System.out.println("Distanta in metri este " + distanta);
        System.out.println(hr + " Ore " + min + " minute " + sec + " secunde ");

        float mps = distanta / (timpHr * 3600f);
        float kmh = (distanta / 1000f) / timpHr;
        float mph = (distanta / 1609f) / timpHr;

        System.out.println("Viteza in metri pe secunda este: " + mps);
        System.out.println("Viteza in kilometri pe ora este: " + kmh);
        System.out.println("Viteza in mile pe ora este: " + mph);

    }

    public static float inchToMeter(float nr) {
        float inchToMeter = nr * 0.0254f;
        return inchToMeter;
    }

    public static float tempC(float F) {
        float tempC = 5f / 9f * (F - 32f);
        return tempC;
    }

    public static float rest(float nr1, float nr2) {
        float rest = nr1 % nr2;
        return rest;

    }

    public static int sum(int nr1, int nr2, int nr3) {
        int sum = nr1 + nr2 + nr3;
        return sum;

    }

    public static int adunare(int nr1, int nr2) {
        int adunare = nr1 + nr2;
        return adunare;
    }

    public static int scadere(int nr1, int nr2) {
        int scadere = nr1 - nr2;
        return scadere;
    }

    public static int inmultire(int nr1, int nr2) {
        int inmultire = nr1 * nr2;
        return inmultire;
    }

    public static double impartire(double nr1, double nr2) {
        double impartire = nr1 / nr2;
        return impartire;
    }

    public static double Result4(double first, double second, double third, double forth, double fifth, double sixth) {
        double Result4 = first + second / third * forth - fifth % sixth;
        return Result4;
    }

    public static double Result3(double first, double second, double third, double forth) {
        double Result3 = first + (second * third) / forth;
        return Result3;
    }

    public static double Result2(double first, double second, double third) {
        double Result2 = (first + second) % third;
        return Result2;
    }


    public static int Result1(int first, int second, int third) {
        int Result1 = first + second * third;
        return Result1;

    }


    public static void printName() {
        System.out.println("Hello, Diana!");
    }
}



