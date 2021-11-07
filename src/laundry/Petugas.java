package laundry;

public class Petugas {
    private final int idPetugas;
    private final String jabatan;
    private String alamat;
    private String nama;
    private String telepon;

    public Petugas(int idPetugas, String nama, String alamat, String telepon, String jabatan) {
        super(nama, alamat, telepon); 
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
    
    
    public int getIdPetugas() {
        return idPetugas;
    }
    
    public String getJabatan() {
        return jabatan;
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
            
}