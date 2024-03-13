import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
          // Criando o registro de clientes
        RegistroClientes registro = new RegistroClientes();

        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando os detalhes do cliente cinco vezes
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os detalhes do cliente " + (i+1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Número de celular: ");
            String celular = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            // Criando um novo cliente com os detalhes fornecidos
            Cliente cliente = new Cliente(nome, cpf, celular, email);

            // Adicionando o cliente ao registro
            registro.adicionarCliente(cliente);
        }

        // Solicitando o CPF para a busca
        System.out.print("Digite o CPF do cliente que você deseja buscar: ");
        String cpfBusca = scanner.nextLine();

        // Buscando o cliente pelo CPF
        Cliente clienteBuscado = registro.buscarCliente(cpfBusca);
        if (clienteBuscado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + clienteBuscado.getNome());
            System.out.println("CPF: " + clienteBuscado.getCpf());
            System.out.println("Número de celular: " + clienteBuscado.getCelular());
            System.out.println("Email: " + clienteBuscado.getEmail());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Fechando o scanner
        scanner.close();
    }

        
    }

