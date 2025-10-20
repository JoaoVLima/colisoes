package org.limadeveloper;

public class GnomeSort extends Sort {
    public int[] sort(int[] arr, int tam){
        int i = 0;
        while (i < tam){
            iteracoes++;
            if (i == 0 || arr[i-1] <= arr[i]){
                i++;
            }
            else{
                int tmp = arr[i];
                arr[i] = arr[i-1];
                arr[--i] = tmp;
                trocas++;
            }
        }
        return arr;
    }
}
