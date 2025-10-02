// Classe TV
import java.util.ArrayList;

public class TV {
    private int numeroTV;
    private boolean ligada;
    private int volume;
    private ArrayList<Canal> canais;
    private int canalAtual;

    public TV(int numeroTV) {
        this.numeroTV = numeroTV;
        this.ligada = false;
        this.volume = 10; // volume inicial
        this.canais = new ArrayList<>();
        this.canalAtual = 0;
    }

    // Adicionar canais na TV
    public void adicionarCanal(Canal canal) {
        canais.add(canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV " + numeroTV + " ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV " + numeroTV + " desligada.");
    }

    public void aumentarVolume() {
        if(ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if(ligada && volume > 0) {
            volume--;
        }
    }

    public void proximoCanal() {
        if(ligada && !canais.isEmpty()) {
            canalAtual = (canalAtual + 1) % canais.size();
        }
    }

    public void canalAnterior() {
        if(ligada && !canais.isEmpty()) {
            canalAtual = (canalAtual - 1 + canais.size()) % canais.size();
        }
    }

    public void escolherCanal(int numero) {
        if(ligada) {
            for (int i = 0; i < canais.size(); i++) {
                if(canais.get(i).getNumero() == numero) {
                    canalAtual = i;
                    return;
                }
            }
            System.out.println("Canal " + numero + " não encontrado.");
        }
    }

    public void listarCanais() {
        if(ligada) {
            System.out.println("Lista de canais disponíveis:");
            for (Canal c : canais) {
                System.out.println(c);
            }
        }
    }

    public void verInformacoes() {
        if(ligada) {
            System.out.println("Informações da TV " + numeroTV + ":");
            System.out.println("Volume: " + volume);
            System.out.println("Canal atual: " + canais.get(canalAtual));
            System.out.println("Número da TV: " + numeroTV);
        } else {
            System.out.println("A TV está desligada.");
        }
    }
}