package org.limadeveloper;

class Cocktail extends Sort {
    int[] sort(int[] arr, int tam) {
        boolean trocou = true;
        int inicio = 0;
        int fim = tam - 1;
        int temp;
        while (trocou) {
            trocou = false;
            for (int i = inicio; i < fim; i++) {
                iteracoes++;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
        }
        return arr;
    }
}
