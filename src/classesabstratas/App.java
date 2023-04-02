package classesabstratas;

public class App {
    public static void main(String[] args) {

        Automovel automovel = new Automovel();
        Aviao aviao = new Aviao();

        System.out.println("Automóvel: " + automovel.isStatus());
        automovel.ligar();
        System.out.println("Automóvel: " + automovel.isStatus());
        System.out.println("Automóvel: " + automovel.getVelocidade());
        automovel.acelerar();
        automovel.acelerar();
        automovel.acelerar();
        automovel.acelerar();
        automovel.acelerar();
        System.out.println("Automóvel: " + automovel.getVelocidade() + "km/h");

        System.out.println("Avião: " + aviao.isStatus());
        aviao.ligar();
        System.out.println("Avião: " + aviao.isStatus());

        System.out.println("Avião: " + aviao.getVelocidade());
        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        System.out.println("Aviao: " + aviao.getVelocidade() + "km/h");

    }

}
