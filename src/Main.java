// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Teacher ahmet = new Teacher("Ahmet Hoca", "5364852763", "MAT");
        Teacher can = new Teacher("Can Hoca", "5368537714", "FZK");
        Teacher bayram = new Teacher("Bayram Hoca", "5367246658", "TRH");

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(ahmet);

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(can);

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(bayram);

        Student mustafa = new Student("Mustafa", "1307", "2", matematik, fizik, tarih);
        mustafa.addBulkExamNote(100, 50, 70, 40, 86, 94);
        mustafa.isPass();
    }
}