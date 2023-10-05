public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int magicPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, magicPower, apparitionDistance);
        rangeCheck(diligence);
        rangeCheck(loyalty);
        rangeCheck(honesty);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        rangeCheck(diligence);
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        rangeCheck(loyalty);
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        rangeCheck(honesty);
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return "Ученик Пуффендуя " + commonCharacteristics() +
                ", трудолюбие " + diligence +
                ", верность " + loyalty +
                ", честность " + honesty;
    }
}
