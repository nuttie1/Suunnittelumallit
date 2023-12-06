package Assignments.Prototype;

class Kello implements Cloneable {
    Viisari tunti;
    Viisari minuutti;
    Viisari sekunti;

    public Kello(int tunti, int minuutti, int sekunti) {
        this.tunti = new Viisari(tunti);
        this.minuutti = new Viisari(minuutti);
        this.sekunti = new Viisari(sekunti);
    }

    // Matala
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // Syvä
    public Kello syvaKopioi() {
        Kello klooni = (Kello) this.clone();
        klooni.tunti = (Viisari) this.tunti.clone();
        klooni.minuutti = (Viisari) this.minuutti.clone();
        klooni.sekunti = (Viisari) this.sekunti.clone();
        return klooni;
    }

    @Override
    public String toString() {
        return tunti.getArvo() + ":" + minuutti.getArvo() + ":" + sekunti.getArvo();
    }
}
