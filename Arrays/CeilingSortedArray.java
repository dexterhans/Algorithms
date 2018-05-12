import java.io.*;



public class CeilingSortedArray
{
public static int binarySearch(int[] arr,int x)
{

int start=0,end=arr.length-1;
int mid=(start+end)/2;
while(start<end)
{
if(arr[mid]==x)
return mid;
if(arr[mid]>x)
end=mid-1;
else
start=mid+1;
mid=(start+end)/2;
}
return mid;
}
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size=Integer.parseInt(br.readLine());
String[] ip=br.readLine().split(" ");
int[] arr=new int[size];
for(int i=0;i<size;i++)
arr[i]=Integer.parseInt(ip[i]);
int x=Integer.parseInt(br.readLine());
int ans=binarySearch(arr,x);
 if(arr[ans]==x)
{
System.out.println(arr[ans]+" "+arr[ans]);
}
else
if(ans==0)
{
System.out.println(-1+" "+arr[ans]);
}
else
if(ans==arr.length-1 && arr[ans]<x)
System.out.println(arr[ans]+" "+-1);
else
{
System.out.println(arr[ans-1]+" "+arr[ans]);
}
}
}
