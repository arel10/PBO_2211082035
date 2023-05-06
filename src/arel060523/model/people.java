/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel060523.model;

/**
 *
 * @author LABP1KOMP
 */
public class people {
    private String nama;
    private String alamat;
    private String StatusNikah;
    
    public people(){
    }
    
    public people(String nama, String alamat, String StatusNikah){
        this.nama = nama;
        this.alamat = alamat;
        this.StatusNikah = StatusNikah;
    } 
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getStatusNikah(){
        return StatusNikah;
    }
    public void setStatusNikah(String StatusNikah){
        this.StatusNikah = StatusNikah;
    }
}
