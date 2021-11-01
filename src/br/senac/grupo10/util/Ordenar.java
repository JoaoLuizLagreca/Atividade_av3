package br.senac.grupo10.util;

import br.senac.grupo10.util.Fila.nó;

public class Ordenar {
	
	/**Ordenação de Trocas*/
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
	
	/**Ordenação de Seleção*/
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
	
	/**Ordenação de Inserção*/
	public static void insertionSort(Fila<Aluno> alunos) {
		nó<Aluno> a, b, c, cp, ca, ba;
		
		if(alunos.size()<=1) return; //Encerra se a lista tiver nenhum ou 0 elementos
		
		alunos.get(0);
		alunos.next(); //Começar na posição 1 (usar get(0) e next() é mais rápido que get(1))
		a=alunos.getNo();
		for(int i=1; i<alunos.size(); i++) { //À cada nó, da esquerda pra direita
			b=a;
			while(b.ant!=null && b.ant.valor.nota < a.valor.nota) { //Encontrar o último menor valor à esquerda
				b=b.ant;
			}
			c=a;
			a=a.prox;
			if(b!=c) { //Se encontrado um valor menor
				//Mudar a referência ant e prox de seus nós, mudando a localização de todos os seus valores na fila do ponto b até a(c)
				
				ca = c.ant;
				cp = c.prox;
				ba = b.ant;
				
				if(cp!=null)cp.ant = ca;
				c.ant=ba;
				b.ant = c;
				c.prox=b;
				if(ca!=null)ca.prox = cp;
				if(ba!=null)ba.prox = c;
				
				if(cp==null) 
					alunos.fim=ca;
				if(ba==null)
					alunos.inicio=c;
				
			}
			
		}
		
		alunos.get(0);//Reiniciar buscador para prevenir bugs
	}

}
