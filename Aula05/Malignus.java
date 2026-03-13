package Aula05;

public class Malignus extends Inimigo {

    public Malignus() {
        super("malignus", 1000, 50);
        
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("eu vou te mataaarrr...");
      
    }

    @Override
    public void fraseMorte() {
       
        System.out.println("nããããããããoooooooooo!!!");
    }
    
}
