public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }

    public void printTeacherInfo(){
        if(teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni: " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
