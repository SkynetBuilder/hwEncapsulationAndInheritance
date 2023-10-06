public class Slytherin extends Hogwarts{
    private int guile;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, String surname, int magicPower, int apparitionDistance, int guile, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(name, surname, magicPower, apparitionDistance);
        rangeCheck(guile);
        rangeCheck(determination);
        rangeCheck(ambition);
        rangeCheck(resourcefulness);
        rangeCheck(desireForPower);
        this.guile = guile;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public int getGuile() {
        return guile;
    }

    public void setGuile(int guile) {
        rangeCheck(guile);
        this.guile = guile;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        rangeCheck(determination);
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        rangeCheck(ambition);
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        rangeCheck(resourcefulness);
        this.resourcefulness = resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        rangeCheck(desireForPower);
        this.desireForPower = desireForPower;
    }
    @Override
    public String toString() {
        return "Ученик Слизерина " + commonCharacteristics() +
                ", хитрость " + guile +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + desireForPower;
    }
}
