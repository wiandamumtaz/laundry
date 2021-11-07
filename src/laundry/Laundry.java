/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.Scanner;


public class Laundry {

    private static int menu;

  
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         boolean stay = true ;
         String key;
         
         ListJenisLaundry listlaundry = new ListJenisLaundry();
         ListPetugas listpetugas = new ListPetugas();
         ListKlien listklien = new ListKlien();
         
         while (stay) {  /** selama nilai "stay" = true maka program terus berjalan */          
            
            /** tampilan menu */
            System.out.println("-- Chilli's Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Transaksi");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
    }
        /** pengondisian pilihan menu user */
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                /** menampilkan daftar jenis laundry */
                listlaundry.viewJenisLaundry();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 2){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                /** menampilkan daftar petugas */
                listpetugas.viewListPetugas();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                /** menampilkan daftar client */
                listklien.viewListKlien();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 5){
                /** variabel "stay" diset false menyebabkan program berhenti */
                stay = false;
            } else if(menu == 4){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Transaksi Laundry ---");
                
                /** prepare variabel "jumlahLaundry" untuk menyimpan data 
                 * banyaknya jenis laundry yg dipilih
                 variabel "selectedIDClient" utk menyimpan data id client yg dipilih
                 */
                int jumlahLaundry, selectedIDClient;
                
                System.out.print("Masukkan id client:");
                selectedIDClient = input.nextInt();
                
                /** "foundIndex" menyimpan posisi index dari data client yg dipilih */
                int foundIndex = listklien.cariKlien(selectedIdKlien);
                
                /** "selectedKlien" menyimpan data client yg dipilih */
                Klien selectedKlien = listklien.list[foundIndex];
                
                System.out.print("\nMasukkan jumlah laundry pada transaksi ini:");
                jumlahLaundry = input.nextInt();
                
                /** prepare array transaksi dengan space sebanyak yg diinputkan user */
                Transaksi[] listTransaksi = new Transaksi[jumlahLaundry];
                
                /** proses pemilihan jenis laundry */
                for (int i = 0; i < jumlahLaundry; i++) {
                    /** menampilkan daftar jenis laundry */
                    listlaundry.viewJenisLaundry();
                    
                    System.out.print("Pilih id laundry yang diinginkan:");
                    int selectedIDJenisLaundry = input.nextInt();
                    
                    /** "foundLaundry" menyimpan posisi index dari jenis laundry yg dipilih */
                    int foundLaundry = listlaundry.cariJenisLaundry(selectedIDJenisLaundry);
                    
                    /** "selectedLaundry" menyimpan data jenis laundry yg dipilih */
                    JenisLaundry selectedLaundry = listlaundry.list[foundLaundry];
                    
                    System.out.print("\nMAsukkan jumlah " + 
                            listlaundry.list[foundLaundry].getJenisLaundry() +
                            " yang dicuci: ");
                    
                    int qty = input.nextInt();
                    
                    /** penambahan data transaksi ke dalam array*/
                    listTransaksi[i] = new Transaksi(selectedLaundry, qty);
                }
                
                /** prepare variabel untuk menyimpan total seluruh transaksi */
                double total = 0;
                
                /** menampilkan daftar transaksi */
                System.out.println("--- List Transaksi ---");
                System.out.println("Client: " + selectedKlien.getNama());
                System.out.println("Jenis Laundry \t Harga \t Jumlah \t Total");
                for (int i = 0; i < listTransaksi.length; i++) {
                    System.out.println(listTransaksi[i].selectedLaundry.getJenisLaundry() + " \t " +
                            listTransaksi[i].selectedLaundry.getHarga() + " \t " +
                            listTransaksi[i].jumlah + " \t " + listTransaksi[i].total);
                    
                    total += listTransaksi[i].total;
                }
                
                System.out.println("Total Harga: " + total);
                
                /** pengurangan saldo dari client yg dipilih */
                listklien.list[foundIndex].kurangiHarga(total);
                
                System.out.println("Press any key and enter...");
                key = input.next();
}
}
}