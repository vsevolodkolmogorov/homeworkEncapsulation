public class Hogwarts {
    public static void main(String[] args) {
        Student harryPotter = new Student("Harry", "Potter", 100, 100);
        Student hermioneGranger  = new Student("Hermione", "Granger", 85, 78);
        Student ronWeasley = new Student("Ron", "Weasley", 70, 70);

        Gryffindor harry = new Gryffindor(harryPotter, 100,90,100);
        Gryffindor hermione = new Gryffindor(hermioneGranger, 90,85,90);
        Gryffindor ron = new Gryffindor(ronWeasley, 80,76,93);

        Student dracoMalfoy = new Student("Draco", "Malfoy", 92, 86);
        Student grahamMontague  = new Student("Graham", "Montague", 77, 89);
        Student gregoryGoyle = new Student("Gregory", "Goyle", 65, 56);

        Slytherin draco = new Slytherin(dracoMalfoy, 100,90,100, 70, 86);
        Slytherin graham = new Slytherin(grahamMontague, 90,85,90, 65, 78);
        Slytherin gregory = new Slytherin(gregoryGoyle, 80,76,93, 81, 65);

        Student zachariahSmith = new Student("Zachariah", "Smith", 92, 86);
        Student cedricDiggory  = new Student("Cedric", "Diggory", 77, 89);
        Student justinFinchFletchley = new Student("Justin", "Finch-Fletchley", 65, 56);

        Hufflepuff zachariah = new Hufflepuff(zachariahSmith, 100,90,100);
        Hufflepuff cedric = new Hufflepuff(cedricDiggory, 90,85,90);
        Hufflepuff justin = new Hufflepuff(justinFinchFletchley, 80,76,93);

        Student zhouChang = new Student("Zhou", "Chang", 92, 86);
        Student padmaPatil  = new Student("Padma", "Patil", 77, 89);
        Student marcusBelby = new Student("Marcus", "Belby", 65, 56);

        Ravenclaw zhou = new Ravenclaw(zhouChang, 100,90,100, 78);
        Ravenclaw padma = new Ravenclaw(padmaPatil, 90,85,90, 86);
        Ravenclaw marcus = new Ravenclaw(marcusBelby, 80,76,93, 65);

        harry.getFullDescriptionOfStudent();
        draco.getFullDescriptionOfStudent();
        Gryffindor.getBetterStudentOfGryffindor(harry, hermione);
        Slytherin.getBetterStudentOfSlytherin(draco, graham);
        Student.getBetterStudentOfHogwarts(draco, hermione);
    }
}
