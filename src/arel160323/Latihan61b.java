/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel160323;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan61b {
    public static void main(String[] args) {
    try {
      String nilai1Str = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
      double nilai1 = Double.parseDouble(nilai1Str);
      String nilai2Str = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
      double nilai2 = Double.parseDouble(nilai2Str);
      String nilai3Str = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");
      double nilai3 = Double.parseDouble(nilai3Str);

      double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
      JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian adalah: " + rataRata);

      if (rataRata >= 60) {
        JOptionPane.showMessageDialog(null, ":)");
      } else {
        JOptionPane.showMessageDialog(null, ":(");
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Input yang dimasukkan bukan angka.");
      e.printStackTrace();
    }
  }
}

