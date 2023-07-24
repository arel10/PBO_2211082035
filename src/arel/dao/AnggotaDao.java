/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arel.dao;

import arel.model.Anggota;
import java.util.List;
  
/**
 *
 * @author user
 */
public interface AnggotaDao {
    void insert (Anggota anggota) throws Exception;

    public void update(String kode, Anggota anggota);

    public Anggota getAnggota(String kode);

    public void delete(String kode);

    public List<Anggota> getAll();
    
}
