package orientacaoobj;

public class Gps {
    private String idioma;
    private String rota;

    public Gps(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
}
