package Javapack;

import org.testng.annotations.Test;

public class Cubeofarrayandasecndingorder {
	@Test
	public void array()
		{
			int arr[]= {20,10,5};
			int b[]=new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			for(int i=0;i<arr.length;i++)
			{
			b[i]=arr[i]*arr[i]*arr[i];
			System.out.print(b[i]+" ");
			}
			System.out.println();
			int temp=0;
			for(int j=0;j<b.length;j++)
			{
				for(int k=j+1;k<b.length;k++)
				{
					if(b[j]>b[k])
					{
						temp=b[j];
						b[j]=b[k];
						b[k]=temp;
					}
				}
			}
			
		for(int p:b)
			{
			System.out.print(p+" ");
			//System.out.println();
		}
		}
}
