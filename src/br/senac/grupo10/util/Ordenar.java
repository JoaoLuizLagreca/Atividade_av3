package br.senac.grupo10.util;

import br.senac.grupo10.util.Fila.nó;

public class Ordenar {
	
	/**Trocas*/
	public static void bubbleSort(Fila<Aluno> alunos) {
		nó<Aluno> a;
		Aluno al;
		boolean h;
		for(int i=0; i<alunos.size()-1; i++) {
			h=false;
			alunos.get(0);
			for(int j=0; j<alunos.size()-1-i; j++) {
				a = alunos.getNo();
				alunos.next();
				if(a.valor.nota<alunos.get().nota) { //Fazer a troca se o próximo valor for maior
					al=a.valor;
					a.valor=alunos.get();
					alunos.getNo().valor=al;
					h=true;
				}
			}
			if(!h)
				return; //Parar imediatamente se não houver a troca
		}
	}
	
	/**Seleção*/
	public static void selectionSort(String a[]) {
		//TODO: Ordenação por seleção
	}
	
	/**Inserção*/
	public static void insertionSort(String a[]) {
		//TODO: Ordenação por inserção
	}

}
