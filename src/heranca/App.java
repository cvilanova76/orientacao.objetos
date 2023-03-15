package heranca;
import heranca.funcionarios.Engenheiro;
import heranca.funcionarios.Gerente;
import heranca.funcionarios.Diretor;
import heranca.funcionarios.Secretario;

public class App {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("José da Silva", "11122233334", 4000.00, 1234, 35);
        Diretor diretor = new Diretor("Francisco José", "67867867878", 10000.00, "superSenha@s");
        Secretario secretario = new Secretario("Felipe Antonio", "78978978999", 2500.00, "", "");
        Engenheiro engenheiro = new Engenheiro("Antonio Felipe", "34534534545", 15000.00, "234/SP", "345/SP");

        System.out.println("Salário Gerente: " + gerente.getSalario());
        System.out.println("Salário Diretor: " + diretor.getSalario());
        System.out.println("Salário Secretário: " + secretario.getSalario());
        System.out.println("Salário Engenheiro: " + engenheiro.getSalario());

        System.out.println("Bonificação Gerente: " + gerente.getBonificacao());
        System.out.println("Bonificação Diretor: " + diretor.getBonificacao());
        System.out.println("Bonificação Secretário: " + secretario.getBonificacao());
        System.out.println("Bonificação Engenheiro: " + engenheiro.getBonificacao());
    }
}
