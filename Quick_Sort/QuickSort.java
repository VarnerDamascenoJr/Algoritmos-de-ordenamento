/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Varner Damasceno Jr
 */
public class QuickSort {
    //Aqui irei declarar uma função que irei percorrer o lado direito e o lado
    //esquerdo; também, haverá o conjunto de valores que será ordenado.
    //Isto a partir da partição
    private static void QuickSort(int[] vec, int esquerda, int direita){
        int index = partition(vec, esquerda, direita);
        if(esquerda< index -1)
            QuickSort(vec, esquerda, index - 1);
        if(index < direita)  
            QuickSort(vec, index, direita );
    }
    //Aqui é o método raiz do algorítmo, ou seja, a partição. 
    //Dividir para consquistar
    //Cuidado na hora do retorno desta função, pois é inteiro e não poderá
    //ser tipo void
    private static int partition(int[] vec, int esquerda, int direita){
    // Para o método da partição posso começar pelo início, pelo meio, pelo 
    //final do vetor. Para evitar casos de complexidades ruins, optei por usar
    // o meio do vetor. Assim sendo, meu elemento pivô estará no meio.
    int pivo  = vec[(esquerda + direita)/2];
    //Aqui um irá percorrer pela direita e o outro irá percorrer pela esquerda
   
    while(esquerda<=direita){
        while(vec[esquerda] < pivo ) esquerda++;
        while(vec[direita] > pivo) direita--;
        
        if(esquerda<= direita){
           int aux       = vec[esquerda];
           vec[esquerda] = vec[direita];
           vec[direita]  = aux;
           
           direita--; esquerda++;
        }
         }
          return esquerda;
    }
    
    public static void main(String[] args){
        //povoamento do vetor desordenamente
        int[] vec = new int[]{1,2,54,65,786,4,6,78,2,79,0,532,5644,643,346,457
        ,463,7645,8976,875,89,43,23,};
        //chamado da funcao de ordenamento
        QuickSort(vec, 0, vec.length -1);     
        //Impressão do vetor ordenado
        for(int i = 0; i< vec.length;i++){
        System.out.print(vec[i]+ " ");
        
        }
    
}}
