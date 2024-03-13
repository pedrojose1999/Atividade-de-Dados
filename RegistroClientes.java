import java.util.HashMap;
import java.util.Map;

public class RegistroClientes {

     private Map<String, Cliente> clientes;

    public RegistroClientes() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.get(cpf);
    }
}
