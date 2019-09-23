/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10118067.latihan6;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : IF-2
 * NIM      : 10118067
 * Latihan 6. Kambing static & konstanta
 */
public class IF210118067Latihan6 {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "Memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    

}