public class Gryffindor extends Student {
    private int nobilityCount;
    private int honorCount;
    private int braveryCount;

    Gryffindor(Student student, int nobilityCount, int honorCount, int braveryCount) {
        super(student.getFirstName(), student.getSecondName(), student.getMagicPowerCount(), student.getTransgressionDistanceCount());
        this.nobilityCount = nobilityCount;
        this.honorCount = honorCount;
        this.braveryCount = braveryCount;
    }

    public static void getBetterStudentOfGryffindor(Gryffindor firstStudent, Gryffindor secondStudent) {
        if (firstStudent.getCountOfAllStats() < secondStudent.getCountOfAllStats()) {
            System.out.println(secondStudent.getFirstName() + " a better Gryffindor than " + firstStudent.getFirstName());
        } else {
            System.out.println(firstStudent.getFirstName() + " a better Gryffindor than " + secondStudent.getFirstName());
        }
    }

    public int getNobilityCount() {
        return nobilityCount;
    }

    public int getHonorCount() {
        return honorCount;
    }

    public int getBraveryCount() {
        return braveryCount;
    }

    public int getCountOfAllStats() {
        return this.nobilityCount + this.honorCount + this.braveryCount + getMagicPowerCount() + getTransgressionDistanceCount();
    }

    public void getFullDescriptionOfStudent() {
        getStudentInfo();
        System.out.println("Nobility Count: " + getNobilityCount());
        System.out.println("Honor Count: " + getHonorCount());
        System.out.println("Bravery Count: " + getBraveryCount());
    }
}
