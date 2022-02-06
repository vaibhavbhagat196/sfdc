package com.capgemini.sfdc;

public class pattern2 {
	public static void main(String[] args) 
	{
		int num=9;
		for (int i=num;i>=1 ;i-- )
		{
			for (int j=1;j<num ;j++ )
			{
				
				if ( i>=j)
		
				{
					System.out.print(i);
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
