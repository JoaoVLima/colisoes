package org.limadeveloper;

public class Cocktail extends Sort {
    public int[] sort(int[] arr, int tam){
        boolean trocou = true;
        int trocas = 0;
        int inicio = 0;
        int fim = tam-1;
        int temp;
        while(trocou){
            trocou = false;
            for(int i = inicio; i<fim; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
        }
        System.out.println(trocas);
        return arr;
    }
}
