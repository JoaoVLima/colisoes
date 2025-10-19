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

public class GnomeSort {
    public GnomeSort() {
        System.out.println(this.getClass().getSimpleName());
    }
    public int[] sort(int[] arr){
        int tamanho = arr.length;
        int trocas=0;
        for(int i=0;i<tamanho-1;i++){
            int minI = i;
            for(int j=i+1;j<tamanho-i-1;j++){
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
