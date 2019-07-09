//ainda está faltando algumas partes. Falta um tratamento em if.

package MergeSort;

public class Principal {
    public static void main(String[] args){
      int[]v = {4,6,7,3,};
    }
}
private static void mergeSort(int[]v, int[]w, int init, int fim ){
    if(init< fim){
     int meio = (init+ fim)/2;
     mergeSort(v, w, init, meio);
     mergeSort(v, w, meio+1, fim);
     intercalar(v, w, init, meio, fim);
    }
}

private static void intercalar(int[]v, int[]w, int init, int meio, int fim){
    for (int k= init; ḱ <=fim;k++){
        w[k] = v[k];
    }
   int i = init;
   int j = meio+1;
    for (int k =init; k<=fim; k++){
        if (i > meio)v[k] = w[j++];
        else if (j > fim) v[k] = w[i + 1];
        else if (w[i] < w[j]) v[k] = w[i];

    }
}
