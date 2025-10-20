package org.limadeveloper;

class Selectionsort extends Sort {
    int[] sort(int[] arr, int tam) {
        int tamanho = arr.length;
        for (int i = 0; i < tamanho - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < tamanho - i - 1; j++) {
                iteracoes++;
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            if (minI != i) {
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
                trocas++;
            }
        }
        return arr;
    }
}
