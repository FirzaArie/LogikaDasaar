package com.logikadasar.main;

import java.util.Arrays;
import java.util.Collections;

public class Reverseorder {
public static void main(String[] args) {
	Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

    String[] mobil = {"mitsubishi bmw", "bmw avanza", "abcudi ", "avanza", "carry", "cenvolet", "ab"};

    // Sorts arr[] in descending order
    Arrays.sort(arr, Collections.reverseOrder());
    Arrays.sort(mobil, Collections.reverseOrder());

    System.out.printf("mobil : %s", Arrays.toString(mobil));

    System.out.printf("Terbesar Terkecil : %s", Arrays.toString(arr));

}
}
