/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Raymond
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    void displayInfo(){
        System.out.println("Merek :"+this.merk);
        System.out.println("Model :"+this.model);
        System.out.println("Tahun :"+this.tahun);
        System.out.println("Warna :"+this.warna);
    }
  
    // setter getter merk
    public String getMerk(){
        return this.merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    // setter getter model
    public String getModel(){
        return this.model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    // setter getter tahun
    public int getTahun(){
        return this.tahun;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
    // setter getter warna
    public String getWarna(){
        return this.warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void startEngine(){
        System.out.println("Mesin Mobil " + this.merk + " Menyala");
    }
    
}
