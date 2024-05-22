package esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente cliente, Articolo[] articoli) {
        this.cliente = cliente;
        this.articoli = articoli;
        calcolaTotaleCostoArticoli();
    }

    private void calcolaTotaleCostoArticoli() {
        totaleCostoArticoli = 0;
        for (Articolo articolo: articoli) {
            totaleCostoArticoli += articolo.getPrezzo();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }
}
