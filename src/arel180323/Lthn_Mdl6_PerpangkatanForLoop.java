/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arel180323;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Lthn_Mdl6_PerpangkatanForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = scanner.nextInt();

        int hasil = 1;

        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
}