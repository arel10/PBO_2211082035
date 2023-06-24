/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arel.model;

/**
 *
 * @author user
 */
public class peminjaman {
    private String KodeAnggota;
    private String KodeBuku;
    private String tglpinjam;
    private String tglkembali;
    private String kodeAnggota;
    
    public peminjaman(){
    }

    public peminjaman(String Kodeanggota, String KodeBuku, String tglpinjam, String tglkembali) {
        this.KodeAnggota = KodeAnggota;
        this.KodeBuku = KodeBuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public String getKodeAnggota() {
        return KodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String gettglpinjam() {
        return tglpinjam;
    }

    public void settglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String gettglkembali() {
        return tglkembali;
    }

    public void settglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }  

    String getKodeanggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKodeanggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKodeanggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getKodebuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTglpinjam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTglkembali() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}