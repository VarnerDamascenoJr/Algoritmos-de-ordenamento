/*Descrição do código
 *  Antes de mais nada, é necesssário saber que este algoritmo é uma comparação.
 *Nele você tem um conjunto de vetores não ordenados e com valores diferentes de
 *null. Então, a partir de estrutrutas de repetição, todo o vetor será percor-
 *rido e funciona de uma maneira bem simples: no v[i] começaram este percurso que
 *será comparado o seu valor com seu sucessor, v[i+1], caso o valor do segundo seja
 *maior, então, hverá troca de valores ultilizando variável auxiliar. Por último
 *os valores serão impressos na tela, mas de forma ordenada.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Varner Damasceno Jr
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner ler = new Scanner(System.in);
 
    int n = 10; // tamanho do vetor
    int v[] = new int[n]; // declaração do vetor "v"
    int i, j, k, aux; // índice de posição e variáveis auxiliares
 
// Entrada de Dados
    /* Nesta parte do código, haverá a entrada dos dados a partir de números
       desejados pelo usuário. Esta quantidade de números dependerá de quão
       grande queiramos o vetor. Ou seja, de acordo com o meu número n, terei o
       tamanho do meu vetor; algo que pode ser visto nos códigos acima.
    */
    for (i=0; i<n; i++) {
      System.out.printf("Entre com o valor desejado: ");
      v[i] = ler.nextInt();
    }
    /*Aqui que há o funcionamento do algoritmo bubble sort em si; onde há a es-
      trutura de repetição do tamanho do vetor n e uma segunda estrutura do
      do tamano de n - 1. Ou seja, o atual e o anterior. Depois de constatado
      se um é maior que o outro, então, haverá a troca. Lembrar que a complexidade
      do algoritmo é O(n) no melhor caso e quadrático no pior caso.*/
    for(i=0; i<n; i++){
       for(j=0;j<(n-1);j++){
           if(v[j]>v[i]){
               aux  = v[i];
               v[i] = v[j];
               v[j] = aux;
           }
       }
    }
    //Nesta parte, a mais tranquilo onde é impresso todo o vetor, mas agora de 
    //forma ordenada.
    for(k=0;k<n;k++){
       System.out.printf("valor: %d", v[k]);
    }
    }
    
}
