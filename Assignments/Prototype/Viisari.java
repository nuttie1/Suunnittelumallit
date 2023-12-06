package Assignments.Prototype;

class Viisari implements Cloneable {
    private int arvo;
    public Viisari(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }
    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
