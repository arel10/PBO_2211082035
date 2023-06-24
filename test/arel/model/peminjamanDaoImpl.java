/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arel.model;

import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nitro
 */
public class peminjamanDaoImpl implements peminjamanDao{
    private Connection connection;
    private peminjaman peminjaman;
    public peminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (peminjaman peminjaman)throws Exception{
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }
    
    public void update (peminjaman peminjaman, String kode) throws Exception{
        String sql = "update peminjaman SET tglkembali = ?  WHERE kodeanggota = ? AND kodebuku = ? AND tglpinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getKodeanggota());
        ps.setString(3, peminjaman.getKodebuku());
        ps.setString(4, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }
    
    public void delete (String kode) throws Exception{
        String sql = "DELETE FROM anggota WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    } 
    
    public peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception{
        String sql = "SELECT * FROM peminjaman WHERE kodeanggota = ? and kodebuku = ? and tglpinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql); 
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<peminjaman> getAll() throws Exception{
        String sql = "SELECT * FROM peminjaman ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        eminjaman peminjaman;
        List<peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }

    @Override
    public peminjaman geteminjaman(String kode, String kodebuku, String tglpinjam) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}