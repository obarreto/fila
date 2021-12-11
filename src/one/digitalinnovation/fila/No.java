package one.digitalinnovation.fila;

public class No<T> { //willdcard
	
	private T object;
	private No<T> refNo;
	
	//construtor padrão
	public No() {
		}
	
	public No(T object) {
		this.refNo = null;
		this.object = object;
		}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
}
