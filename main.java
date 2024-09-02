/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademika;

/**
 *
 * @author USER
 */
public class main {
        public static void main(String[] args) {
        // Mengisi data dari setiap objek
        mahasiswa mahasiswa = new mahasiswa("Izzan Itsna", "09040623060");
        dosen dosen = new dosen("Dwi Rolliawati", "197909272014032001");
        staff staff = new staff("Marlong", "ST006");

        // Memanggil setiap objek
        mahasiswa.perkenalan();
        dosen.perkenalan();
        staff.perkenalan();
    }
}

