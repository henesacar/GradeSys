public class Student {
    Course Trh;
    Course Mat;
    Course Fzk;
    String name;
    String classes;
    String stuNo;
    double average;
    boolean isPass;

    Student(String name, String classes, String stuNo, Course Trh, Course Mat, Course Fzk) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.Trh = Trh;
        this.Mat = Mat;
        this.Fzk = Fzk;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int mat, int fiz, int trh) {
        if (mat >= 0 && mat <= 100) {
            this.Mat.note = mat;
        }
        if (fiz >= 0 && fiz <= 100) {
            this.Fzk.note = fiz;
        }
        if (trh >= 0 && trh <= 100) {
            this.Trh.note = trh;
        }

    }

    void sozluNotu(int matS, int fizS, int trhS) {
        if (matS >= 0 && matS <= 100) {
            this.Mat.sozlu = matS;
        }
        if (fizS >= 0 && fizS <= 100) {
            this.Fzk.sozlu = fizS;
        }
        if (trhS >= 0 && trhS <= 100) {
            this.Trh.sozlu = trhS;
        }

    }

    void calcAverage() {
        this.average = ((this.Mat.note * 0.8 + this.Mat.sozlu * 0.2) + (this.Fzk.note * 0.8 + this.Fzk.sozlu * 0.2) + (this.Trh.note * 0.8 + this.Trh.sozlu * 0.2)) / 3;

    }

    boolean isPass() {
        calcAverage();
        return this.average > 55;

    }

    void printNote() {
        int not=(int)this.average;
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.Mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.Mat.sozlu);
        System.out.println("*************************");
        System.out.println("Fizik Notu : " + this.Fzk.note);
        System.out.println("Fizik Sözlü Notu : " + this.Mat.sozlu);
        System.out.println("*************************");
        System.out.println("Tarih Notu : " + this.Trh.note);
        System.out.println("Tarih Sözlü Notu : " + this.Mat.sozlu);
        System.out.println("*************************");

        System.out.println("Ortalama Notunuz: " + not);
        if (this.Mat.note == 0 || this.Fzk.note == 0 || this.Trh.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        if (isPass() == true) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
