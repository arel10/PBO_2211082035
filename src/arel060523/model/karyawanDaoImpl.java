/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arel060523.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public class karyawanDaoImpl implements karyawanDao{
    List<karyawan> data = new ArrayList<>();
    public karyawanDaoImpl(){
        data.add(new karyawan("arel","Padang","y","001","1","Emp",2));
        data.add(new karyawan("pratama","Padang","t","002","2","OB",1));
    }
    public void save(karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int index, karyawan karyawan){
        data.set(index, karyawan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public karyawan getKaryawan(int index){
        return data.get(index);
    }
    public List<karyawan> getAll(){
        return data;
    }
}
