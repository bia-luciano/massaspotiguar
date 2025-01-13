package pi2;

public class Materiaprima {
    String tipo;
    Double quantidades;

    public Materiaprima(String tipo, Double quantidades) {
        this.tipo = tipo;
        this.quantidades = quantidades;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(Double quantidades) {
        this.quantidades = quantidades;
    }

    
}
