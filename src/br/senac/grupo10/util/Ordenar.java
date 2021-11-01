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
	public static void selectionSort(Fila<Aluno> alunos) {
		nó<Aluno> a, b;
		Aluno al;
		nó<Aluno> menor;
		alunos.get(0);
		for(int i=0; i<alunos.size()-1; i++) {
			a=alunos.getNo();
			b=a;
			menor=a;
			for(int j=i; j<alunos.size()-1; j++) { //Verificar na fila a partir do i
				
				b=b.prox;
				if(menor.valor.nota<b.valor.nota) //Encontrado um valor maior que o anteriormente encontrado
					menor=b;
				
			}
			
			if(menor!=a) { //Realizar a troca caso encontrado um maior
				al=a.valor;
				a.valor=menor.valor;
				menor.valor=al;
			}
			
			alunos.next();
		}
		
	}
	
	/**Inserção*/
	public static void insertionSort(String a[]) {
		//TODO: Ordenação por inserção
	}

}
