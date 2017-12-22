// data.txtにデータを書き込む
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("ALOHA!");
			bw.write("ALOHA!");
			// bw.append("ALOHA!\n");
			bw.close();
		} catch(IOException e) {
			System.out.println("File writing ... failed.");
		}
	}
}