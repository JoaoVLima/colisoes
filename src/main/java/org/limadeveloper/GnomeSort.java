package org.limadeveloper;

//void gnomesort(int n, int ar[]) {
//	int i = 0;
//
//	while (i < n) {
//		if (i == 0 || ar[i-1] ≤ ar[i]) i++;
//		else {
//		int tmp = ar[i];
//		ar[i] = ar[i-1];
//		ar[--i] = tmp;
//		}
//	}
//}

public class GnomeSort extends Sort {
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
