public class Ravenclaw extends Student{
    private int smartCount;
    private int wiseCount;
    private int wittyCount;
    private int creativityCount;

    Ravenclaw(Student student, int smartCount, int wiseCount, int wittyCount, int creativityCount) {
        super(student.getFirstName(), student.getSecondName(), student.getMagicPowerCount(), student.getTransgressionDistanceCount());
        this.smartCount = smartCount;
        this.wiseCount = wiseCount;
        this.wittyCount = wittyCount;
        this.creativityCount = creativityCount;
    }

    public static void getBetterStudentOfRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        if (firstStudent.getCountOfAllStats() < secondStudent.getCountOfAllStats()) {
            System.out.println(secondStudent.getFirstName() + " a better Revenclaw than " + firstStudent.getFirstName());
        } else {
            System.out.println(firstStudent.getFirstName() + " a better Revenclaw than " + secondStudent.getFirstName());
        }
    }

    public int getCountOfAllStats() {
        return this.smartCount + this.wiseCount + this.wittyCount + this.creativityCount + getMagicPowerCount() + getTransgressionDistanceCount();
    }

    public int getSmartCount() {
        return smartCount;
    }

    public int getWiseCount() {
        return wiseCount;
    }

    public int getWittyCount() {
        return wittyCount;
    }

    public int getCreativityCount() {
        return creativityCount;
    }

    public void getFullDescriptionOfStudent() {
        getStudentInfo();
        System.out.println("Smart Count: " + getSmartCount());
        System.out.println("Wise Count: " + getWiseCount());
        System.out.println("Witty Count: " + getWittyCount());
        System.out.println("Creativity Count: " + getCreativityCount());
    }
}
