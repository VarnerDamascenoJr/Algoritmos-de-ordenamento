public static void mergeSort(int[]a, int n){
   if(n< 2){return 0;}
   
   int mind = n/2;
   int[]l   = new int[mind];
   int[]r   = new int[n - mind];
   for(int i = 0; i< mind; i++){l[i] = a[i];}
   for(int i; i < n; i++){r[i - mind] = a[i];}
}
