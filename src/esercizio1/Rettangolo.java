package esercizio1;

public class Rettangolo {
    private int altezza;
    private int largezza;

    public Rettangolo(int altezza, int largezza) {
        this.altezza = altezza;
        this.largezza = largezza;
    }

    // getter di altezza e larghezza
    public int getAltezza() {
        return altezza;
    }

    public int getLargezza() {
        return largezza;
    }

    //calcolo Area
    public int calcolaArea() {
        return altezza * largezza;
    }

    //calcolo Perimetro
    public int calcolaPerimetro() {
        return 2 * (altezza + largezza);
    }

    //setter  altezza e larghezza

    public void setAltezza(int altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("L'altezza deve essere un valore positivo.");
        }
    }

    public void setLargezza(int largezza) {
        if (largezza > 0) {
            this.largezza = largezza;
        } else {
            System.out.println("La larghezza deve essre un valore positivo.");
        }
    }


    //principale


    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);


        System.out.println("Area" + rettangolo.calcolaArea());
        System.out.println("perimetro" + rettangolo.calcolaPerimetro());


        rettangolo.setAltezza(10);
        rettangolo.setLargezza(10);

        System.out.println("Nuova area:" + rettangolo.calcolaArea());
        System.out.println("nuovo Perimetro" + rettangolo.calcolaPerimetro());


        //Metodo StampaRettangolo

//    public void stampaRettangolo() {
//        System.out.println("Area" + this.calcolaArea());
//        System.out.println("Perimetro" + this.calcolaPerimetro());
//    }
//
//
//
//    public static void main (String[] args) {
//        Rettangolo rettangolo = new Rettangolo(5,10);
//
//
//        rettangolo.stampaRettangolo();
//
//
//        rettangolo.setAltezza(10);
//        rettangolo.setLargezza(10);
//
//        rettangolo.stampaRettangolo();
//
//    }

//    //metodo stampaDueRettangoli
//
//    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
//        System.out.println("Rettangolo 1:");
//        r1.stampaRettangolo();
//
//        System.out.println("Rettangolo 2");
//        r2.stampaRettangolo();
//
//        int sommaAree = r1.calcolaArea() + r2.calcolaArea();
//        int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
//
//        System.out.println("Somma delle aree:" + sommaAree);
//        System.out.println("Somma dei perimetri" + sommaPerimetri);
//    }
//
//    public static void main (String[] args) {
//        Rettangolo rettangolo1 = new Rettangolo(5,10);
//        Rettangolo rettangolo2 = new Rettangolo(7,36);
//
//        stampaDueRettangoli(rettangolo1, rettangolo2);
//    }


    }

}




