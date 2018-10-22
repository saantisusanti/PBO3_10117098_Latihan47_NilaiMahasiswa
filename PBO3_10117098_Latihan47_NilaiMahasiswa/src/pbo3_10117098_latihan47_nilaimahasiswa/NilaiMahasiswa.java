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
public class NilaiMahasiswa {
    private double quiz;
    private double uts;
    private double uas;
    private double na;
    private char index;

    public NilaiMahasiswa(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double nilaiAkhir() {
        quiz = quiz * 0.2;
        uts = uts * 0.3;
        uas = uas * 0.5;
        double nilaiAkhir = quiz+uts+uas;
    return this.na=nilaiAkhir;}

    public char indexNilai() {
        char idx = ' ';
        if (80 < na && na <= 100) {idx='A';}
        else if (68 < na && na <= 80) {idx='B';}
        else if (56 < na && na <= 68) {idx='C';}
        else if (45 < na && na <= 56) {idx='D';}
        else if (0 < na && na <= 45) {idx='E';}
        else {idx = '-';}
    return this.index=idx;}

    public String ketereangan() {
        String ket = " ";
        switch (index) {
            case 'A':  ket="Sangat Baik"; break;
            case 'B':  ket="Baik"; break;
            case 'C':  ket="Cukup"; break;
            case 'D':  ket="Kurang"; break;
            case 'E':  ket="Sangat Kurang"; break;
        }
    return ket;}
}
