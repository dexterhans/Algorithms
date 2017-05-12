import java.io.*;
class Find_Array_Element_equals_index_in_logn
{
public static int binarySearch(int[] arr,int a, int b, int x)
{
if(a<=b)
{
System.out.println(a+" "+b);
int mid=(a+b)/2;
System.out.println(mid);
if(arr[mid]==x)
{
System.out.println("got it");
return mid;
}
else
if(arr[mid]>x)
{
System.out.println("less");
return binarySearch(arr,a,mid-1,x);
}
else
{
System.out.println("more");
return binarySearch(arr,mid+1,b,x);
}
}
return -1;
}
public static int find(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
arr[i]-=i;
System.out.print(arr[i]+" ");
}
System.out.println();
return binarySearch(arr,0,arr.length-1,0);
}
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int[] arr=new int[n];
String[] ip=br.readLine().split(" ");
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(ip[i]);
}
System.out.println(find(arr));
}
}
