package classes;

public class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void atenderCliente(Cliente cliente) {
        System.out.println("Funcionário " + nome + " atendendo cliente " + cliente.getNome());
    }

    public void realizarServico(Pedido pedido) {
        System.out.println("Funcionário " + nome + " realizando serviço " + pedido.getServico().getNome());
    }
}