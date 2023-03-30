/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel300323;

/**
 *
 * @author LABP1KOMP
 */
public class AritmatikaExample {
        public static void main(String[] arguments) {
            Aritmatika arit = new aritmatika();
            int hasil = arit.tambah(7,6);
            System.out.println("Hasil Penjumlahan = "+hasil);
            arit.cekGanjil(hasil);
            int n = arit.inputN();
            int[] ganjil = arit.nganjil(n);
            System.out.println("Bilangan ganjil pertama:");
            for (int i = 0; i < ganjil.length; i++){
                System.out.print(ganjil[i] + "");
            }
        }
}
