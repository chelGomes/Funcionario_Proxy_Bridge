public class Empresario {
    private String nome;
    private boolean gerente;

    public Empresario(String nome, boolean gerente){
        this.nome = nome;
        this.gerente = gerente;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
}
