public abstract class Animal {
    private String nome;
    private int peso;
    private String especie;


    private int valorDaConsulta = 100;
    private int valorDoExame = 50;

    public Animal(String nome,  int peso, String especie) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;

    }
    public abstract void fazBarulho();

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public int getValorDaConsulta() {
        return valorDaConsulta;
    }

    public int getValorDoExame() {
        return valorDoExame;
    }
    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", peso=" + peso + ", especie=" + especie + ", valorDaConsulta="
                + valorDaConsulta + ", valorDoExame=" + valorDoExame + "]";
    }

    


}