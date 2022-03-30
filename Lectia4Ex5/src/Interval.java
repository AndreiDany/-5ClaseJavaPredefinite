
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Interval {
	private Double a, b;
	public static int numereTestate = 0;
	private int numereContinute = 0;
	public static Interval[] intervale;
	
	public Interval(double a, double b) {
		this.a = a;
		this.b = b;
		
		if(intervale != null)
		{
			Interval[] intervale1 = Interval.intervale;
			Interval.intervale = new Interval[intervale1.length+1];
			
			for(int i=0; i<intervale1.length; i++)
		{
				intervale[i].a = intervale1[i].a;
				intervale[i].b = intervale1[i].b;
		}
			intervale[intervale.length].a = a;
			intervale[intervale.length].b = b;
		}
		
		else 
		{
			Interval.intervale = new Interval[1] ;
			Interval.intervale[0].a = a;
			Interval.intervale[0].b = b;
		}
	}
	
	public void InInterval (Double nr)
	{
		if(nr >= a && nr <= b)
		{
			 numereContinute++;
		}
		
		 numereTestate++;
	}
	
	public static void Tiparire(String fisier)
	{
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter(fisier));
			
			for(int i=0; i<= Interval.intervale.length; i++)
			{
				bw.write("Intervalul: [" + Interval.intervale[i].a + "] - " 
			    + Interval.numereTestate / Interval.intervale[i].numereContinute + "%");
			}
			
			bw.close();
			
			} catch (IOException e) {
				System.out.println("Eroare");
			}
	}
}
