public class Gato extends Animal {
    public Gato(String nome, int peso) {
        super(nome, peso, "Gato");
    }

    @Override
    public void fazBarulho() {
        System.out.println("Miau");
    }

    @Override
    public int getValorDoExame(){
        return super.getValorDoExame() -20;
        
    }


}