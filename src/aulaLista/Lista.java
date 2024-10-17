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
			throw new Exception("Índice inválido");
		}
		Object info = inicio.info;
		
		inicio = inicio.prox;
		tamanho--;
		if(tamanho == 0) {
			fim = null;
		}
		return info;
	
	}
}
