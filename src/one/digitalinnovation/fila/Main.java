package one.digitalinnovation.fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("primeiro"));
		minhaFila.enqueue(new No("segundo"));
		minhaFila.enqueue(new No("terceiro"));
		minhaFila.enqueue(new No("quarto"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new No("ultimo"));
		
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
	}
}
