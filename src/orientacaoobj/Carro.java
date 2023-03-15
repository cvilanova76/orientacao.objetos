package orientacaoobj;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int qtdPortas;
    int potenciaCavalos;
    double velocidadeMaxima;
    int qtdMarchas;

    boolean temArCondicionado;
    boolean estaLigado = false;

    public void liga (boolean estaLigado){
        if(estaLigado == false){
            this.estaLigado = true;
        }
    }
}

