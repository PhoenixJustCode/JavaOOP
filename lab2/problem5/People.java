package lab2.problem5;

class Employee extends Person {
    private String jobTitle;
    public Employee(String name, int age, String job) {
        super(name, age);
        this.jobTitle = job;
    }
    @Override public String getOccupation() { return "Employee: " + jobTitle; }
    @Override protected boolean canOwn(Animal pet) { return true; }
}

class Student extends Person {
    private String major;
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    @Override public String getOccupation() { return "Student of " + major; }
    @Override protected boolean canOwn(Animal pet) { return true; }
}

class PhDStudent extends Person {
    private String researchArea;
    public PhDStudent(String name, int age, String area) {
        super(name, age);
        this.researchArea = area;
    }
    @Override public String getOccupation() { return "PhD Researcher in " + researchArea; }
    @Override protected boolean canOwn(Animal pet) { return !(pet instanceof Dog); }
}
