public class Hufflepuff extends Student {
    private int hardworkingCount;
    private int loyalCount;
    private int honestCount;

    Hufflepuff(Student student, int hardworkingCount, int loyalCount, int honestCount) {
        super(student.getFirstName(), student.getSecondName(), student.getMagicPowerCount(), student.getTransgressionDistanceCount());
        this.hardworkingCount = hardworkingCount;
        this.loyalCount = loyalCount;
        this.honestCount = honestCount;
    }

    public static void getBetterStudentOfHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        if (firstStudent.getCountOfAllStats() < secondStudent.getCountOfAllStats()) {
            System.out.println(secondStudent.getFirstName() + " a better Hufflepuff than " + firstStudent.getFirstName());
        } else {
            System.out.println(firstStudent.getFirstName() + " a better Hufflepuff than " + secondStudent.getFirstName());
        }
    }

    public int getCountOfAllStats() {
        return this.hardworkingCount + this.loyalCount + this.honestCount + getMagicPowerCount() + getTransgressionDistanceCount();
    }

    public int getHardworkingCount() {
        return hardworkingCount;
    }

    public int getLoyalCount() {
        return loyalCount;
    }

    public int getHonestCount() {
        return honestCount;
    }

    public void getFullDescriptionOfStudent() {
        getStudentInfo();
        System.out.println("Hard working: " + hardworkingCount);
        System.out.println("Loyal : " + loyalCount);
        System.out.println("Honest : " + honestCount);
    }


}
