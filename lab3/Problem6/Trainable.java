package lab3.Problem6;

// Пользовательский интерфейс - способность к дрессировке
public interface Trainable {
	void train(String command);
	boolean knowsCommand(String command);
}
