
package prakstrukdat_m6_advancedsort;




public class QuickSort {
    private int[] arr;
    private int nElemen;
    
    public QuickSort(int max){
        arr = new int[max];
        nElemen = 0;
    }
    
    
    public void displayArray(){
        for(int i=0; i< nElemen; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void insert(int a){
        arr[nElemen] = a;
        nElemen++;
    }
    
    public void QuickSorting(){
        recQuickSort(0, nElemen-1);
    }
    
    public void recQuickSort(int batasKiri, int batasKanan){
        if(batasKanan - batasKiri <=0){
        } else{
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi -1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    void swap(int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    
    public int partitionIt(int batasKiri, int batasKanan, int pivot){
        int indexKiri = batasKiri-1;
        int indexKanan = batasKanan;
        while(true){
            while(indexKiri < batasKanan && arr[++indexKiri] < pivot);
            while(indexKanan > batasKiri && arr[--indexKanan] > pivot);
            if (indexKiri >= indexKanan){
                break;
            }else{
                swap(indexKiri, indexKanan);
                displayArray();
                
            }
        }
        swap(indexKiri, batasKanan);
        displayArray();
        return indexKiri;
    }
    
    public static void main(String[] args) {
        QuickSort array = new QuickSort(8);
        array.insert(13);
        array.insert(25);
        array.insert(98);
        array.insert(58);
        array.insert(19);
        array.insert(5);
        array.insert(51);
        array.insert(73);
        array.displayArray();
        
        System.out.println();
        array.QuickSorting();
        array.displayArray();
        
    }
    
}
