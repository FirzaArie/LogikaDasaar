package com.logikadasar.main;
import java.util.Scanner;
public class Logikadasar {
public static void main(String[] args) {
	int nomor;
	Scanner input = new Scanner(System.in);
	System.out.println("Masukkan nomor :");
	nomor = input.nextInt();
	nomor = nomor%2;
	
	if(nomor==1) {
		System.out.println("ganjil");
	}
	else {
		System.out.println("genap");	
	}
	
	
	
	
	
}
}
