/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademika;

/**
 *
 * @author USER
 */
public abstract class CivitasAkademik {
    String nama;
    String role;

    CivitasAkademik(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    abstract void perkenalan();
}

