/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel060523.model;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public interface karyawanDao {
    void save (karyawan karyawan);
    void update (int index, karyawan karyawan);
    void delete (int index);
    karyawan getKaryawan(int index);
    List<karyawan> getAll();
}
