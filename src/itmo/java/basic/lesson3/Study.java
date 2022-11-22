package itmo.java.basic.lesson3;

public class Study {
    private String course;

    public Study() {
        course = "Изучение Java - это просто!";
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study st = new Study();
        System.out.println(st.printCourse());
    }

}
