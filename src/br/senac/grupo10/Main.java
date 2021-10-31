package br.senac.grupo10;

import br.senac.grupo10.util.Pilha;

public class Main {
	
	static class Aluno{
		Aluno(float nota, String nome){
			this.nota=nota;
			this.nome=nome;
		}
		float nota;
		String nome;
	}
	
	
	private static Pilha<Aluno> alunos=new Pilha<Aluno>(18);
	static { //FIXME: Testar valores
		alunos.push(new Aluno(7.0f, "Carlos"));
		alunos.push(new Aluno(7.0f, "Rosana"));
		alunos.push(new Aluno(7.5f, "Diego"));
		alunos.push(new Aluno(7.5f, "Nair"));
		alunos.push(new Aluno(7.5f, "Paula"));
		alunos.push(new Aluno(8.0f, "Fernando"));
		alunos.push(new Aluno(8.0f, "Flavio"));
		alunos.push(new Aluno(8.0f, "Laura"));
		alunos.push(new Aluno(8.5f, "Denise"));
		alunos.push(new Aluno(8.5f, "Jose"));
		alunos.push(new Aluno(8.5f, "Julio"));
		alunos.push(new Aluno(9.5f, "Claudio"));
		alunos.push(new Aluno(9.5f, "Elisa"));
		alunos.push(new Aluno(9.5f, "Elisangela"));
		alunos.push(new Aluno(9.5f, "Fabricio"));
		alunos.push(new Aluno(9.5f, "Rafael"));
		alunos.push(new Aluno(9.5f, "Teodoro"));
		alunos.push(new Aluno(9.5f, "Valeria"));
	}
	
	public static void main(String args[]) {
		
	}

}
