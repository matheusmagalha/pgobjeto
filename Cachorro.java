public class Cachorro extends Animal {
    public Cachorro(String nome, int peso) {
        super(nome, peso, "Cachorro");
    }

    @Override
    public void fazBarulho() {
        System.out.println("Au Au");
    }

    @Override
    public int getValorDaConsulta() {
        if( getPeso() > 25){
            return super.getValorDaConsulta() + 30;
        }
        return super.getValorDaConsulta();
    }

    @Override
    public int getValorDoExame() {
        return super.getValorDoExame() + 2 * getPeso();
    }

}