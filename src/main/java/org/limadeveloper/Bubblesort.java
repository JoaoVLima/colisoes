package org.limadeveloper;

class Bubblesort extends Sort {
    int[] sort(int[] arr, int tam) {
        for (int i = 0; i < tam; i++) {
            int trocas_atual = trocas;
            for (int j = 1; j < tam - i - 1; j++) {
                iteracoes++;
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    trocas++;
                }
            }
            if (trocas_atual == trocas) { // nao teve trocas
                break;
            }
        }
        return arr;
    }
}
