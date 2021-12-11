package one.digitalinnovation.fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("ultimo");
		
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
	}
}
