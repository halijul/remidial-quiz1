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
public class Penginapan {
    private String noKamar;
    private Penyewa penyewa;

    // Deklarasi Konstruktor Class Penginapan
    Penginapan(String noKamar) {
        this.noKamar = noKamar;
    }

    // getter no kamar
    public String getNoKamar() {
        return noKamar;
    }
    
    // setter no kamar
    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    // getter penyewa
    public Penyewa getPenyewa() {
        return penyewa;
    }

    //setter penyewa
    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }
    
    // output
    public String info(){
        String info = "";
        info += "No. Kamar                      : "+noKamar+"\n";
        if(this.penyewa != null){
            info += "Customer               : \n"+penyewa.info()+"\n";
        }
        return info;
    }
    
}
