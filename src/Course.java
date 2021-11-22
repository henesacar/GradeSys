public class Course {
    Teacher teacher;
    String name;
    String prefix;
    int note;
    int code;
    int sozlu;

    Course(String name, int code, String prefix) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = 0;
        this.sozlu=0;
    }

    void addTeacher(Teacher teacher) {
        if(prefix.equals(teacher.branch)){
        this.teacher = teacher;
            System.out.println("İşlem başarılı.");}
        else{
            System.out.println("Ders ve branş uyumlu değil.");
        }

    }

    void printTeacher() {
        if(this.teacher != null){
        System.out.println(this.name+ " dersinin öğretmeninin adı: "+teacher.name);}else{
            System.out.println(this.name+ " dersinin öğretmeni yoktur.");
        }
    }
}

