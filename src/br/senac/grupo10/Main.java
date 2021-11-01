package br.senac.grupo10;

import br.senac.grupo10.util.Aluno;
import br.senac.grupo10.util.Pilha;

public class Main {
	
	
	private static Pilha<Aluno> alunos=new Pilha<Aluno>(30);
	static { //FIXME: Testar valores
		
		alunos.push(new Aluno(7.0f, "Rosana"));
		alunos.push(new Aluno(8.5f, "Denise"));
		alunos.push(new Aluno(6.0f, "Jean"));
		alunos.push(new Aluno(5.5f, "Felipe"));
		alunos.push(new Aluno(9.5f, "Teodoro"));
		alunos.push(new Aluno(6.5f, "Mateus"));
		alunos.push(new Aluno(6.0f, "Lucas"));
		alunos.push(new Aluno(9.5f, "Claudio"));
		alunos.push(new Aluno(8.0f, "Fernando"));
		alunos.push(new Aluno(6.0f, "Jonas"));
		alunos.push(new Aluno(9.5f, "Elisa"));
		alunos.push(new Aluno(7.5f, "Paula"));
		alunos.push(new Aluno(7.5f, "Diego"));
		alunos.push(new Aluno(9.5f, "Valeria"));
		alunos.push(new Aluno(8.0f, "Laura"));
		alunos.push(new Aluno(5.0f, "Emerson"));
		alunos.push(new Aluno(6.0f, "Everton"));
		alunos.push(new Aluno(8.5f, "Jose"));
		alunos.push(new Aluno(8.5f, "Julio"));
		alunos.push(new Aluno(9.5f, "Fabricio"));
		alunos.push(new Aluno(8.0f, "Flavio"));
		alunos.push(new Aluno(6.0f, "Pamela"));
		alunos.push(new Aluno(6.5f, "Neide"));
		alunos.push(new Aluno(5.0f, "Marcos"));
		alunos.push(new Aluno(6.5f, "Nilton"));
		alunos.push(new Aluno(7.0f, "Carlos"));
		alunos.push(new Aluno(9.5f, "Rafael"));
		alunos.push(new Aluno(5.5f, "Mariana"));
		alunos.push(new Aluno(7.5f, "Nair"));
		alunos.push(new Aluno(9.5f, "Elisangela"));
		
	}
	
	public static void main(String args[]) {
		
	}

}
