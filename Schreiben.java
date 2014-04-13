
import ea.*;
/**
 * Diese Klasse verdeutlicht, wie man Dateien mit der Engine Alpha schreiben
 * und lesen kann.
 */
public class Schreiben
{

/**
 * Diese Methode schreibt ein Integer-Array und fuellt es mit den Quadratzahlen.
 * Anschlie�end wird das Array als Datei gespeichert.
 */
public void quadratzahlenSchreiben() {
    int[] quadr = new int[10];
    for(int i = 0; i < quadr.length; i++) {
        quadr[i] = i*i;
    }
    
    DateiManager.integerArraySchreiben(quadr, "Quadratzahlendatei.eaa");
}

/**
 * Diese Methode lie�t die geschriebene Datei wieder ein. 
 * Anschlie�end wird sie die einzelnen Zahlen an der Konsole ausgeben.
 */
public void quadratzahlenEinlesen() {
    int[] quadr = DateiManager.integerArrayEinlesen("Quadratzahlendatei.eaa");
    for(int i = 0; i < quadr.length; i++) {
        System.out.println(quadr[i]);
    }
}



}