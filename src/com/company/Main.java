package com.company;

public class Main {

    public static void main(String[] args) {

        int gießdauer = bestimmeGießdauer(19);
        System.out.println("Die Gießdauer beträgt " + gießdauer + "Sekunden");

    }

    public static int bestimmeGießdauer (double feuchtigkeit) {
        int gießdauer;

        if (feuchtigkeit < 20) {
            gießdauer = 5;
        } else if (feuchtigkeit >= 20 && feuchtigkeit < 40) {
            gießdauer = 3;
        } else if (feuchtigkeit >= 40 && feuchtigkeit <= 75) {
            gießdauer = 1;
        } else {
            gießdauer = 0;
        }
        return gießdauer;
    }

    public static double wasserGehalt (int pflanzenNr) {
        double ergebnis = 1;

        switch (pflanzenNr) {
            case 2:
                ergebnis = 0.95;
                break;
            case 3:
                ergebnis = 0.98;
                break;
            case 4:
                ergebnis = 0.98;
            case 1:
            default:
                ergebnis = 0.99;
        }
        return ergebnis;

        }

    }


