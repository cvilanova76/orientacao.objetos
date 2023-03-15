package tv;

public class televisor {
 int volume;
 int canal;

 public void aumentaVolume(){
     volume++;
 }
    public void diminuiVolume(){
     volume--;
    }

    public void trocarCanal(){

    }

    public void mostrarInfo(){
     System.out.println("Canal: " + canal + " Volume: " + volume);
    }
}
