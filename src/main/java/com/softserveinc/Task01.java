package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = { -1.7, -1.0, 2.6,  9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9,  1.4 };
        String[] month = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII"};
        double averageTemperature = temperature[0];
        double minTemperature = temperature[0];
        double maxTemperature = temperature[0];
        String monthMinTemperature = month[0];
        String monthMaxTemperature = month[0];
        for (int i = 1; i < temperature.length; i++){
            averageTemperature += temperature[i];
            if (temperature[i]<minTemperature) {
                minTemperature = temperature[i];
                monthMinTemperature = month[i];
            } else if (temperature[i]>maxTemperature) {
                maxTemperature = temperature[i];
                monthMaxTemperature = month[i];
            }
        }
        averageTemperature /= temperature.length;
        System.out.println("Average annual temperature: " + averageTemperature);
        System.out.println("Month with the lowest temperature in a year: " + monthMinTemperature);
        System.out.println("The month with the highest temperatures in a year: " + monthMaxTemperature);
    }
}