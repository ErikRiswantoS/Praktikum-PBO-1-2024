/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author KOMPUTER JARKOM 26
 */
   public class Mobil {

        String merk;
        int harga, kecepatan;
     /**
     
     */   
        
    Mobil(String merk, int harga, int kecepatan){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
    
    }
    
    Mobil(){
        
    }
    
    void setMerk (String brand){
        merk = brand;
}
    void setHargaKecepatan (int harga,int kecepatan){
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    String getMerk(){
        return merk;
    }
    
    int getHarga(){
        return harga;
    }
    
    int getKecepatan(){
        return kecepatan;
    }
    void infoMobil (){
        System.out.println("Merk Mobil: " + getMerk());
        System.out.println("Harga Mobil: " + getHarga());
        System.out.println("Kecepatan Mobil: " + getKecepatan());
        System.out.println("------------------------------------");
        
    }
}
