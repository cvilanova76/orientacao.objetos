package polimorf;

public class Pessoa {
    private String nome;

    public Pessoa(){}
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void mostraClasse(){
        System.out.println("Classe: " + this.getClass().getSimpleName());
    }
}