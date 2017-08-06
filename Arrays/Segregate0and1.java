import java.io.*;
public class Segregate0and1{
public static void main(String[] args) throws Exception // we could even count
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size=Integer.parseInt(br.readLine());
String[] ip=br.readLine().split(" ");
int[] arr=new int[size];
for(int i=0;i<size;i++)
arr[i]=Integer.parseInt(ip[i]);

int i=0;
int j=size-1;
while(true)
{
while(i<size && arr[i]==0)
{
i++;
}
while(j>=0 && arr[j]==1)
{
j--;
}
if(i<j)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
else
break;
}
for(i=0;i<size;i++)
System.out.print(arr[i]+" ");
}
}
