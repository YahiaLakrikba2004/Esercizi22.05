package esercizio2;

public void Chiamata(String numeroChiamato, int durata) {
    this.numeroChiamato = numeroChiamato;
    this.durata = durata;
}

public String getNumeroChiamato() {
    return numeroChiamato;
}

public int getDurata() {
    return durata;
}

@Override
public String toString() {
    return "Chiamata{" +
            "numeroChiamato='" + numeroChiamato + '\'' +
            ", durata=" + durata +
            " minuti}";
}

