import java.lang.*;
import java.util.*;
class SquareRootDecomposition{
	public final static int size=23;
	public static void main(String[] args)
	{
		Random random=new Random();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=random.nextInt(50)+1;
		int blockSize=(int)Math.sqrt(size);
		int[] block=new int[(int)Math.ceil((double)size/(double)blockSize)];
		System.out.println(blockSize+" "+Math.ceil((double)size/(double)blockSize));
		int j=-1;
		for(int i=0;i<size;i++)
		{

			if(i%blockSize==0)
				j++;
			block[j]+=arr[i];
		}
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for(int i=0;i<(int)Math.ceil((double)size/(double)blockSize);i++)
			System.out.print(block[i]+" ");
System.out.println();
		int a=5;
		int b=15;
		int sum=0;
		while(a<=b && a%blockSize!=0)
			sum+=arr[a++];
		while(a+blockSize<=b)
			{
			sum+=block[a/blockSize];
			a=a+blockSize;
			}
		while(a<=b)
			sum+=arr[a++];
		System.out.println(sum);
	}
}

