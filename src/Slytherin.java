public class Slytherin extends Student{
    private int cunningCount;
    private int determinationCount;
    private int ambitionCount;
    private int thirstCount;
    private int thirstForPowerCount;

    Slytherin(Student student, int cunningCount, int determinationCount, int ambitionCount, int thirstCount, int thirstForPowerCount) {
        super(student.getFirstName(), student.getSecondName(), student.getMagicPowerCount(), student.getTransgressionDistanceCount());
        this.cunningCount = cunningCount;
        this.determinationCount = determinationCount;
        this.ambitionCount = ambitionCount;
        this.thirstCount = thirstCount;
        this.thirstForPowerCount = thirstForPowerCount;
    }

    public static void getBetterStudentOfSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        if (firstStudent.getCountOfAllStats() < secondStudent.getCountOfAllStats()) {
            System.out.println(secondStudent.getFirstName() + " a better Slytherin than " + firstStudent.getFirstName());
        } else {
            System.out.println(firstStudent.getFirstName() + " a better Slytherin than " + secondStudent.getFirstName());
        }
    }

    public int getCountOfAllStats() {
        return this.cunningCount + this.determinationCount + this.ambitionCount + this.thirstCount + this.thirstForPowerCount + getMagicPowerCount() + getTransgressionDistanceCount();
    }

    public int getCunningCount() {
        return cunningCount;
    }

    public int getDeterminationCount() {
        return determinationCount;
    }

    public int getAmbitionCount() {
        return ambitionCount;
    }

    public int getThirstCount() {
        return thirstCount;
    }

    public int getThirstForPowerCount() {
        return thirstForPowerCount;
    }

    public void getFullDescriptionOfStudent() {
        getStudentInfo();
        System.out.println("Cunning count = " + cunningCount);
        System.out.println("Determination count = " + determinationCount);
        System.out.println("Ambition count = " + ambitionCount);
        System.out.println("Thirst count = " + thirstCount);
        System.out.println("Thirst for power count = " + thirstForPowerCount);
    }
}
