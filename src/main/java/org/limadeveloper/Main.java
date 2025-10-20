package org.limadeveloper;

class Main {
    static void main(String[] args) {
        int[] vetorTeste = {3,2,5,1,6,47,47,7};
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetorTeste, vetor1, vetor2, vetor3};
        Sort[] algoritmos = {
                new Bubblesort(),
                new BucketSort(),
                new Cocktail(),
                new CombSort(),
                new GnomeSort(),
                new Selectionsort()
        };

        Test test = new Test(algoritmos, vetores);
        test.test();
    }
}