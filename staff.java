/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademika;

/**
 *
 * @author USER
 */
public class staff extends CivitasAkademik{
    String idStaff;

    staff(String nama, String idStaff) {
        super(nama, "Staff");
        this.idStaff = idStaff;
    }

    @Override
    void perkenalan() {
        System.out.println("Nama saya " + nama + ", memiliki jabatan sebagai " + role + " dengan ID " + idStaff + ".");
    }
}
