package esercizio3;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("SOO1", "Smartphone", 399.99, 1000);
        Articolo articolo2 = new Articolo("HOO1", "Laptop", 1899.99, 20000);
        Cliente cliente1 = new Cliente("COO1", "Franco Franchi", "FrancoFranchi@gmail.com", new Date());
        Articolo[] articoliCarello = {articolo1, articolo2};
        Carrello carrelloCliente1 = new Carrello(cliente1, articoliCarello);

        System.out.println("Il totale costo degli articoli nel carrello di "+ cliente1.getNomeCognome()+ " è di = " + carrelloCliente1.getTotaleCostoArticoli()+ "€");
        System.out.println("L'email di "+ cliente1.getNomeCognome() + " è " + cliente1.getEmail() + " Iscritto in data " + cliente1.getDataIscrizione());
        System.out.println("La quantità disponibile in magazzino degli " + articolo1.getDescrizione()+ " è = " + articolo1.getQuantitaDisponibile() + " pz" );
    }
}
