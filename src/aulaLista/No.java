package aulaLista;

public class No {
	Object info;
	No prox;
	
	No(Object info){
		this.info = info;   //this serve para indicar que está acessando o atributo da classe
		this.prox = null;   //this é obrigatorio quando existe um parametro com o mesmo nome de um atributo
	}
}
