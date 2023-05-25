/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.model;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public interface pegawaiDao {
    void save (pegawai pegawai);
    void update (int index, pegawai pegawai);
    void delete (int index);
    pegawai getPegawai(int index);
    List<pegawai> getAll();
}
