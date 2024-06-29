import java.util.List;

public class ServicoSorvete {
    // Método para adicionar um novo sorvete à lista
    public static void adicionarSorvete(List<Sorvete> sorvetes, String sabor, String tamanho, double preco) {
        Sorvete sorvete = new Sorvete(sabor, tamanho, preco);
        sorvetes.add(sorvete);
        System.out.println("Sorvete adicionado: " + sorvete);
    }

    // Método para listar todos os sorvetes disponíveis
    public static void listarSorvetes(List<Sorvete> sorvetes) {
        System.out.println("Lista de Sorvetes:");
        for (Sorvete sorvete : sorvetes) {
            System.out.println(sorvete);
        }
    }
}
