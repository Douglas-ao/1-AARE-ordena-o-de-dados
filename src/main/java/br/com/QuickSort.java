package br.com;

public class QuickSort {

    int assistant;                     // axiliar as trocas

    public static void main(String[] args) {

        QuickSort um = new QuickSort();
        int vetor[] = {3, 5, 4, 6, 1, 2};      //representa o vetor 1 
        um.quickSort(vetor, 0, vetor.length - 1); //retornar {1, 2, 3, 4, 5, 6}
        imprimirVetor(vetor);
        int vetor2[] = {9, 11, 8, 12, 7, 10};  //representa o vetor 2
        um.quickSort(vetor2, 0, vetor.length - 1); //retornar {7, 8, 9, 10, 11, 12}
        imprimirVetor(vetor2);
    }

    void quickSort(int vetor[], int left, int right) {
        //vetor a ordenar
        int pivo = vetor[left];

        //no elementos > o pivo vai a direita
        //no elemento < o pivo vai a esquerda
        int a = left;
        int b = right;

        //os elementos são avaliados para localizar o novo pivô
        while (a < b) {
            while (vetor[a] <= pivo && a < b) {
                a++;
            }
            while (vetor[b] > pivo) {
                b--;
            }
            //sempre quando "a" seja menor que "b" fazem um intercambio de elementos
            if (a < b) {
                assistant = vetor[a];
                vetor[a] = vetor[b];
                vetor[b] = assistant;
            }
        }
        vetor[left] = vetor[b];
        vetor[b] = pivo;
        if (left < b - 1) {
            quickSort(vetor, left, b - 1);
        }
        if (b + 1 < right) {
            quickSort(vetor, b + 1, right);
        }
    }

    //metodo para imprimir
    public static void imprimirVetor(int vetor[]) {
        // retornar a ordem correta (1, 2, 3, 4, 5, 6}{7, 8, 9, 10, 11, 12}
        for (int a = 0; a < vetor.length; a++) {
            System.out.println(vetor[a]);
        }
    }
}
