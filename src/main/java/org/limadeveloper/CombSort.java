package org.limadeveloper;

public class CombSort extends Sort {
    public int[] sort(int[] arr, int tam){
            int gap = tam;
            double fator_diminuicao = 1.3;
            boolean sorted = false;

            while (!sorted) {
                gap = (int) (gap/fator_diminuicao);

                if (gap <= 1) {
                    gap = 1;
                    sorted = true;
                } else if (gap == 9 || gap == 10) {
                    gap = 11; // 11 magico do comb
                }

                for (int i = 0; i + gap < tam; i++) {
                    iteracoes++;
                    if (arr[i] > arr[i + gap]) {
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                        trocas++;
                        sorted = false;
                    }
                }
            }
            return arr;
    }
}
