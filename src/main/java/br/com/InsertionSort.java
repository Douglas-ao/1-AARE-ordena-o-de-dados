package br.com;

public class InsertionSort {

    int assistant;                     // axiliar as trocas
    boolean control;                   //controle se o vetor esta ordenado

    void insertionSort(int vetor[]) {
        //começamos na posição 1
        //pois não tem nenhum elemento menor que o 0 
        //sempre indo uma casa a direita
        for (int right = 1; right < vetor.length; right++) {
            //assistant armazena o valor atual na posição direita
            assistant = vetor[right];
            //armazena o valor atual na posição esquerda
            int left = right - 1;

            //left é maior ou igual a zero
            //comparar se assistant(direita) é menor que o vetor da esquerda
            while ((left >= 0 && assistant < vetor[left])) {
                //trocar se for verdadeira do direito para esquerda
                vetor[left + 1] = vetor[left];
                left--;                          //pular uma casa para esqueda
            }
            // executa se não tiver menor que ele a esquerda
            vetor[left + 1] = assistant;
        }
        // retornar a ordem correta (1, 2, 3, 4, 5, 6}{7, 8, 9, 10, 11, 12}
        for (int right = 0; right < vetor.length; right++) {
            System.out.println(vetor[right]);
        }
    }

    public static void main(String[] args) {

        InsertionSort um = new InsertionSort();
        int vetor[] = {3, 5, 4, 6, 1, 2};      //representa o vetor 1 
        um.insertionSort(vetor);               //retornar {1, 2, 3, 4, 5, 6}
        int vetor2[] = {9, 11, 8, 12, 7, 10};  //representa o vetor 2
        um.insertionSort(vetor2);              //retornar {7, 8, 9, 10, 11, 12}
    }
}
