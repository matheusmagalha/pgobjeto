public class Clinica {
    
    public void fazOrcamento(Animal a, boolean temExame){
        System.out.println(a.toString());

        int valor = a.getValorDaConsulta();
        if(temExame){ valor += a.getValorDoExame();}
        System.out.println ("total = R$" + valor + " ,00");
        
    }

    public void fazOrcamento(Animal a){
        fazOrcamento(a, false);
    }

    public void fazOrcamento(Animal[] animais, boolean temExame){
        int total = 0;
        for( Animal a: animais){
            fazOrcamento(a, temExame);
            total += a.getValorDaConsulta();
            if (temExame) { total += a.getValorDoExame(); }
            System.out.println("#########");
            System.out.println("total = R$ " + total + " ,00");
        }

    }
}
