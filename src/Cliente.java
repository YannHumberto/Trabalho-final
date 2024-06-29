public class Cliente {
    // Atributos
    private String nome;
    private String telefone;

    // Construtor
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método toString para exibir informações do cliente
    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", telefone='" + telefone + '\'' +
               '}';
    }
}
