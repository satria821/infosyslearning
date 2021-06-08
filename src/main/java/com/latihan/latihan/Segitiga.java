package com.latihan.latihan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Segitiga {
	int panjang = 10;
	int tinggi = 15;
	int lebar = 20;
	public static void main(String[] args){
	Segitiga panjang = new Segitiga();
	Segitiga lebar = new Segitiga();
	Segitiga tinggi = new Segitiga();
	System.out.println(panjang.panjang);
	System.out.println(tinggi.tinggi);
		System.out.println(lebar.lebar);
	}
//	public int volume(int p, int l, int t) {
//		return p * t * l;
//	}
}



//public class LatihanApplication {
//
////	public static void main(String[] args) {
////		SpringApplication.run(LatihanApplication.class, args);
////	}
//}
//public int volume(int p, int l, int t){
//    return p*t*l;
//}
