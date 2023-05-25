/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.model;

/**
 *
 * @author LABP1KOMP
 */
public class pegawai {
    private String nip;
    private String Nama;
    private String Alamat;
    
    public pegawai(){
    }
    
    public pegawai(String nip, String Nama, String Alamat){
        this.nip = nip;
        this.Nama = Nama;
        this.Alamat = Alamat;
    } 
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
}
