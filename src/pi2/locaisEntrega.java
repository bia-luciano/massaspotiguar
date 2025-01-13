package pi2;

public class locaisEntrega {
    String Enderecos;
    String biscoitos;
    Double valores;

    public locaisEntrega(String Enderecos, String biscoitos, Double valores) {
        this.Enderecos = Enderecos;
        this.biscoitos = biscoitos;
        this.valores = valores;
    }

    public String getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(String Enderecos) {
        this.Enderecos = Enderecos;
    }

    public String getBiscoitos() {
        return biscoitos;
    }

    public void setBiscoitos(String biscoitos) {
        this.biscoitos = biscoitos;
    }

    public Double getValores() {
        return valores;
    }

    public void setValores(Double valores) {
        this.valores = valores;
    }
    
}
