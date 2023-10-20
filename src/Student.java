public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int not1, int sozluNot1, int not2, int sozluNot2, int not3, int sozluNot3) {
        if(not1 >= 0 && not1<= 100 && sozluNot1 >= 0 && sozluNot1 <= 100)
            this.c1.note = (int) ((not1 * 0.80) + (sozluNot1 * 0.20));

        if(not2 >= 0 && not2 <= 100 && sozluNot2 >= 0 && sozluNot2 <= 100)
            this.c2.note = (int) ((not2 * 0.80) + (sozluNot2 * 0.20));

        if(not3 >= 0 && not3 <= 100 && sozluNot3 >= 0 && sozluNot3 <= 100)
            this.c3.note = (int) ((not3 * 0.80) + (sozluNot3 * 0.20));
    }


    public void isPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if(this.average > 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Maalesef sınıfta kaldınız.");
            this.isPass = false;
        }

        printNote();
    }

    public void printNote() {
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
