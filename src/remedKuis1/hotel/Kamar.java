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
public class Kamar {
    private String kode;
    private Class kelas;
    private Penginapan[] arrayPenginapan;
    private Penginapan noKamar;

    // Deklarasi Konstruktor Class Kamar
    public Kamar(String kode, int jumlah){
        this.kode = kode;
        this.arrayPenginapan = new Penginapan[jumlah];
        this.iniPenginapan();
    }
    
    // Setter Penginapan
    private void iniPenginapan(){
        for(int i = 0; i<arrayPenginapan.length; i++){
            this.arrayPenginapan[i] = new Penginapan(String.valueOf(i + 1));
        }
    }

    // Getter Atribut Kelas
    public Class getKelas() {
        return kelas;
    }

    // Setter Atribut Kelas
    public void setKelas(Class kelas) {
        this.kelas = kelas;
    }

    // Getter No Kamar
    public Penginapan getNoKamar() {
        return noKamar;
    }

    // Setter No Kamar
    public void setNoKamar(Penginapan noKamar) {
        this.noKamar = noKamar;
    }
    
    // Setter Penyewa
    public void setPenyewa(Penyewa penyewa, int nomer){
        this.arrayPenginapan[nomer - 1].setPenyewa(penyewa);
    }
    
    // Getter Penginapan
    public Penginapan[] getArrayPenginapan(){
        return arrayPenginapan;
    }
    
    // Output
    public String info(){
        String info = "";
        info += "Kode Kamar Hotel Customer         : "+kode+"\n";
        info += "Kelas Hotel yang dipilih Customer : "+getKelas().getKlsHotel()+"\n";
        for(Penginapan penginapan : arrayPenginapan){
            info += penginapan.info();
        }
        return info;
    }
}
