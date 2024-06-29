import java.util.List;

public class ServicoCliente {
    // Método para adicionar um novo cliente à lista
    public static void adicionarCliente(List<Cliente> clientes, String nome, String telefone) {
        Cliente cliente = new Cliente(nome, telefone);
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente);
    }

    // Método para listar todos os clientes cadastrados
    public static void listarClientes(List<Cliente> clientes) {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

