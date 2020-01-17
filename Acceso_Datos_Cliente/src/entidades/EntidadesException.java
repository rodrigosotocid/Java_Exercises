package entidades;

public class EntidadesException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntidadesException() {
		super();
	}

	public EntidadesException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public EntidadesException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EntidadesException(String arg0) {
		super(arg0);	
	}

	public EntidadesException(Throwable arg0) {
		super(arg0);
	}

}
