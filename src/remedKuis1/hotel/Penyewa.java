/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remedKuis1.hotel;

/**
 *
 * @author Haliza
 */
public class Penyewa {
    private String nama;
    private String ktp;
    private String alamat;

    // deklarasi konstruktor class penyewa
    public Penyewa(String nama, String ktp, String alamat) {
        this.nama = nama;
        this.ktp = ktp;
        this.alamat = alamat;
    }
    
    // setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // setter ktp
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    // getter nama
    public String getNama() {
        return nama;
    }

    // getter ktp
    public String getKtp() {
        return ktp;
    }

    // getter alamat
    public String getAlamat() {
        return alamat;
    }

    // setter alamat
    public void setAlamat(String kota) {
        this.alamat = alamat;
    }
    
    // output
    public String info(){
        String info = "";
        info += "\n Nama Customer     : "+nama+"\n";
        info += "\n No KTP Customer   : "+ktp+"\n";
        info += "\n Alamat Customer   : "+alamat+"\n";
        return info;
    }
    
}
