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
public class Gaji {
    private String Golongan;
    private String Tanggal;
    private String Gapok;
    private String Tunj_anak;
    private String Tunj_istri;
    
    public Gaji(){
    }
    
    public Gaji(String Golongan, String Tanggal, String Gapok,String Tunj_anak, String Tunj_istri){
    this.Golongan = Golongan;
    this.Tanggal = Tanggal;
    this.Gapok = Gapok;
    this.Tunj_anak = Tunj_anak;
    this.Tunj_istri = Tunj_istri;
    } 
    
    public String getGolongan(){
        return Golongan;
    }
    public void setGolongan(String Golongan){
        this.Golongan = Golongan;
    }
    
    public String getTanggal(){
        return Tanggal;
    }
    public void setTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    
    public String getGapok(){
        return Gapok;
    }
    public void setGapok(String Gapok){
        this.Gapok = Gapok;
    }
    
    public String getTunj_anak(){
        return Tunj_anak;
    }
    public void setTunj_anak(String Tunj_anak){
        this.Tunj_anak = Tunj_anak;
    }
    
     public String getTunj_istri(){
        return Tunj_istri;
    }
    public void setTunj_istri(String Tunj_istri){
        this.Tunj_istri = Tunj_istri;
    }
    
}
