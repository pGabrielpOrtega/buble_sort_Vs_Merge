package com.company;


public class xd {


    public void mer(int [] var,Long t1){
        xd.mergeSort(var);
        Long t2 =System.currentTimeMillis();
        System.out.println("En milisegundo, el tiempo de ejecución MergeSort .- "+(t2-t1) );
    }
    public void Bub(int [] var,Long t1){
        xd.BubbleSort(var);
        Long t3 =System.currentTimeMillis();
        System.out.println("En milisegundo,el tiempo de ejecución del BubleSort .- "+(t3-t1));
    }


    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int[] inf = new int[arr.length/2];
        int[] sup = new int[arr.length - inf.length];

        System.arraycopy(arr,0,inf,0,inf.length);
        System.arraycopy(arr,inf.length,sup,0,sup.length);

        return merge(mergeSort(inf),mergeSort(sup));

    }
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        if(i < a.length){
            System.arraycopy(a,i,c,k,c.length - k);
        }else{
            System.arraycopy(b,j,c,k,c.length - k);
        }
        return  c;
    }
    public static int [] BubbleSort (int [] a){

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i] < a[j]){

                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;

                }
            }
        }

        return a;
    }

}
