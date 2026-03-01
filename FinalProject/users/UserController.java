package users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User us;
	public UserController(User us) {
		this.us = us;
	}
	public void serialize() {
		try (FileOutputStream fs = new FileOutputStream(Database.getInstance().getValue() + "\\users.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			oos.writeObject(us);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public User deserialize() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(Database.getInstance().getValue() + "\\users.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			User u = (User)ois.readObject();
			return u;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return us;
	}
}
