
/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        double r = 140;     //Innenradius in cm
        double s = 10;      // Wandstaerke in cm
        double l = 3.5;     //Laenge in m

        double n = 25;         //Anzahl

        //--------------------------
        // Rechnungen
        //--------------------------
        double a = r + s;  //Aussenradius

        double aussenkreis = a*a*Math.PI;
        double innenkreis = r*r*Math.PI;

        double kreisring = aussenkreis - innenkreis;

        double kreisringInM = kreisring / 10000.0;

        double betonmenge = kreisringInM * n * l;

        //--------------------------
        //Ausgabe
        //--------------------------
        System.out.println("Die Betonmenge betraegt: " + betonmenge);

    }
}
