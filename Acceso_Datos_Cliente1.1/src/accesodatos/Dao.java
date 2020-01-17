package accesodatos;

public interface Dao<T> {
	
	public Iterable<T> obtenerTodos();
	public T obtenerPorId(Long id);
	public T agregar(T t);
	public T modificar(T t);
	public void Borrar(Long id);
	}
