package org.limadeveloper;

public abstract class Sort {
    public Sort() {
        System.out.println(this.getClass().getSimpleName());
    }

    public abstract int[] sort(int[] arr, int tam);
}
