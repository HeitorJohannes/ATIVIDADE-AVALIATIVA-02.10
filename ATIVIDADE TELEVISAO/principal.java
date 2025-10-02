// Classe Principal
public class Principal {
    public static void main(String[] args) {
        TV tv = new TV(1);

        // Criando canais
        tv.adicionarCanal(new Canal(2, "Globo"));
        tv.adicionarCanal(new Canal(4, "SBT"));
        tv.adicionarCanal(new Canal(5, "Record"));
        tv.adicionarCanal(new Canal(7, "Band"));
        tv.adicionarCanal(new Canal(11, "RedeTV"));

        // Teste
        tv.ligar();
        tv.verInformacoes();
        
        tv.listarCanais();
        tv.proximoCanal();
        tv.verInformacoes();

        tv.escolherCanal(5);
        tv.verInformacoes();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.verInformacoes();

        tv.desligar();
        tv.verInformacoes();
    }
}