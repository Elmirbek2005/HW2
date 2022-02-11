package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ajetemp(15,30));
        System.out.println(ajetemp(10,32));
        System.out.println(ajetemp(11,20));
        System.out.println(ajetemp(16,35));
        System.out.println(ajetemp(18,25));
    }
    public static String ajetemp (int eihs,int temp) {
        String ress1 = "можно ити гулять";
        String ress2 = "нельзя ити гулять";
        if (eihs > 25 && eihs < 45 && temp > -20 && temp < 30) {
            return ress1;


        }
        if (eihs < 20 && temp > -20 && temp < 30) {
            return ress1;
        } else {
            return ress2;
        }

    }}