package laundry;

    public class Klien extends Person {
    /** class Client hanya menambahkan attribut idClient dan saldo
     untuk nama, alamat, dan telepon mewariskan dari claas Person */
    private int idClient;
    private double saldo;
    private final int idKlien;
    private final double Harga;

    public Klien(int idKlien, String nama, String alamat, double Harga) {
         /** pemanggilan constructor Person */
        this.idKlien = idKlien;
        this.Harga = Harga;
    }
    
    public int getIdKlien() {
        return idClient;
    }
    
    public double getHarga() {
        return saldo;
    }
    
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getTelepon() {
        return telepon;
    }
    
    public void kurangiHarga(double jumlah){
        this.saldo -= jumlah;
    }
              
}