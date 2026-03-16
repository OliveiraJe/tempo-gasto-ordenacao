package view;

import java.util.Arrays;

import br.com.oliveiraJe.sort.BubbleSort;
import br.com.oliveiraJe.sort.MergeSort;
import br.com.oliveiraJe.sort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int tamanho = 1500;
		int[] vetorOriginal = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetorOriginal[i] = (tamanho - 1) - i;
		}

		System.out.println("--- COMPARATIVO DE PERFORMANCE (VETOR DECRESCENTE DE 1500) ---\n");

		// Teste Bubble Sort
		testarAlgoritmo("Bubble Sort", Arrays.copyOf(vetorOriginal, tamanho));

		// Teste Merge Sort
		testarAlgoritmo("Merge Sort", Arrays.copyOf(vetorOriginal, tamanho));

		// Teste Quick Sort
		testarAlgoritmo("Quick Sort", Arrays.copyOf(vetorOriginal, tamanho));
	}

	public static void testarAlgoritmo(String nome, int[] vetor) {
		long tempoInicio = System.nanoTime();

		if (nome.equals("Bubble Sort")) {
			BubbleSort.sort(vetor);
		} else if (nome.equals("Merge Sort")) {
			MergeSort.sort(vetor);
		} else if (nome.equals("Quick Sort")) {
			QuickSort.sort(vetor);
		}

		long tempoFim = System.nanoTime();
		double tempoTotalMs = (tempoFim - tempoInicio) / 1_000_000.0;

		System.out.printf("%s: %.4f ms%n", nome, tempoTotalMs);
	}

}
