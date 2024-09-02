/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Raymond
 */
public class Hewan {
    private String nama;
    private int umur;
    
    void suara(){
        System.out.println("Hewan bersuara");
    }
    
    void info(){
        System.out.println("Nama :"+this.nama);
        System.out.println("Umur :"+this.umur);
    }
    
    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void berlari(){
        System.out.println("Hewan berlari");
    }
}
