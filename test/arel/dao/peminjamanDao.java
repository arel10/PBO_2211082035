/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arel.dao;

import arel.model.Peminjaman;
import java.util.List;

/**
 *
 * @author user
 */
public interface PeminjamanDao {
    void Insert(Peminjaman pm) throws Exception;
    void Update(Peminjaman pm) throws Exception;
    void Delete(Peminjaman pm) throws Exception;
    Peminjaman getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
