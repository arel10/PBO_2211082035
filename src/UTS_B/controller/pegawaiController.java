/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.controller;

import UTS_B.model.pegawaiDaoImpl;
import UTS_B.model.pegawai;
import UTS_B.view.Formpegawai;
import javax.swing.table.DefaultTableModel;

/**
 *
 * author LABP1KOMP
 */
public class pegawaiController {
    private Formpegawai formPegawai;
    private pegawaiDaoImpl pegawaiDao;
    private pegawai pegawai;
    
    public pegawaiController(Formpegawai formPegawai){
        this.formPegawai = formPegawai;
        pegawaiDao = new pegawaiDaoImpl();
    }
    
    public void bersihForm(){
        formPegawai.getTxtnip().setText("");
        formPegawai.getTxtNama().setText("");
        formPegawai.getTxtAlamat().setText("");
    }
    
    public void savePegawai(){
        pegawai = new pegawai();
        pegawai.setNip(formPegawai.getTxtnip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        pegawaiDao.save(pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Entri OK");
    }
    
    public void getPegawai(){
        int index = formPegawai.getTblpegawai().getSelectedRow();
        pegawai = pegawaiDao.getpegawai(index);
        if(pegawai != null){
            formPegawai.getTxtnip().setText(pegawai.getNip());
            formPegawai.getTxtNama().setText(pegawai.getNama());
            formPegawai.getTxtAlamat().setText(pegawai.getAlamat());
        }
    }
    
    public void updatePegawai(){
        int index = formPegawai.getTblpegawai().getSelectedRow();
        pegawai.setNip(formPegawai.getTxtnip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        pegawaiDao.update(index, pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Update OK");
    }
    
    public void deletePegawai(){
        int index = formPegawai.getTblpegawai().getSelectedRow();
        pegawaiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPegawai.getTblpegawai().getModel();
        tabelModel.setRowCount(0);
        java.util.List<pegawai> list = pegawaiDao.getAll();
        for(pegawai pegawai : list){
            Object[] data = {
                pegawai.getNip(),
                pegawai.getNama(),
                pegawai.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}
