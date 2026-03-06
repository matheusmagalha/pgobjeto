public class Main {
    public static void main(String[] args){
        Clinica c = new Clinica();

     Animal a1 = new Cachorro("Belinha", 20);
     Animal a2 = new Gato("Pretinho", 4);

     a1.fazBarulho();
     a2.fazBarulho();
     
     
     c.fazOrcamento(a1, true);
     c.fazOrcamento(a2);

     //{

     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     
    //}

     
     
    }
}