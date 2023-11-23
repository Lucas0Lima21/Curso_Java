package facu;

public class Atividade {
    public static void main(String[] args) {
        int[] lista = {5, 2, 1, 3, 4, 6};

        System.out.println("Lista não ordenada:");
        imprimirLista(lista);

        bubbleSortDecrescente(lista);

        System.out.println("Lista ordenada de forma decrescente:");
        imprimirLista(lista);
    }

    public static void bubbleSortDecrescente(int[] arr) {
        int n = arr.length;
        boolean ordem;

        do {
        	ordem = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] < arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    ordem = true;
                }
            }
            n--;
        } while (ordem);
    }

    public static void imprimirLista(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
