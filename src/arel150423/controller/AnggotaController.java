/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arel150423.controller;
import arel150423.view.FormAnggota;
import arel150423.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController (FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Entri OK");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
                    
        }
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Update OK");
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota,
                "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> list = anggotaDao.getAll();
        for(Anggota anggota : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat() 
            };
            tabelModel.addRow(data);
        }
    }
}