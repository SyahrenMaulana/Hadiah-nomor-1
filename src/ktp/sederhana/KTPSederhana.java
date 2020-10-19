/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp.sederhana;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KTPSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NIK, nama, alamat, ttl, gender, agama, pekerjaan;        
        
        //membuat scanner baru
        Scanner input = new Scanner (System.in);
        
        //tampilan output
        System.out.println("Data KTP Desa Sawojajar");
        System.out.println("NIK: ");
        NIK = input.nextLine();
        System.out.println("Nama: ");
        nama = input.nextLine();
        System.out.print("alamat: ");
        alamat = input.nextLine();         
        System.out.print("Ttl: ");
        ttl = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("Agama: ");
        agama = input.nextLine();        
        System.out.print("Pekerjaan: ");
        pekerjaan = input.nextLine();
        
        //menampilkan output
        System.out.println("***************");
        System.out.println("NIK: "+NIK);
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Gender: "+gender);
        System.out.println("Agama: "+agama);
        System.out.println("Pekerjaan: "+pekerjaan);
    }
    
}
