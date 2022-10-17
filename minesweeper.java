import java.util.*;

public class minesweeper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iCase = 0;
		
		while(sc.hasNextInt())
		{
			// read n and m
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n == 0 && m == 0)
				break;
			
			iCase++;
			
			char[][] field = new char[n][m];
			int[][] counts = new int[n][m];
			
			// read each line of field
			String aLine = null;
			for(int i = 0; i < n; i++)
			{
				aLine = sc.next();
				
				for(int j = 0; j < m; j++)
				{
					field[i][j] = aLine.charAt(j);
					if(aLine.charAt(j) == '*')
						counts[i][j] = -1;
					else
						counts[i][j] = 0;
				}
			}
			
			// mine counting
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < m; j++)
				{
					if(counts[i][j] != -1)
					{
						int mine_count = 0;
						for(int s = -1; s <= 1; s++)
						{
							for(int t = -1; t <= 1; t++)
							{
								if(i+s >= 0 && i+s < n && j+t >= 0 && j+t < m)
								{
									if(field[i+s][j+t] == '*')
										mine_count++;
								}
							}
						}
						counts[i][j] = mine_count;
					}
				}
			}
			
			// output
			System.out.printf("Field #%d:", iCase);
			System.out.println();
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < m; j++)
				{
					if(counts[i][j] != -1)
						System.out.print(counts[i][j]);
					else
						System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}

}