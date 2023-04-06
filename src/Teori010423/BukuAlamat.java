/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori010423;

/**
 *
 * @author acer
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String alamatEmail;
    
    // Constructor
    public BukuAlamat(String nama, String alamat, String nomorTelepon, String alamatEmail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.alamatEmail = alamatEmail;
    }
    
    // Accessor methods
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    
    public String getAlamatEmail() {
        return alamatEmail;
    }
    
    // Mutator methods
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of BukuAlamat class
        BukuAlamat alamat = new BukuAlamat("Afcha Arel Pratama", "Jl. Perintis Kemerdekaan no 9 ", "083896140885", "Afchaarelpratama.com");
        
        // print the values of the object's attributes
        System.out.println("Nama: " + alamat.getNama());
        System.out.println("Alamat: " + alamat.getAlamat());
        System.out.println("Nomor Telepon: " + alamat.getNomorTelepon());
        System.out.println("Alamat E-Mail: " + alamat.getAlamatEmail());
        
        // update the values of the object's attributes
        alamat.setNama("Afcha Arel Pratama");
        alamat.setAlamat("Jl. Perintis Kemerdekaan no 9");
        alamat.setNomorTelepon("083896140885");
        alamat.setAlamatEmail("Afchaarelpratama.com");
        
        // print the updated values of the object's attributes
        System.out.println("Nama: " + alamat.getNama());
        System.out.println("Alamat: " + alamat.getAlamat());
        System.out.println("Nomor Telepon: " + alamat.getNomorTelepon());
        System.out.println("Alamat E-Mail: " + alamat.getAlamatEmail());
    }
}