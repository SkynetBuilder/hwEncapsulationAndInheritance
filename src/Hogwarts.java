public abstract class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int apparitionDistance;

    public Hogwarts(String name, String surname, int magicPower, int apparitionDistance) {
        this.name = name;
        this.surname = surname;
        rangeCheck(magicPower);
        rangeCheck(apparitionDistance);
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;

    }
    public String fullName(){
        return name + " " + surname;
    }

    protected void rangeCheck(int characteristic){
        if (characteristic < 0 || characteristic > 100) {
            throw new IllegalArgumentException("Значение характеристики должно быть от 0 до 100!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        rangeCheck(magicPower);
        this.magicPower = magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        rangeCheck(apparitionDistance);
        this.apparitionDistance = apparitionDistance;
    }

    public String commonCharacteristics() {
        return fullName() +
                ", cила магии " + magicPower +
                ", расстояние трансгрессии " + apparitionDistance;
    }
}
