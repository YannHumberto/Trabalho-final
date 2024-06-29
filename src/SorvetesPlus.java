import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SorvetesPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Sorvete> sorvetes = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Loja de Sorvetes =====");
            System.out.println("1. Adicionar Sorvete");
            System.out.println("2. Listar Sorvetes");
            System.out.println("3. Adicionar Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Realizar Venda");
            System.out.println("6. Listar Vendas");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o próximo int

            switch (opcao) {
                case 1:
                    System.out.print("Digite o sabor do sorvete: ");
                    String sabor = scanner.nextLine();
                    System.out.print("Digite o tamanho do sorvete (P, M, G): ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Digite o preço do sorvete: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha após o próximo double
                    ServicoSorvete.adicionarSorvete(sorvetes, sabor, tamanho, preco);
                    break;
                case 2:
                    ServicoSorvete.listarSorvetes(sorvetes);
                    break;
                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneCliente = scanner.nextLine();
                    ServicoCliente.adicionarCliente(clientes, nomeCliente, telefoneCliente);
                    break;
                case 4:
                    ServicoCliente.listarClientes(clientes);
                    break;
                case 5:
                    if (clientes.isEmpty() || sorvetes.isEmpty()) {
                        System.out.println("Não é possível realizar venda. Clientes ou sorvetes não cadastrados.");
                    } else {
                        System.out.println("Selecione o cliente para a venda:");
                        ServicoCliente.listarClientes(clientes);
                        System.out.print("Digite o número do cliente: ");
                        int indiceCliente = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha após o próximo int

                        System.out.println("Selecione o sorvete para a venda:");
                        ServicoSorvete.listarSorvetes(sorvetes);
                        System.out.print("Digite o número do sorvete: ");
                        int indiceSorvete = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha após o próximo int

                        Cliente clienteSelecionado = clientes.get(indiceCliente - 1);
                        Sorvete sorveteSelecionado = sorvetes.get(indiceSorvete - 1);

                        Venda venda = new Venda(clienteSelecionado, sorveteSelecionado);
                        vendas.add(venda);
                        System.out.println("Venda realizada com sucesso: " + venda);
                    }
                    break;
                case 6:
                    if (vendas.isEmpty()) {
                        System.out.println("Nenhuma venda realizada ainda.");
                    } else {
                        System.out.println("Lista de Vendas:");
                        for (int i = 0; i < vendas.size(); i++) {
                            System.out.println((i + 1) + ". " + vendas.get(i));
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
