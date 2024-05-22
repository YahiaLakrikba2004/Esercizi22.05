package esercizio2;
import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new ArrayList<>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public List<Chiamata> getChiamate() {
        return chiamate;
    }

    public void aggiungiChiamata(String numeroChiamato, int durata) {
        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
        chiamate.add(chiamata);
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            this.credito += importo;
        } else {
            System.out.println("Importo di ricarica non valido.");
        }
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : chiamate) {
            System.out.println(chiamata);
        }
    }

    public static void main(String[] args) {
        // Creazione di una nuova SIM
        Sim miaSim = new Sim("0234567890");

        // Ricarica della SIM
        miaSim.ricarica(10);

        // Aggiunta di chiamate
        miaSim.aggiungiChiamata("0987654321", 10);
        miaSim.aggiungiChiamata("1122334455", 5);

        // Stampa dei dati della SIM
        miaSim.stampaDatiSim();
    }
}
