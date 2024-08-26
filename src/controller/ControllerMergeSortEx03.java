package controller;

import br.edu.fateczl.MergeSort.OrdenacaoMergeSort;

public class ControllerMergeSortEx03 {

	public ControllerMergeSortEx03() {
		super();
	}
	
	public void ordenarMergeSort03() {
		OrdenacaoMergeSort mergeSortEx03 = new OrdenacaoMergeSort();
		
		int[] vetor = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		mergeSortEx03.ordenarMergeSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}
