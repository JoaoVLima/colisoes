package org.limadeveloper;


public class BucketSort {
    public BucketSort() {
        System.out.println(this.getClass().getSimpleName());
    }
    public int[] sort(int[] arr){
        int tamanho = arr.length;
        int trocas=0;
        int numero_max_buckets = 5;

        // maior numero
        int max = arr[0];
        for(int i=0;i<tamanho;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        arr = sort(arr, max, numero_max_buckets);

        System.out.println(trocas);
        return arr;
    }

    private int[] sort(int[] arr, int max, int numero_max_buckets){
        if (arr.length == 0){
            return arr;
        } else if (arr.length < numero_max_buckets){
            numero_max_buckets = arr.length;
        }


    }
}
