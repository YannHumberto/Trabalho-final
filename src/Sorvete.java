public class Sorvete {
    // Atributos
    private String sabor;
    private String tamanho;
    private double preco;

    // Construtor
    public Sorvete(String sabor, String tamanho, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Método toString para exibir informações do sorvete
    @Override
    public String toString() {
        return "Sorvete{" +
               "sabor='" + sabor + '\'' +
               ", tamanho='" + tamanho + '\'' +
               ", preco=" + preco +
               '}';
    }
}
