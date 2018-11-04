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
public class Class {
    private String klsHotel;
    
    Class(String klsHotel){
        this.klsHotel = klsHotel;
    }

    public String getKlsHotel() {
        return klsHotel;
    }

    public void setKlsHotel(String klsHotel) {
        this.klsHotel = klsHotel;
    }
    
    public String info(){
        String info = "";
        info += "Kelas Hotel yang dipilih anda : "+klsHotel+"\n";
        return info;
    }
    
    
    
}
