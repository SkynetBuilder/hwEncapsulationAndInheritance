public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int artistry;

    public Ravenclaw(String name, String surname, int magicPower, int apparitionDistance, int intelligence, int wisdom, int wit, int artistry) {
        super(name, surname, magicPower, apparitionDistance);
        rangeCheck(intelligence);
        rangeCheck(wisdom);
        rangeCheck(wit);
        rangeCheck(artistry);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.artistry = artistry;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        rangeCheck(intelligence);
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        rangeCheck(wisdom);
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        rangeCheck(wit);
        this.wit = wit;
    }

    public int getArtistry() {
        return artistry;
    }

    public void setArtistry(int artistry) {
        rangeCheck(artistry);
        this.artistry = artistry;
    }

    @Override
    public String toString() {
        return "Ученик Когтеврана " + commonCharacteristics() +
                ", ум " + intelligence +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + artistry;
    }
}
