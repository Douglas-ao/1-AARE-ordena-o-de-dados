package br.com;

public class BubbleSort {

    int assistant;                     // axiliar as trocas
    boolean control;                   //controle se o vetor esta ordenado

    void bubbleSort(int vetor[]) {
        //repetir o processo no tamanho do vetor
        for (int a = 0; a < vetor.length; ++a) {
            //se o vetor ja esteja ordenado, quebra etapa de repetir o processo
            control = true;
            //responsavel por analisar dois valores
            //não deixar de passe da quantidade de elemento no vetor
            for (int b = 0; b < (vetor.length - 1); ++b) {
                //responsavel por ordenar de forma crescente ou decrescente
                //verificar se um elemento é maior que o outro 
                //fazer a troca se necessario
                if (vetor[b] > vetor[b + 1]) {
                    assistant = vetor[b];
                    vetor[b] = vetor[b + 1];
                    vetor[b + 1] = assistant;
                    //não quebra a etapa
                    control = false;
                }
            }

            if (control) {
                //quebra a etapa
                break;
            }
        }
        //percorer o vetor e dar print em cada elemnto
        for (int a = 0; a < vetor.length; ++a) {
            // retornar a ordem correta (1, 2, 3, 4, 5, 6}{7, 8, 9, 10, 11, 12}
            System.out.print(vetor[a] + " ");
        }
    }

    public static void main(String[] args) {

        BubbleSort um = new BubbleSort();
        int vetor[] = {3, 5, 4, 6, 1, 2};       //representa o vetor 1 
        um.bubbleSort(vetor);                   //retorna {1, 2, 3, 4, 5, 6}
        int vetor2[] = {9, 11, 8, 12, 7, 10};  //representa o vetor 2
        um.bubbleSort(vetor2);                  //retorna {7, 8, 9, 10, 11, 12}
    }
}
