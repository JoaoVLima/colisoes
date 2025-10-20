package org.limadeveloper;

public class Bubblesort extends Sort {
    public int[] sort(int[] arr, int tam){
        for(int i=0;i<tam;i++){
            trocas = 0;
            for(int j=1;j<tam-i-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    trocas++;
                }
            }
            if(trocas==0){
                break;
            }
        }
        return arr;
    }
}
