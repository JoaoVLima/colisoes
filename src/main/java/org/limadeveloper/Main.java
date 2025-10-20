package org.limadeveloper;

public class Main {
    public static void main(String[] args) {
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        Bubblesort bs = new Bubblesort();
        int[] a = bs.sort(new int[]{3,2,5,1,6,47,47,7}, 8);

        Main.print(a);

        Selectionsort ss = new Selectionsort();
        int[] b = ss.sort(new int[]{3,2,5,1,6,47,47,7}, 8);

        Main.print(b);

        Cocktail ct = new Cocktail();
        int[] c = ct.sort(new int[]{3,2,5,1,6,47,47,7}, 8);

        Main.print(c);

        GnomeSort gs = new GnomeSort();
        int[] d = gs.sort(new int[]{3,2,5,1,6,47,47,7}, 8);

        Main.print(d);

        BucketSort cs = new BucketSort();
        int[] e = cs.sort(new int[]{3,2,5,1,6,47,47,7}, 8);

        Main.print(e);
    }

    public static void print(int[] arr){
        System.out.printf("%c", '[');
        for(int i=0;i<arr.length-1;i++){
            System.out.printf("%d,", arr[i]);
        }
        System.out.printf("%d",arr[arr.length-1]);
        System.out.printf("%c%n",']');
    }
}