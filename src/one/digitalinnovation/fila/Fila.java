package one.digitalinnovation.fila;

public class Fila {
	
	private No refNoEntradaFila; //referencia de entrada da fila

	public Fila() {
		
		this.refNoEntradaFila = null;
		//quando estanciar a fila já será estanciada vazia
	}
	
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	public No first() {
		if(!this.isEmpty()){
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return primeiroNo;
		}
		
		return null;
	}
	
	public No dequeue() {
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
			return primeiroNo;
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
