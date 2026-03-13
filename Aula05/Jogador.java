package Aula05;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;


public class Jogador extends Criatura {
    

    private int ataquePerto = 40;
    private int ataqueLonge = 150;

    public Jogador(String nome) {
        super(nome, 900);
        
    }




    @Override
    public void fazAtaque(Criatura alvo) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faça - Dano=" + ataquePerto);
        System.out.println("2) Pistola - Dano=" + ataqueLonge + " - Chance = 50%");

        int escolha = sc.nextInt();
        while (escolha < 1 || escolha > 2){
            System.out.println("Número invalido digite novamente");
            escolha = sc.nextInt();
        }
        if(escolha == 1){
            alvo.tomaDano(this.ataquePerto);
        } else {
            Random rd = new Random();
            int sorteio = rd.nextInt(0, 100);
            if (sorteio >= 50) {
                alvo.tomaDano(this.ataqueLonge);
            } else {
                System.out.println("");
            }
        }

    }


    @Override
    public void fraseApresentacao() {
      System.out.println("eu lhe avisei, agora sofra");
    }

    @Override
    public void fraseMorte() {
        System.out.println("irei voltar mais forte");
    }
    
}
