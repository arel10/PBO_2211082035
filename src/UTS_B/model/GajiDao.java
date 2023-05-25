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
public interface GajiDao {
    public interface gajiDao {
    void save (Gaji Gaji);
    void update (int index, Gaji Gaji);
    void delete (int index);
    pegawai getGaji(int index);
    List<Gaji> getAll();
    }
}

