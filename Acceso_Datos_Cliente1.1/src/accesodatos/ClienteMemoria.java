package accesodatos;

import java.util.GregorianCalendar;
import java.util.TreeMap;

import entidades.Cliente;

public class ClienteMemoria implements Dao<Cliente> {
	
	private TreeMap<Long, Cliente> clientes = new TreeMap<>();
	
	//SINGLETON
	private ClienteMemoria() {
		
		clientes.put(1L, new Cliente(1L, "Rodrigo", "Soto", "79224857T", new GregorianCalendar(1982,3-1,28).getTime()));
		clientes.put(2L, new Cliente(2L, "Alejandro", "Cid", "48577922L", new GregorianCalendar(1996,11-1,15).getTime()));
		clientes.put(3L, new Cliente(3L, "Romina", "Amín", "28747922R", new GregorianCalendar(1985,19-1,5).getTime()));
	}
	
	private final static ClienteMemoria INSTANCIA = new ClienteMemoria();
	
	public static ClienteMemoria getInstancia() {
		return INSTANCIA;
	}
	//FIN SINGLETON

	@Override
	public Iterable<Cliente> obtenerTodos() {
		return clientes.values();
	}

	@Override
	public Cliente obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return clientes.get(id);
	}

	@Override
	public Cliente agregar(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}

	@Override
	public Cliente modificar(Cliente cliente) {
		clientes.replace(cliente.getId(), cliente);
		return cliente;
	}

	@Override
	public void Borrar(Long id) {
		clientes.remove(id);
		
	}
	


}
