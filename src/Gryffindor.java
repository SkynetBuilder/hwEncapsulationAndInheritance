public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int magicPower, int apparitionDistance, int nobility, int honor, int courage) {
        super(name, surname, magicPower, apparitionDistance);
        rangeCheck(nobility);
        rangeCheck(honor);
        rangeCheck(courage);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        rangeCheck(nobility);
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        rangeCheck(honor);
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        rangeCheck(courage);
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Ученик Гриффиндора " + commonCharacteristics() +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + courage;
    }
}
