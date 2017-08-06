import java.io.*;

public class  MaximumSumNoTwoElementAdjacent
{
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t--!=0)
{
int size=Integer.parseInt(br.readLine());
String[] ip=br.readLine().split(" ");
int[] arr=new int[size];
for(int i=0;i<arr.length;i++)
arr[i]=Integer.parseInt(ip[i]);

int inc=arr[0];// max sum including the element
int exc=0;	// max sum excluding the element
for(int i=1;i<arr.length;i++)
{
int temp=exc;
exc=Math.max(exc,inc);
inc=temp+arr[i];
}
System.out.println(inc>exc?inc:exc);



}
}
}
