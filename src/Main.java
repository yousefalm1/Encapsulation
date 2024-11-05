public class Main {
    public static void main(String[] args) {

        Student student = new Student("Yousef", 42, 3.0);

//        System.out.println(student);


//        System.out.println(student.getGpaStatus());
        student.setGpa(4.1);
        System.out.println(student.getGpaStatus());

        ;
    }
}
