/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author HP
 */
class ListKlien {
    Klien[] list = {
        new Klien(1, "Dita", "Danau Ranau", 20000),
        new Klien(1, "Variza", "Danau Kerinci", 15000),
        new Klien(1, "Dita", "Danau Poso", 10000),
    };
    
    public void viewListKlien(){
        System.out.println("---List Klien---");
        System.out.println("Nama \t Alamat \t Total Harga");
        for (int i = 0; i < list.length; i ++){
            System.out.println(list[i].getIdKlien()+"\t"
            + list[i].getNama()+ "\t"
            + list[i].getAlamat()+ "\t"
            + list[i].getHarga() );
        }
    }
    public int cariKlien(int id){
        int foundIndex = 0;
        
        for(int i = 0; i <list.length; i++){
            
            if(list[i].getIdKlien()== id){
            foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}
