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
public class mainHotel {
    
    // Ini Main
    public static void main(String[] args){
        Penyewa p = new Penyewa("Yogi", "00090", "Magetan");
        Kamar kamar = new Kamar("B12345", 3);
        Class kelas = new Class("VVIP");
        kamar.setPenyewa(p, 1);
        kamar.setKelas(kelas);
        System.out.println(kamar.info());
    }
}
