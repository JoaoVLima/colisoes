package org.limadeveloper;

public abstract class Sort {
    int trocas = 0;
    int iteracoes = 0;
    public abstract int[] sort(int[] arr, int tam);
    public void reset(){
        trocas = 0;
        iteracoes = 0;
    };
}
