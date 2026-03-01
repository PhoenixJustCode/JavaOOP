package lab1.Problem4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite; 

    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getPrerequisite() {
        return this.prerequisite;
    }

    @Override
    public String toString() {
        return "Course: " + this.name + " (" + this.credits + " credits)\nDescription: " + this.description + "\nPrerequisite: " + this.prerequisite;
    }
}
