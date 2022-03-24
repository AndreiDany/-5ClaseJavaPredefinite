import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClientText {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String linieTastatura = input.nextLine();
		String numeFisier =	input.nextLine();
		int numarLiniiEgale = 0;
		
		try {
			BufferedReader br = new BufferedReader (new FileReader(numeFisier));
			
			String line = br.readLine();
			while(line != null)
			{
				if(linieTastatura.equals(line))
					numarLiniiEgale++;
				
				line = br.readLine();
			}
			
			br.close();
			
		} catch (IOException e) {
			System.out.println("Eroare");
		}
		
		System.out.println(numarLiniiEgale);
	}

}
