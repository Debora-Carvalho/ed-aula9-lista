package aulaLista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		System.out.println(lista.estaVazia() ? "Vazia" : "Não vazia");  //operador ternário
		lista.adicionar("a");
		lista.adicionar("b");
		lista.adicionar("c");
		lista.adicionar("d");
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i));		
		}
		
		lista.remover(2);
		
		//agora, a letra c estará removida da letra
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i));		
		}
		

	}

}
