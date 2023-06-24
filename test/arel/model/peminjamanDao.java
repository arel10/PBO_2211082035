/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arel.model;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface peminjamanDao {
    void insert (peminjaman peminjaman) throws Exception;
    void update (peminjaman peminjaman, String kode) throws Exception;
    void delete (String kode) throws Exception;
    peminjaman geteminjaman (String kode, String kodebuku, String tglpinjam) throws Exception;
    List<peminjaman> getAll() throws Exception;
}
