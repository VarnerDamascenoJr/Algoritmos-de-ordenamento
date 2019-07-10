// Este algoritmo funciona usando a técnica dividir para conquistar. Nele haverá um vetor desordenado,
//este vetor será divido ao meio sucessivamente até a impossibilidade e depois será intercalado parte 
// por parte e ordenadamente. Um coisa interessante é a divisão do vetor total em duas partes(vetor1 e vetor2) e depois
//a divisão do vetor1 e várias partes e depois tudo intercalado. Este algoritmo é muito bom, embora ainda existam melhores
// a sua complexidade é O(nlogn). A complexidade não é melhor por conta da variável auxiliar. Mas, diferente do quick-sort
//aqui eu já evito o pior caso naturalmente.
package MergeSort;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args){
      int[]v = {4,6,7,3,1,5,8, 9, 19, 33, 44};
      int[]w = new int[v.length];  //Aqui tenho um vetor auxiliar de mesmo tamanho que o vetor anterior
      mergeSort(v, w, 0, v.length- 1); //Aqui tenho o chamado do algoritmo na principal
      System.out.println(Arrays.toString(w));  //Aqui tenho a impressão dos vetores ordenados
    }

private static void mergeSort(int[]v, int[]w, int init, int fim ){
    if(init< fim){
     int meio = (init+ fim)/2;
     mergeSort(v, w, init, meio); //Aqui estou ordenando do início até o meio do vetor
     mergeSort(v, w, meio+1, fim); // Aqui do mesmo modo mas do meio até o final
     intercalar(v, w, init, meio, fim);  //Agora vou  juntar ambos os vetores
    }
}

private static void intercalar(int[]v, int[]w, int init, int meio, int fim){
    for (int k= init; k <=fim;k++){
        w[k] = v[k];//estou fazendo uma cópia usando k como auxiliar
    }
   int i = init; //Minha variável que percorrerá até o meio do meu vetor
   int j = meio+1; //Minha variável que percorrerá do meio até o fim do vetor

    for (int k =init; k <=fim; k++){ //novamente k do início até o fim do vetor, mas é necessário fazer tratamentos
        if (i > meio)v[k] = w[j++];  //Se um sub-vetor terminou antes do outro, eu passo a copiar de um para o outr
        else if (j > fim) v[k] = w[i++]; //se a segunda metade acabou, então eu copio também para o meu vetor v
        else if (w[i] < w[j]) v[k] = w[i++];
        else v[k] = w[j++];
    }
 }
}
