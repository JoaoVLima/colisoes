package org.limadeveloper;

class Bucket { // pilha
    int topo;
    int[] balde = new int[100];
}

public class BucketSort extends Sort {
    public int numero_buckets = 10;
    public int[] sort(int[] arr, int tam) {
        Bucket[] buckets = new Bucket[numero_buckets];

        // registra os buckets
        for (int i = 0; i < numero_buckets; i++) {
            buckets[i] = new Bucket();
            buckets[i].topo = 0;
        }


        for (int i = 0; i < tam; i++) {
            int bucket_index = numero_buckets - 1;
            while (true) { // de numero_buckets - 1 ate 0
                if (bucket_index < 0)
                    break;
                if (arr[i] >= bucket_index * 10) { // 10 porque max 100
                    buckets[bucket_index].balde[buckets[bucket_index].topo] = arr[i];
                    buckets[bucket_index].topo++;
                    break;
                }
                bucket_index--;
            }
        }

        // depois que separou em 10 buckets, faz o sort normal com outro algoritmo.
        // Aqui eu queria fazer recursivo, eu tentei e deu zebra
        // mas na teoria seria possivel, eu so nao consigo entregar no prazo do jeito que eu quero
        for (int i = 0; i < numero_buckets; i++) {
            if (buckets[i].topo > 0) {
                buckets[i].balde = new GnomeSort().sort(buckets[i].balde);
            }
        }

        // junta os buckets
        int index = 0;
        for (int bucket_index = 0; bucket_index < numero_buckets; bucket_index++) {
            for (int number_index = 0; number_index < buckets[bucket_index].topo; number_index++) {
                arr[index] = buckets[bucket_index].balde[number_index];
                index++;
            }
        }
        return arr;
    }
}
