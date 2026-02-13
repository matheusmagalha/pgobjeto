public class Carro {
    String modelo;
    String cor;
    int ano;
    String marca;
    String placa;
    double potencia;
    int numeroDePortas;
    int tanque;

    Carro(String _modelo, String _cor, int _ano, String _marca, String _placa, double _potencia, int _numeroDePortas, int _tanque) {
        modelo =  _modelo;
        cor = _cor;
        ano = _ano;
        marca = _marca;
        placa = _placa;
        potencia = _potencia;
        numeroDePortas = _numeroDePortas;
        tanque = _tanque;
    }

    
    void anda() {
        if (tanque > 0) {
            System.out.println("Vrum vrum! O " + modelo + " está andando...");
            tanque = tanque - 10; 
            System.out.println("Combustível restante: " + tanque + "%");
        } else {
            System.out.println("O " + modelo + " tentou andar, mas o tanque está vazio! Vai ter que empurrar.");
        }
        System.out.println("-------------------------");
    }

    void mostraInfo() {
        System.out.println(
            "##-CARRO-##\n" +
            "Modelo: " + modelo + "\n" +
            "Cor: " + cor + "\n" +
            "Ano: " + ano + "\n" +
            "Marca: " + marca + "\n" +
            "Placa: " + placa + "\n" +
            "Potencia: " + potencia + "\n" +
            "Numero de Portas: " + numeroDePortas + "\n" +
            "Tanque: " + tanque + "%\n"
        );
    }
}