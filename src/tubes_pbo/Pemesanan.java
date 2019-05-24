/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

/**
 *
 * @author joko
 */
public class Pemesanan {
    String Nama,Alamat;
    int Jenis,Lama;
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getAlamat(){
        return Alamat;
    }
    
    public void setJenis(int Jenis){
        this.Jenis = Jenis;
    }
    
    public int getJenis(){
        return Jenis;
    }
}
