import java.io.*;
public class UnionOfTwoArrays{
	public static void main(String[] args) throws Exception// sorted array
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			String[] ip=br.readLine().split(" ");
			int size1=Integer.parseInt(ip[0]);
			int size2=Integer.parseInt(ip[1]);
			String[] ip1=br.readLine().split(" ");
			String[] ip2=br.readLine().split(" ");
			int [] arr1=new int[size1];
			int [] arr2=new int[size2];
			for(int i=0;i<size1;i++)
			{
				arr1[i]=Integer.parseInt(ip1[i]);
			}
			for(int i=0;i<size2;i++)
			{
				arr2[i]=Integer.parseInt(ip2[i]);
			}

			int i=0,j=0;
			StringBuilder str=new StringBuilder();
			while(i<size1 && j<size2)
			{
				if(arr1[i]>arr2[j])
				{
					str.append(arr2[j]+" ");
					j++;
				}
				else
					if(arr2[j]>arr1[i])
					{
						str.append(arr1[i]+" ");
						i++;
					}
					else
					{
						str.append(arr2[j]+" ");
						j++;
						i++;
					}
			}

			while(i<size1)
			{
				str.append(arr1[i]+" ");
				i++;
			}
			while(j<size2)
			{
				str.append(arr2[j]+" ");
				j++;
			}
			System.out.println(str);
		}
	}
}
