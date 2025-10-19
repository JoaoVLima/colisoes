package org.limadeveloper;

// list sort( s, min, max )
//	list s;
//	typekey min, max;
//
//	{
//	int i;
//	typekey div, maxb[M], minb[M];
//	list head[M], t;
//	struct rec aux;
//	extern list Last;
//	if (s==NULL)	return(s);
//	if (max==min)	{
//		for (Last=s; Last->next!=NULL; Last = Last->next);
//		return( s );
//		}
//	div = (max-min) / M;	/* Find dividing factor */
//	if (div==0)	div = 1;
//	for (i=0; i<M; i++)	head[i] = NULL;
//	/* Place records in buckets */
//	while (s != NULL)	{
//		i = (s->k-min) / div;
//		if (i<0) i = 0;	else	if (i>=M) i = M-1;
//		t = s;
//		s = s->next;
//		t->next = head[i];
//		if (head[i]==NULL)	minb[i] = maxb[i] = t->k;
//		head[i] = t;
//		if ( t->k > maxb[i] )	maxb[i] = t->k;
//		if ( t->k < minb[i] )	minb[i] = t->k;
//		}
//	/* sort recursively */
//	t = &aux;
//	for (i=0; i<M; i++)	if (head[i]!=NULL)	{
//		t->next = sort( head[i], minb[i], maxb[i] );
//		t = Last;
//		}
//	return(aux.next);
//	}

public class BucketSort {
    public BucketSort() {
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
