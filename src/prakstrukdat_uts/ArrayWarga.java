
package prakstrukdat_uts;


public class ArrayWarga {
    private Warga[] wrg;
    private int nElemen;

    public int getnElemen() {
        return nElemen;
    }

    public ArrayWarga(int max) {
        wrg = new Warga[max];
        this.nElemen = 0;
    }
    
    public void tambah(String kepalaKeluarga, int jumlahAnggota, String alamat,int noRumah){
        if(cekDuplikasi(kepalaKeluarga)){
            System.out.println(kepalaKeluarga + " Sudah Ada");
        }else{
            wrg[nElemen] = new Warga(kepalaKeluarga, jumlahAnggota, alamat, noRumah);
            nElemen++;
        }           
    }
    
    public void displayArray(){
        for(int i=0; i< nElemen; i++){
            wrg[i].displayWrg();
            System.out.println();
        }
    }
    
    public void bubbleSort(){
        int batas, i;
        for(batas = nElemen-1; batas > 0; batas--){
            for ( i = 0; i < batas; i++) {
                if( wrg[i].getNoRumah() > wrg[i+1].getNoRumah()){
                    swap(i, i+1);
                }
            }
        }
    }
    
    public boolean cekDuplikasi(String nama){
        boolean dup = false;
        for(int i=0; i<nElemen; i++){
            if(wrg[i].getKepalaKeluarga().equals(nama)){
                dup = true;
                break;
            }
        }
        return dup;
    }
    void swap(int one, int two){
        Warga temp = wrg[one];
        wrg[one] = wrg[two];
        wrg[two] = temp;
    }
    
    public int rekursifJumlahWarga(int index ){
        if(index == 0){
            return wrg[index].getJumlahAnggota();
        }else{
            return wrg[index].getJumlahAnggota() + rekursifJumlahWarga( index-1);
        }
    }
   
}
