public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 88, 24, 68, 46, 57);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 47, 53, 32, 23, 11);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 32, 33, 78, 21, 24);
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 64, 22, 56, 32, 47, 22, 46);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 47, 31, 22, 7, 24, 68, 33);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 43, 11, 66, 43, 84, 11, 83);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария", "Смит", 42, 92, 45, 87, 23);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 85, 45, 67, 73, 66);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 45, 96, 21, 57, 44);
        Ravenclaw choChang = new Ravenclaw("Чжоу", "Чанг", 63, 57, 54, 32, 66, 76);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 46, 37, 66, 51, 37, 44);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 57, 41, 46, 47, 87, 26);
    }

    public static void printAllInfo(Hogwarts student) {
        System.out.println(student);
        //Метод требуется по заданию
    }

    public static void compareCommonCharacteristics(Hogwarts student1, Hogwarts student2) {
        System.out.print(student1.fullName() + " обладает ");
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.print("большей мощностью магии, чем ");
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.print("меньшей мощностью магии, чем ");
        } else {
            System.out.print("такой же мощностью магии, как и ");
        }
        System.out.println(student2.fullName());
        System.out.print(student1.fullName() + " может трансгрессировать на ");
        if (student1.getApparitionDistance() > student2.getApparitionDistance()) {
            System.out.print("большее расстояние, чем ");
        } else if (student1.getApparitionDistance() < student2.getApparitionDistance()) {
            System.out.print("меньшее расстояние, чем ");
        } else {
            System.out.print("такое же расстояние, как и ");
        }
        System.out.println(student2.fullName());
        //Как понял из формулировки задания, нужно сравнить общие характеристики по отдельности, а не сложить, как для факультета
        //Просьба указать, как можно сократить метод
    }

    public static void compareHouseCharacteristics(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getCourage();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getCourage();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны");
        }
    }

    public static void compareHouseCharacteristics(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны");
        }
    }

    public static void compareHouseCharacteristics(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getArtistry();
        int sum2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getArtistry();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны");
        }
    }

    public static void compareHouseCharacteristics(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getGuile() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getDesireForPower();
        int sum2 = student2.getGuile() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getDesireForPower();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны");
        }
    }
}
