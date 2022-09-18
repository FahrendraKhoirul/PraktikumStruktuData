
package prakstrukdat_m5_rekursif;

public class ArraysMergeSort {
    private int arr[];
    private int nElemen;
    
    public ArraysMergeSort(int size){
        arr = new int[size];
        nElemen =0;
    }
    
    public void insert(int value){
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void display(){
        for (int i=0; i< nElemen; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public void mergeSort(){
        int[] workspace =new int[nElemen];
        recMergeSort(workspace, 0, nElemen-1);
    }
    
    public void recMergeSort(int[] workSpace, int lowerbound, int upperbound){
        if(lowerbound == upperbound){
        }else{
            int mid = (lowerbound + upperbound)/2;
            recMergeSort(workSpace, lowerbound, mid);
            recMergeSort(workSpace, mid+1, upperbound);
            merge(workSpace, lowerbound, mid+1, upperbound);
        }
    }
    
    public void merge(int[] workSpace, int lowIndex,int highIndex, int upperbound){
        int j = 0;
        int lowerbound = lowIndex;
        int mid = highIndex -1;
        int nItem = upperbound -lowerbound +1;
        
        while(lowIndex <= mid && highIndex <= upperbound){
            if(arr[lowIndex] < arr[highIndex]){
                workSpace[j++] =arr[lowIndex++];
            } else{
                workSpace[j++] =arr[highIndex++];
            }
        }
        
        while (lowIndex <= mid){
            workSpace[j++] =arr[lowIndex++];
        }
        
        while (highIndex <= upperbound){
            workSpace[j++] =arr[highIndex++];
        }
        
        for(j =0; j<nItem; j++){
            arr[lowerbound + j] = workSpace[j];
        }
    }
}
