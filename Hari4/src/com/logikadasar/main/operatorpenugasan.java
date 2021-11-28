package com.logikadasar.main;
import java.util.Scanner;
public class operatorpenugasan {
public static void main(String[] args) {
	int usia = 18;
	int beratbadan = 48;
	
	if(usia>18) {
	if(beratbadan>=50) {
		System.out.println("Bisa donor");
	} else {
		System.out.println("Tidak bisa donor, karena berat badan kamu "+beratbadan +"kg");
	}
	}
	else if(usia<18&&beratbadan<50) {
		System.out.println("Tidak bisa donor, karena usia dan berat kamu belum cukup" );
	}
	else {
		System.out.println("Tidak bisa donor, karena usia kamu "+usia +" tahun");
	}
	
//	int plat,tanggal;
//	String depan;
//	Scanner input = new Scanner(System.in);
//	//tanggal 1=ganjil 2=genap
//	//tanggal 2 genap kanan, ganjil kiri
//	System.out.println("Masukkan Tanggal hari ini :");
//	tanggal = input.nextInt();
//	tanggal = tanggal%2;
//	System.out.println("Masukkan Plat nomor :");
//	plat = input.nextInt();
//	plat = plat%2;
//	if(plat == 1 && tanggal == 1) {
//			System.out.println("Kamu harus belok Kanan");
//		}
//	else if (plat == 0 && tanggal == 0) {
//			System.out.println("Kamu harus belok Kanan");
//		}
//	else {
//			System.out.println("Kamu harus belok Kiri");
//		}
//	
	}

	
	
}
	
	

