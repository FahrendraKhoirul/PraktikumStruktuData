
package prakstrukdat_uts;

public class Warga {
    private String kepalaKeluarga;
    private int jumlahAnggota;
    private String alamat;
    private int noRumah;
    
    Warga(String kepalaKeluarga, int jumlahAnggota, String alamat,int noRumah){
        this.kepalaKeluarga = kepalaKeluarga;
        this.jumlahAnggota = jumlahAnggota;
        this.alamat = alamat;
        this.noRumah = noRumah;
    }

    public String getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNoRumah() {
        return noRumah;
    }

    void displayWrg() {
        System.out.print("Nama KK: " + kepalaKeluarga);
        System.out.print(", Anggota: " + jumlahAnggota);
        System.out.print(", Alamat: " + alamat);
        System.out.print(", No Rumah: " + noRumah);
    }
   
    
}
