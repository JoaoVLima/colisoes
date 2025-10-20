package org.limadeveloper;

public class Bubblesort extends Sort {
    public int[] sort(int[] arr, int tam){
        int tamanho = arr.length;
        int trocas;
        int sum_trocas = 0;
        for(int i=0;i<tamanho;i++){
            trocas = 0;
            for(int j=1;j<tamanho-i-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    trocas++;
                    sum_trocas++;
                }
            }
            if(trocas==0){
                break;
            }
        }
        System.out.println(sum_trocas);
        return arr;
    }
}
