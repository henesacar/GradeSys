public class Main {
    public static void main(String[] args) {
        Course Trh = new Course("Tarih",01,"TRH");
        Course Mat = new Course("Matematik",02,"Mat");
        Course Fzk = new Course("Fizik",03,"Fzk");

        Teacher t1 = new Teacher("Ayşe","TRH","0400");
        Teacher t2 = new Teacher("Ahmet","Mat","0500");
        Teacher t3 = new Teacher("Veli","Fzk","0300");

        Trh.addTeacher(t1);
        Mat.addTeacher(t2);
        Fzk.addTeacher(t3);

        Student s1 = new Student("Ali","10. Sınıf","007",Trh,Mat,Fzk);
        s1.addBulkExamNote(75,89,63);
        s1.sozluNotu(75,69,85);
        s1.isPass();
        s1.printNote();
        Student s2 = new Student("Fatma","12. Sınıf","022",Trh,Mat,Fzk);
        s2.addBulkExamNote(85,64,96);
        s2.sozluNotu(85,44,67);
        s2.isPass();
        s2.printNote();

    }
}
