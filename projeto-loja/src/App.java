import classes.Cliente;
import classes.Funcionario;
import classes.Pagamento;
import classes.Pedido;
import classes.Servico;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();
        Funcionario funcionario = new Funcionario(nomeFuncionario);

        System.out.println("Digite o tipo de serviço:");
        String nomeServico = scanner.nextLine();
        Servico servico = new Servico(nomeServico);

        Pedido pedido = new Pedido(cliente, servico);

        funcionario.atenderCliente(cliente);
        funcionario.realizarServico(pedido);

        Pagamento pagamento = new Pagamento(pedido);
        pagamento.realizarPagamento();

        System.out.println("Atendimento finalizado.");

        scanner.close();
    }
}