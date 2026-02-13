public class Aula01 {
    public static void main(String args[]) {
        Carro c1 = new Carro("Fusca", "Azul", 1973, "Volkswagen", "ABC-1234", 1.3, 2, 100);
        c1.mostraInfo();
        c1.anda(); 
        c1.anda(); 

        Carro c2 = new Carro("Corsa", "Preto", 2005, "Chevrolet", "DEF-5678", 1.0, 4, 100);
        c2.mostraInfo();
        c2.anda();

        Carro c3 = new Carro("Uno", "Prata", 2010, "Fiat", "XYZ-9012", 1.0, 4, 10); // Esse uno já começa com o tanque na reserva (10%)
        c3.mostraInfo();
        c3.anda(); 
        c3.anda(); 
    }
}
