package com.capgemini.sfdc;

public class starpattern {
	public static void main(String[] args) 
	{
		int num=9;
		for (int i=1;i<num ;i++ )
		{
			for (int j=1;j<num ;j++ )
			{
				
				if ( i>=j)
		
				{
					System.out.print("*");
				}
				else
				{ 
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
