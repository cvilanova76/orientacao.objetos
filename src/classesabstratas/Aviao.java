package classesabstratas;

public class Aviao extends Veiculo{


    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 100);
    }
}
