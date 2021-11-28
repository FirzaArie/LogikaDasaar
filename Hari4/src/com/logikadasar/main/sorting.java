package com.logikadasar.main;

import java.util.Arrays;

public class sorting {
public static void main(String[] args) {
	String mobil[] = {"mitsubishi", "bmw", "abcudi", "avanza", "carry", "cenvolet", "ab"};

    char character[] = {'b', 'd', 's','c'};

    int angka[] = {5,4,3,6,2,1,4,3,2,5};

    Arrays.sort(angka);

    System.out.println("====================");
    for(int y : angka){
        System.out.println("ini sort dari angka di atas : " + y);
    }


    // saya mau sort data di atas dengan huruf depan paling awal
    // saya membaca semua data di atas dengan huruf itu saja tidak cukup jadi saya membaca 1 kalimat 

    // ini char
    for(char c : character){
        System.out.println("ini dari penampung character : " + c);
    }

    Arrays.sort(character);
    System.out.println("======================");

    for(char a : character){
        System.out.println("ini hasil sortnya : " + a);
            }
    for(String i : mobil) {
        System.out.println("ini adalah penampung mobil : " + i);
    }

    Arrays.sort(mobil);
    //ini pembatas
    System.out.println("Ini adalah hasil sort dari mobil " );

    for(String penampung : mobil) {
        System.out.println("ini hasil sort dari penampung di atas : " + penampung);
    }

    
}
}