public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getGpaStatus() {
        if (gpa > 3) {
            return "Excellent";
        } else if (gpa >= 2 || gpa <= 3) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }

    public void setGpa(double gpa) {

        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        } else {
            System.err.println("Error");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
