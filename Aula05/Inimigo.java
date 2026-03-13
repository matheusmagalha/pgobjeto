package Aula05;

public abstract class Inimigo extends Criatura{
    private int ataque;

    public Inimigo(String nome, int vida, int ataque) {
        super(nome, vida);
        this.ataque = ataque;
    }
    
    public void fazAtaque(Criatura alvo){
        alvo.tomaDano(this.ataque);
    }

    
    
}