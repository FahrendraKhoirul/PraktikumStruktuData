
package prakstrukdat_m1;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray(int max){
        mhs =new Mahasiswa[max];
        nElemen = 0;
    }
    
    
    public Mahasiswa find(long searNim){
        int i;
        for (i=0; i<nElemen; i++){
            if(mhs[i].getNim()==searNim){
                break;
            }
        }
        if (i== nElemen){
            return null;
        } else{
            return mhs[i];
        }
    }
    
    public void insert(long nim, String nama, String asal){
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    
    public boolean delete(long searchNim){
        
        int i;
        for(i=0; i<nElemen;i++){
            if(mhs[i].getNim()==searchNim){
                break;
            }
        }
        if(i==nElemen){
            return false;
        }else{
            for(int j=0; j< nElemen; j++){
                mhs[j] = mhs[j+1];
            }
            nElemen--;
            return true;
        }
    }
    
    public void displayArray(){
        for(int i=0; i< nElemen; i++){
            mhs[i].displayMhs();
        }
    }
    
    public void bubbleSort(){
        int batas, i;
        for(batas = nElemen-1; batas > 0; batas--){
            for ( i = 0; i < batas; i++) {
                if( mhs[i].getNim() > mhs[i+1].getNim()){
                    swap(i, i+1);
                }
            }
        }
    }
    
    public void SelectionSort(){
        int awal, i, min;
        
        for(awal=0; awal<nElemen-1; awal++){
            min = awal;
            for(i = awal + 1; i < nElemen; i++){
                if(mhs[i].getAsal().compareTo(mhs[min].getAsal()) < 0){
                    min = i;
                }
            }
            swap(awal, min);
        }
    }
    
    void swap(int one, int two){
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
    void InsertionSortByName(){
        for(int i=1; i<nElemen; i++){
            for(int j=i; j>0; j--){
                if(mhs[j].getNama().compareTo(mhs[j-1].getNama()) < 0){
                    swap(j, j-1);
                }
            }
        }
    }
}
