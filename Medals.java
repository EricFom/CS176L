
public class Medals 
{
	public static void main(String[] args) {

		final int COUNTRIES = 8;
		final int COUNT = 3;
		
		String[] countries =
			{
					"Canada",
					"Italy",
					"Germany",
					"Japan",
					"Kazakhstan",
					"Russia",
					"South Korea",
					"United States",
					"Total"
			};
		
		int[][] counts = 
			{
					{ 0, 3, 0},
					{ 0, 0, 1},
					{ 0, 0, 1},
					{ 1, 0, 0},
					{ 0, 0, 1},
					{ 3, 1, 1},
					{ 0, 1, 0},
					{ 1, 0, 1},
					{ 0, 0, 0},
			};
		System.out.println("        Country    Gold  Silver  Bronze   Total");
		
		for (int i = 0; i < COUNTRIES; i++) 
		{
			System.out.printf("%15s", countries[i]);
			int total = 0;
			for (int j = 0; j < COUNT; j++)
	         {
	            System.out.printf("%8d", counts[i][j]);
	            total = total + counts[i][j];
	         }
			System.out.printf("%8d\n", total);
			}
		int totalMedals = 0;
		
		for (int i = 0; i < COUNTRIES; i++) {
			for (int j = 0; j < COUNT; j++) {
				if (j == 0) {
					counts[8][j] += counts[i][j];
				} else if (j == 1) {
					counts[8][j] += counts[i][j];
				} else if (j == 2) {
					counts[8][j] += counts[i][j];}
			
		}
		}
		
		System.out.printf("%15s", countries[8]);
		for (int i = 0; i < COUNT; i++) {
			totalMedals += counts[8][i];
			System.out.printf("%8d", counts[8][i]);
		}
		System.out.printf("%8d", totalMedals);
		
	}
	}
	


