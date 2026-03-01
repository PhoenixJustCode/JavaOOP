package course;

import java.io.Serializable;

public class CourseFile implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String text;
	private Course course;
	
	public CourseFile() {
		
	}
	public CourseFile(String name, String text, Course course) {
		this.name = name;
		this.text = text;
		this.course = course;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "CourseFile [name=" + name + ", text=" + text + ", course=" + course + "]";
	}
	
	
	
}
