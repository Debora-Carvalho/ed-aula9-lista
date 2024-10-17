package aulaLista;

public class Lista {
	private int tamanho;
	private No fim;
	private No inicio;
	
	public boolean estaVazia() {  //esse metodo nao precisa receber nada, pois recebe o tamanho da propria classe
		return tamanho == 0;   
	}
	
	public Object inicio() {
		if(estaVazia()) {     //sempre verificar se a fila é nula antes de acessar o atributo
			return null;
		} 
		return inicio.info;
	}
	
	public void adicionar(Object info) {
		No no = new No(info);
		
		if (estaVazia()) {
			inicio = no;    
		} else {
			fim.prox = no;     //fim proximo aponta para o nó criado
		}
		
		fim = no;          //o nó criado aponta para o final, independente da lista estar vazia ou nao        
		tamanho++;	
	}

	
	public Object get(int index) throws Exception {  //dado um índice, retorna um valor
		if (index >= tamanho || index < 0) {
			throw new Exception("Índice inválido.");
		}
		No noAtual = inicio;
		for(int i = 0; i < index; i++) {
			noAtual = inicio.prox;
		}
		return noAtual.info;
	}
	
	
	public boolean remover(int index) throws Exception {  //dado um índice, remove um item da lista
		if (index >= tamanho || index < 0) {
			return false;
		}
		No noAtual = inicio;
		No noAnt = null;         //criar uma nova variável para acessar o nó anterior
		
		for(int i = 0; i < index; i++) {
			noAnt = noAtual;
			noAtual = noAtual.prox;
		}
		noAnt.prox = noAtual.prox;
		tamanho--;
		return true;
		
	}
}
