import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFiles{
	public static void main(String[] args) {
		File file = new File("./text.txt");
		try {
			//code that causes exception
			Scanner in = new Scanner(file);
			try{
				// code to read and output file
				String contents = in.nextLine();
				while(in.hasNextLine()){
					contents = contents + "\n" + in.nextLine();
				}
				System.out.println(contents);
			} finally {
				// code to close stream
				in.close();
			}
		} catch(IOException e){
			//handling exception
			e.printStackTrace();
		}
	}
}