package org.limadeveloper;

public class Selectionsort extends Sort {
    public int[] sort(int[] arr, int tam){
        int tamanho = arr.length;
        int trocas=0;
        for(int i=0;i<tamanho-1;i++){
            int minI = i;
            for(int j=i+1;j<tamanho-i-1;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            if(minI!=i){
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
                trocas++;
            }
        }
        System.out.println(trocas);
        return arr;
    }
}
