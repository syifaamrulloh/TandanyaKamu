/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan46.tandanyakamu;
/**
 * @author
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deskripsi Program  : Program untuk mengetahui umur seseorang konsep orientasi objek
 */

    public class Age {
    
    
    private int yearBirth;
    
    private int yearNow;
    
    private static final String MERAH = "\u001b[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        if ((umur >= 0) && (umur <= 5))
            return MERAH + " LAGI LUCU-LUCUNYA " + "\u001b[0m";
        else if ((umur >5)&&(umur <= 10))
            return MERAH + " MASIH ANAK ANAK " + "\u001b[0m";
        else if ((umur >10)&&(umur<=13))
            return MERAH + " MASIH REMADJA " + "\u001b[0m";
        else if ((umur > 13)&&(umur <= 19))
            return MERAH + " ALAY " + "\u001b[0m";
        else if((umur >19)&&(umur<=29))
            return MERAH + " LAGI GALAU NYARI JODOH " + "\u001b[0m";
        else if((umur >29)&&(umur<=35))
            return MERAH + " LAGI SIBUK NYARI UANG " + "\u001b[0m";
        else if ((umur>35)&&(umur<=150))
            return MERAH + " Sudah Tua " + "\u001b[0m";
        else
            return MERAH + " TIDAK TERDETEKSI DI KEHIDUPAN " + "\u001b[0m";
    }
    
}
