public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void printTeacher() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon no: " + this.mpno);
        System.out.println("Branş: " + this.branch);
    }

}
