package br.senac.grupo10;

import br.senac.grupo10.util.Aluno;
import br.senac.grupo10.util.Fila;
import br.senac.grupo10.util.Pilha;

public class Main {
	
	private static float NOTA_MINIMA=5.0f;
	
	private static Fila<Aluno> alunos = new Fila<Aluno>();
	static { //FIXME: Testar valores
		
		alunos.add(new Aluno(9.5f, "Elisangela"));
		alunos.add(new Aluno(7.5f, "Nair"));
		alunos.add(new Aluno(5.5f, "Mariana"));
		alunos.add(new Aluno(9.5f, "Rafael"));
		alunos.add(new Aluno(7.0f, "Carlos"));
		alunos.add(new Aluno(6.5f, "Nilton"));
		alunos.add(new Aluno(5.0f, "Marcos"));
		alunos.add(new Aluno(6.5f, "Neide"));
		alunos.add(new Aluno(6.0f, "Pamela"));
		alunos.add(new Aluno(8.0f, "Flavio"));
		alunos.add(new Aluno(9.5f, "Fabricio"));
		alunos.add(new Aluno(8.5f, "Julio"));
		alunos.add(new Aluno(8.5f, "Jose"));
		alunos.add(new Aluno(6.0f, "Everton"));
		alunos.add(new Aluno(5.0f, "Emerson"));
		alunos.add(new Aluno(8.0f, "Laura"));
		alunos.add(new Aluno(9.5f, "Valeria"));
		alunos.add(new Aluno(7.5f, "Diego"));
		alunos.add(new Aluno(7.5f, "Paula"));
		alunos.add(new Aluno(9.5f, "Elisa"));
		alunos.add(new Aluno(6.0f, "Jonas"));
		alunos.add(new Aluno(8.0f, "Fernando"));
		alunos.add(new Aluno(9.5f, "Claudio"));
		alunos.add(new Aluno(6.0f, "Lucas"));
		alunos.add(new Aluno(6.5f, "Mateus"));
		alunos.add(new Aluno(9.5f, "Teodoro"));
		alunos.add(new Aluno(5.5f, "Felipe"));
		alunos.add(new Aluno(6.0f, "Jean"));
		alunos.add(new Aluno(8.5f, "Denise"));
		alunos.add(new Aluno(7.0f, "Rosana"));
	
		
	}
	
	public static void main(String args[]) {
		
		for(int i=0; i<alunos.size(); i++) {
			Aluno a=alunos.get(i);
			System.out.println(a.nota+" "+a.nome);
		}
		System.out.println();
		
	}

}
