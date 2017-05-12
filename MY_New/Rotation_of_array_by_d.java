import java.io.*;
public class Rotation_of_array_by_d{
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t--!=0)
{
String[] ip1=br.readLine().split(" ");
int n=Integer.parseInt(ip1[0]);
int d=Integer.parseInt(ip1[1]);
String[] ip2=br.readLine().split(" ");
int[] arr=new int[n];
int[] temp=new int[d];
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(ip2[i]);
}
for(int i=0;i<d;i++)
{
temp[i]=arr[i];
}
for(int i=d;i<n;i++)
{
arr[i-d]=arr[i];
}
for(int i=n-d;i<n;i++)
{
arr[i]=temp[i-(n-d)];
}
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
System.out.println();
}
}
}
