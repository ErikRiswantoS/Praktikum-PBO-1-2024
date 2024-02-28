/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author KOMPUTER JARKOM 26
 */
    public class ObjecMobil {
        
       public static void main(String[]args){
        MobilDiesel md = new MobilDiesel("Toyota",400,0," solar");
        md.infoMobilDiesel();
       
        MobilBensin mb = new MobilBensin("BMW",700,0,"Bensin");
        mb.infoMobilBensin();
        
    
        
        
//        Mobil mobilku = new Mobil("honda",200,0);
//        mobilku.setMerk ("honda");
//        mobilku.setHargaKecepatan (200, 0);
//        
//        Mobil mobilmu = new Mobil();
//        mobilmu.setMerk ("Ferari");
//        mobilmu.setHargaKecepatan (1000, 10000);
//        
//        mobilku.infoMobil();
//        mobilmu.infoMobil();
        }
    }
        

