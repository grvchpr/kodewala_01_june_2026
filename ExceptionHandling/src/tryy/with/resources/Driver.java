package tryy.with.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) {

		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"));
				) {
			ois.read();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found exception is handled");
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
