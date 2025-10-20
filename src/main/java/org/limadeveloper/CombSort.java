package org.limadeveloper;

//1 sort comb_sort ( int * A , int n)
//2 {
//3 int sorted = 0, gap = n , i , sm , aux ;
//4 sort s = { . cmp = 0, . mov = 0};
//5
//6 while (! sorted ) {
//7 gap = ( int ) floor ( gap / 1.3) ;
//8 if ( gap <= 1) {
//9 gap = 1;
//10 sorted = 1;
//11 }
//12
//13 for (i = 0; i < n - gap ; i ++) {
//14 sm = gap + i;
//15 if (/* cmp */ s. cmp ++ , A[ i] > A [ sm ]) {
//16 aux = A [ sm ]; /* mov */
//17 A[ sm ] = A [i ]; /* mov */
//18 A[i ] = aux ; /* mov */ s. mov += 3;
//19 sorted = 0;
//20 }
//21 }
//22 }
//23
//24 return s;
//25 }

public class CombSort implements Sort {
    public int[] sort(int[] arr, int tam){
        int trocas=0;
        for(int i=0;i<tam-1;i++){
            int minI = i;
            for(int j=i+1;j<tam-i-1;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            if(minI!=i){
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
                trocas++;
            }
        }
        System.out.println(trocas);
        return arr;
    }
}
