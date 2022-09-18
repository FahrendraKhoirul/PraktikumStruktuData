
package prakstrukdat_m6_advancedsort;


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
    
    //swap method
    void swap(int one, int two){
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
    //MergeSort by Name
    public void mergeSort(){
        Mahasiswa[] workspace =new Mahasiswa[nElemen];
        recMergeSort(workspace, 0, nElemen-1);
    }
    
    private void recMergeSort(Mahasiswa[] workSpace, int lowerbound, int upperbound){
        if(lowerbound == upperbound){
        }else{
            int mid = (lowerbound + upperbound)/2;
            recMergeSort(workSpace, lowerbound, mid);
            recMergeSort(workSpace, mid+1, upperbound);
            merge(workSpace, lowerbound, mid+1, upperbound);
        }
    }
    
    private void merge(Mahasiswa[] workSpace, int lowIndex,int highIndex, int upperbound){
        int j = 0;
        int lowerbound = lowIndex;
        int mid = highIndex -1;
        int nItem = upperbound -lowerbound +1;
        
        while(lowIndex <= mid && highIndex <= upperbound){
            if(mhs[lowIndex].getNama().compareTo(mhs[highIndex].getNama()) < 0 ){
                workSpace[j++] =mhs[lowIndex++];
            } else{
                workSpace[j++] =mhs[highIndex++];
            }
        }
        
        while (lowIndex <= mid){
            workSpace[j++] =mhs[lowIndex++];
        }
        
        while (highIndex <= upperbound){
            workSpace[j++] =mhs[highIndex++];
        }
        
        for(j =0; j<nItem; j++){
            mhs[lowerbound + j] = workSpace[j];
        }
    }
    
    
    //ShellSort by NIM
    public void shellSort(){
        int in, out;
        Mahasiswa temp;
        int h = 0;
        h = 3* h +1;
        
        while(h>0){
            for(out=h; out<nElemen; out++){
                temp = mhs[out];
                in = out;
                
                while(in>h-1 && mhs[in -h].getNim() >= temp.getNim()){
                    mhs[in] = mhs[in-h];
                    in -= h;
                }
                mhs[in] = temp;
//                displayArray();
            }
            h = (h-1)/3;
        }
    }
    
    //QuickSort by Nama
    public void quickSort(){
        recQuickSort(0, nElemen-1);
    }
    
    private void recQuickSort(int batasKiri, int batasKanan){
        if(batasKanan - batasKiri <=0){
        } else{
            String pivot = mhs[batasKanan].getNama();
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi -1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    private int partitionIt(int batasKiri, int batasKanan, String pivot){
        int indexKiri = batasKiri-1;
        int indexKanan = batasKanan;
        while(true){
            while(indexKiri < batasKanan && mhs[++indexKiri].getNama().compareTo(pivot) < 0);
            while(indexKanan > batasKiri && mhs[--indexKanan].getNama().compareTo(pivot) > 0);
            if (indexKiri >= indexKanan){
                break;
            }else{
                swap(indexKiri, indexKanan);
//                displayArray();
                
            }
        }
        swap(indexKiri, batasKanan);
//        displayArray();
        return indexKiri;
    }
   
}
