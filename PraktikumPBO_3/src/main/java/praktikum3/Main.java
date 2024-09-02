/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Raymond
 */
public class Main {
        public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.setMerk("Toyota");
        mobil1.setModel("Yaris");
        mobil1.setTahun(2020);
        mobil1.setWarna("Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();
    }
}
