package pi2;

public class CadastroBiscoito {
    String tipo;
    Double quantidade;

    public CadastroBiscoito(String tipo, Double quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    
}
