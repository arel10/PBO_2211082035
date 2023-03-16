/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel160323;
import java.util.Scanner;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan2a {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan angka antara 1-10: ");
    int angka = scanner.nextInt();

    switch (angka) {
      case 1:
        System.out.println("Satu");
        break;
      case 2:
        System.out.println("Dua");
        break;
      case 3:
        System.out.println("Tiga");
        break;
      case 4:
        System.out.println("Empat");
        break;
      case 5:
        System.out.println("Lima");
        break;
      case 6:
        System.out.println("Enam");
        break;
      case 7:
        System.out.println("Tujuh");
        break;
      case 8:
        System.out.println("Delapan");
        break;
      case 9:
        System.out.println("Sembilan");
        break;
      case 10:
        System.out.println("Sepuluh");
        break;
      default:
        System.out.println("Invalid number");
        break;
    }
  }
}
