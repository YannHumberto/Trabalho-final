import java.time.LocalDateTime;

public class Venda {
    // Atributos
    private Cliente cliente;
    private Sorvete sorvete;
    private LocalDateTime dataHora;

    // Construtor
    public Venda(Cliente cliente, Sorvete sorvete) {
        this.cliente = cliente;
        this.sorvete = sorvete;
        this.dataHora = LocalDateTime.now();
    }

    // Método toString para exibir informações da venda
    @Override
    public String toString() {
        return "Venda{" +
               "cliente=" + cliente +
               ", sorvete=" + sorvete +
               ", dataHora=" + dataHora +
               '}';
    }
}
