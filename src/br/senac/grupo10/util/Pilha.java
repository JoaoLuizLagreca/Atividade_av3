package br.senac.grupo10.util;

//FIXME: testar pilha
public class Pilha <Tipo>{

	private Object[] vetor;
	private int pos=-1;
	
	public Pilha(int capacidade) {
		if(capacidade<=0) throw new IllegalArgumentException("Capacidade deve ser maior que 0");
		this.vetor = new Object[capacidade];
	}
	
	/**Adiciona um valor no topo da pilha*/
	public void push(Tipo valor) {
		if(pos>=vetor.length-1) throw new IndexOutOfBoundsException("Estouro da pilha");
		pos++;
		vetor[pos]=valor;
	}
	
	/**Retorna o valor do topo da pilha e o remove*/
	@SuppressWarnings("unchecked")
	public Tipo pop() {
		if(pos<0) throw new IndexOutOfBoundsException("Pilha está vazia");
		pos--;
		return (Tipo)vetor[pos+1];
	}
	
	/**Retorna o valor do topo da pilha*/
	@SuppressWarnings("unchecked")
	public Tipo peek() {
		if(pos<0) throw new IndexOutOfBoundsException("Pilha está vazia");
		return (Tipo)vetor[pos];
	}
	
	/**Retorna se a pilha está vazia*/
	public boolean empty() {
		return pos<0;
	}
	
	/**Retorna o valor do índice i da pilha*/
	@SuppressWarnings("unchecked")
	public Tipo get(int i) {
		if(i>pos) throw new IndexOutOfBoundsException();
		return (Tipo) vetor[pos-i];
	}
	
	/**Retorna a capacidade da pilha*/
	public int capacity() {
		return vetor.length;
	}
	
	/**Retorna o taanho da pilha (capacidade utilizada)*/
	public int size() {
		return pos+1;
	}
	
}