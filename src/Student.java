public class Student {
    private String firstName;
    private String secondName;
    private int magicPowerCount;
    private int transgressionDistanceCount;

    Student(String firstName, String secondName, int magicPowerCount, int transgressionDistanceCount) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.magicPowerCount = magicPowerCount;
        this.transgressionDistanceCount = transgressionDistanceCount;
    }

    public static void getBetterStudentOfHogwarts(Student firstStudent, Student secondStudent) {
        if (firstStudent.getCountOfAllStats() < secondStudent.getCountOfAllStats()) {
            System.out.println(secondStudent.getFirstName() + " has more magic power than " + firstStudent.getFirstName());
        } else {
            System.out.println(firstStudent.getFirstName() + " has more magic power than " + secondStudent.getFirstName());
        }
    }

    public int getCountOfAllStats() {
        return magicPowerCount + transgressionDistanceCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getMagicPowerCount() {
        return magicPowerCount;
    }

    public int getTransgressionDistanceCount() {
        return transgressionDistanceCount;
    }

    public void getStudentInfo() {
        System.out.println("Student: " + this.firstName + " " + this.secondName);
        System.out.println("Magic power: " + this.magicPowerCount);
        System.out.println("Transgression Distance: " + this.transgressionDistanceCount);
    }

}
