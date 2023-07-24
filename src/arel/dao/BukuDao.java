/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arel.dao;

import java.util.List;
import arel.model.Buku;
/**
 *
 * @author user
 */
public interface BukuDao {
    void Insert(Buku buku) throws Exception;

    void Update(Buku buku) throws Exception;

    void Delete(Buku buku) throws Exception;

    Buku getBuku(String kode) throws Exception;

    List<Buku> getAll() throws Exception;
}