package org.limadeveloper;


public class BucketSort {
    public BucketSort() {
        System.out.println(this.getClass().getSimpleName());
    }

    public int[] sort(int[] arr) {
        int tamanho = arr.length;
        int trocas = 0;
        int numero_max_buckets = 5;

        arr = sort(arr, numero_max_buckets);

        System.out.println(trocas);
        return arr;
    }

    private int[] sort(int[] arr, int numero_max_buckets) {
        int tamanho = arr.length;

        if (tamanho == 1) {
            return arr;
        } else if (tamanho < numero_max_buckets) {
            numero_max_buckets = arr.length;
        }

        // maior e menor numero & valores diferentes de 0
        int min = arr[0];
        int max = arr[0];
        int valores_diferentes_de_0 = 0;
        for (int i = 0; i < tamanho; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] != 0) {
                valores_diferentes_de_0++;
            }
        }

        if (min == 0 && max == 0) { // vazia
            return new int[]{0};
        }else if (valores_diferentes_de_0<tamanho) { // tem valor vazio
            int[] novo_arr = new int[valores_diferentes_de_0];
            int index = 0;
            for (int i = 0; i < tamanho; i++) {
                if(arr[i]!=0) {
                    novo_arr[index] = arr[i];
                    index++;
                }
                if(index>=valores_diferentes_de_0) {
                    break;
                }
            }
            return novo_arr;
        }
        int[] bucketSizes = new int[numero_max_buckets];
        int[][] buckets = new int[numero_max_buckets][tamanho];

        int bucketRange = (int) (max - min + 1) / numero_max_buckets;

        for (int a : arr) {
            int bucketIndex = 0;

            // Qual bucket
            for (int inicioBucket = min; inicioBucket < max; inicioBucket += bucketRange + 1) {
                int fimBucket = inicioBucket + bucketRange;
                if (a >= inicioBucket && a <= fimBucket) {
                    // System.out.printf("%d = (%d->%d) => %d%n", a, inicioBucket, fimBucket, bucketIndex);
                    break;
                }
                bucketIndex++;
            }

            buckets[bucketIndex][bucketSizes[bucketIndex]] = a;
            bucketSizes[bucketIndex]++;
        }

        for (int i = 0; i < numero_max_buckets; i++) {
            buckets[i] = sort(buckets[i], numero_max_buckets);
        }

        valores_diferentes_de_0 = 0;

        for(int[] bucket: buckets) {
            for(int number: bucket) {
                if(number!=0) {
                    valores_diferentes_de_0++;
                }
            }
        }

        int[] resultado = new int[valores_diferentes_de_0];
        int index = 0;

        for(int[] bucket: buckets) {
            for(int number: bucket) {
                if(number!=0) {
                    resultado[index] = number;
                    index++;
                }
                if(index>=valores_diferentes_de_0) {
                    break;
                }
            }
            if(index>=valores_diferentes_de_0) {
                break;
            }
        }

        return resultado;
    }
}
