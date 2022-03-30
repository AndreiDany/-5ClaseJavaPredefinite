
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Intervale {

	public static void main(String[] args) {
		
		int nrFisiere = 0;
		
		try {
			BufferedReader br = new BufferedReader (new FileReader ("intervale.txt")); 
			
			String line = br.readLine();
			while(line != null)
			{
				if(line.charAt(0) == '[')
				{
					@SuppressWarnings("removal")
					Double a = new Double(Double.parseDouble(line.substring(line.indexOf("[") + 1, line.indexOf(","))));
					@SuppressWarnings("removal")
					Double b = new Double(Double.parseDouble(line.substring(line.indexOf(",") + 1, line.indexOf("]"))));
					Interval interval = new Interval(a, b);
				}
				else
				nrFisiere = Integer.parseInt(line);
				line = br.readLine();
			}
			br.close();
			
			for(int i=1; i<=nrFisiere; i++)
			{   
				Scanner input = new Scanner(System.in);
				String fisier = input.nextLine();
				
				try {
					BufferedReader brElement = new BufferedReader (new FileReader (fisier)); 
					
					String lineElement = br.readLine();
					while(lineElement != null)
					{
							@SuppressWarnings("removal")
							Double Element = new Double(Double.parseDouble(lineElement));
							
							Interval.numereTestate++;
							
					for(int j=0; j<=Interval.intervale.length; j++)
					{
						Interval.intervale[j].InInterval(Element);
					}
								

					}
					brElement.close();
					} catch(IOException e){
						System.out.println("Eroare fisiere elemente!");
					}
					
					br.close();
					
			}
			
			Interval.Tiparire("output");
			
		} catch(IOException e) 
		{
			System.out.println("Eroare!");
		}

	}

}
