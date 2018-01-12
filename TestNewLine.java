// 改行テスト
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TestNewLine {
	public static void main(String[] args) {
		System.out.println("ALOHA\nHELLO");

		try {
			FileWriter fw = new FileWriter("data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			while(true){
				System.out.print("input msg> ");
				String userData = new java.util.Scanner(System.in).nextLine();

				if(userData.equals("exit")) break;

				bw.write(userData+"\r\n");
			}

			bw.close();
		} catch(IOException e) {
			System.out.println("ERROR");
		}
	}
}