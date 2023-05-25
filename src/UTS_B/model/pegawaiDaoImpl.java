/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public class pegawaiDaoImpl{
    List<pegawai> data = new ArrayList<>();
    
    public pegawaiDaoImpl() {
        data.add(new pegawai("2211", "Afcha", "Bukittinggi"));
        data.add(new pegawai("2222", "Arel", "Bukittinggi"));
    }
    
    public void save(pegawai pegawai) {
        data.add(pegawai);
    }
    
    public void update(int index, pegawai pegawai) {
        data.set(index, pegawai);
    }
    
    public void delete(int index) {
        data.remove(index);
    }
    
    public pegawai getpegawai(int index) {
        return data.get(index);
    }
    
    public List<pegawai> getAll() {
        return data;
    }
}

