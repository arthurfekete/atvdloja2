package classes;

public class Pagamento {

    private Pedido pedido;

    public Pagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento realizado para pedido " + pedido.toString());
    }
}