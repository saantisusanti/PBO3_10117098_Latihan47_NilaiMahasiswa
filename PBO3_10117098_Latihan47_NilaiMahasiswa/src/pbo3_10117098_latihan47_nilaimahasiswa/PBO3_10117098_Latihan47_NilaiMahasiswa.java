/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan47_nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Meghitung nilai akhir mahasiswa berdasarkan
 *                     nilai quiz, uts, dan uas
 */
public class PBO3_10117098_Latihan47_NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nmsh = new NilaiMahasiswa(60,80,75);

        System.out.println("QUIZ \t = "+nmsh.getQuiz());
        System.out.println("UTS \t = "+nmsh.getUts());
        System.out.println("UAS \t = "+nmsh.getUas());
        System.out.println("\nNilai Akhir = "+ nmsh.nilaiAkhir());
        System.out.println("\nIndex = "+ nmsh.indexNilai());
        System.out.println("Keterangan = "+ nmsh.ketereangan());
    }
    
}
