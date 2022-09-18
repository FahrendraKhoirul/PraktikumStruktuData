
package prakstrukdat_m6_advancedsort;

public class ShellSort {
    private int[] arr;
    private int nElemen;
    
    public ShellSort(int max){
        arr = new int[max];
        nElemen = 0;
    }
    
    public void ShellSorting(){
        int in, out;
        int temp;
        int h = 0;
        h = 3* h +1;
        
        while(h>0){
            for(out=h; out<nElemen; out++){
                temp = arr[out];
                in = out;
                
                while(in>h-1 && arr[in -h] >= temp){
                    arr[in] = arr[in-h];
                    in -= h;
                }
                arr[in] = temp;
                displayArray();
            }
            h = (h-1)/3;
        }
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
    
    public static void main(String[] args) {
        ShellSort array = new ShellSort(8);
        array.insert(13);
        array.insert(25);
        array.insert(98);
        array.insert(58);
        array.insert(19);
        array.insert(5);
        array.insert(51);
        array.insert(73);
        //array.displayArray();
        
        System.out.println();
        array.ShellSorting();
        //array.displayArray();
        
    }
}
