package com.company;

public class Main {

    public static void main(String[] args) {
        int celcTempreture = 23;
        int farengTempreture = 45;
        System.out.println(celcTempreture+"C to Farengeit= "+toFarengejt(celcTempreture)+ "F");
        System.out.println(farengTempreture+"F to Celcium= "+toCelcium(farengTempreture)+"C");
    }

    private static int toCelcium(int farengTempreture) {
        return (int) ((farengTempreture - 32) / 1.8);
    }

    private static int toFarengejt(int celcTempreture) {
        return (int) (celcTempreture * 1.8) + 32;
    }
}
