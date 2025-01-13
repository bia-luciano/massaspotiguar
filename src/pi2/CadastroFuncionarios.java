package pi2;

public class CadastroFuncionarios {
    
    String nome;
    String CPF;
    String atuacao;

    public CadastroFuncionarios(String nome, String CPF, String atuacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.atuacao = atuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    public void exibeDados(){
        System.out.println("Nome do Funcionário: "+ nome);
        System.out.println("Cpf: "+ CPF);
        System.out.println("Área de atuação: "+ atuacao);
        
        
    }
}
