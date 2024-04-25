package classes;

public class Pedido {

    private Cliente cliente;
    private Servico servico;

    public Pedido(Cliente cliente, Servico servico) {
        this.cliente = cliente;
        this.servico = servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }
}