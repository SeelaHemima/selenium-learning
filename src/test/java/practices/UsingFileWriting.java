package practices;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriting {

	public static void main(String[] args) throws IOException {
		String location="FileWriting.txt";
		String content="Learning file writing in java";
		FileWriter filewriter= new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
	}

}
