package br.senac.grupo10.util;

public class Fila<Tipo> {
	
	public static class nó<Tipo>{
		Tipo valor;
		nó<Tipo> prox, ant;
		private Fila<Tipo> fila;
	}
	
	public nó<Tipo> inicio, fim;
	private nó<Tipo> select;
	private int pos, tamanho;
	
	public Fila() {
		pos=0;
		tamanho=0;
	}
	
	/**Adiciona um nó com o designado valor*/
	public void add(nó<Tipo> n) {
		n.prox=null;
		n.ant = fim;
		if(fim!=null) fim.prox=n;
		fim=n;
		if(inicio==null) inicio=n;
		n.fila=this;
		if(select==null) 
			select=n;
		
		tamanho++;
	}
	
	/**Adiciona um valor, retornando seu nó*/
	public nó<Tipo> add(Tipo valor) {
		nó<Tipo> n = new nó<Tipo>();
		n.valor=valor;
		add(n);
		
		return n;
	}
	
	/**Remove um nó*/
	public void remove(nó<Tipo> n) {
		if(n.fila!=this) throw new IllegalArgumentException("O nó não pertence à essa fila");
		if(n.ant!=null) n.ant.prox=n.prox;
		if(n.prox!=null) n.prox.ant=n.ant;
		if(select==n) {
			if(n.prox!=null) {
				select=n.prox;
			}else {
				select=n.ant;
				pos--;
				if(pos<0)pos=0;
			}
		}
		n.fila=null;
		tamanho--;
	}
	
	/**Retorna o tamanho da fila*/
	public int size() {
		return tamanho;
	}
	
	/**Retorna a posição de busca atual da fila*/
	public int position() {
		return pos;
	}
	
	/**Retorna o valor da posição atual da fila*/
	public Tipo get() {
		return select.valor;
	}
	
	/**Retorna o nó da posição atual da Fila*/
	public nó<Tipo> getNo(){
		return select;
	}
	
	/**Retorna o valor de um designado índice da fila*/
	public Tipo get(int index) {
		return getNo(index).valor;
	}
	
	/**Retorna o nó de um designado índice da fula*/
	public nó<Tipo> getNo(int index){
		
		if(index==0) {
			select=inicio;
			pos=0;
			return select;
		}else if(index==size()-1) {
			select=fim;
			pos=size()-1;
			return select;
		}
		
		int inc;
		if(index>pos) 
			inc=1;
		else if(index<pos)
			inc=-1;
		else
			return select;
		
		for(int i=pos; i!=index; i+=inc)
			if(inc>0)
				next();
			else
				prev();
		
		return select;
	}
	
	/**Busca o próximo valor*/
	public Tipo next() {
		return nextNo().valor;
	}
	
	/**Busca o próximo nó*/
	public nó<Tipo> nextNo(){
		if(select==null || select.prox==null)
			throw new IndexOutOfBoundsException("Estouro da fila");
		pos++;
		select=select.prox;
		return select;
	}
	
	/**Busca o valor anterior*/
	public Tipo prev() {
		return prevNo().valor;
	}
	
	/**Busca o nó anterior*/
	public nó<Tipo> prevNo(){
		if(select==null || select.ant==null)
			throw new IndexOutOfBoundsException("Estouro da fila");
		pos--;
		select=select.ant;
		return select;
	}
	
	/**Clona a fila com novos nós de mesmos valores*/
	public Fila<Tipo> clone(){
		Fila<Tipo> f = new Fila<Tipo>();
		
		Tipo a=get(0);
		f.add(a);
		for(int i=0; i<size()-1; i++) {
			a=next();
			f.add(a);
		}
		return f;
	}
	//TODO: Criar furaFila(). Opcional.

}
