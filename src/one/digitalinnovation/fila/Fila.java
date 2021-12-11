package one.digitalinnovation.fila;

public class Fila<T> {
	
	private No<T> refNoEntradaFila; //referencia de entrada da fila

	public Fila() {
		
		this.refNoEntradaFila = null;
		//quando estanciar a fila já será estanciada vazia
	}
	
	public void enqueue(T obj) {
		No novoNo = new No(obj); // Embutindo o nó (Encapsulando)
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	public T first() {
		if(!this.isEmpty()){
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObject(); //casting
		}
		
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()){
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			
			while(true) {
				if(primeiroNo.getRefNo() !=null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject(); //casting
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		
		return refNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		//return "Fila [refNoEntradaFila=" + refNoEntradaFila + "]";
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
				noAuxiliar = noAuxiliar.getRefNo();
				
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
}
