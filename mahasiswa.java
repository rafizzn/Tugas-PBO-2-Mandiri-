/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademika;

/**
 *
 * @author USER
 */
public class mahasiswa extends CivitasAkademik {
    String nim;

    mahasiswa(String nama, String nim) {
        super(nama, "Mahasiswa");
        this.nim = nim;
    }

    @Override
    void perkenalan() {
        System.out.println("Perkenalkan, nama saya " + nama + ", seorang " + role + " dengan NIM " + nim + ".");
    }
}
