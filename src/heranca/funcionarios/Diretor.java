package heranca.funcionarios;

public class Diretor extends Funcionario {
    private String superSenha;

    public Diretor(String nome, String cpf, double salario, String superSenha) {
        super(nome, cpf, salario);
        this.superSenha = superSenha;
    }

    public String getSuperSenha() {
        return superSenha;
    }

    public void setSuperSenha(String superSenha) {
        this.superSenha = superSenha;
    }
}
