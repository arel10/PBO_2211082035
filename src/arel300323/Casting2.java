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
public class Casting2 {
    public static void main(String[] args){
        double valDouble = 10.12;
        int ValInt = (int)valDouble; //men-convert valDouble ke tipe int
        double x = 10.12;
        int y = 2;
        int result = (int)(x/y); //hasil typecast operasi ke int
        System.out.print(result);
    }
}
