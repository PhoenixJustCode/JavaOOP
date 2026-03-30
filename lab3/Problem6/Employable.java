package lab3.Problem6;

// Пользовательский интерфейс - способность к трудоустройству
public interface Employable {
	void hire(String position);
	void fire();
	boolean isEmployed();
}
