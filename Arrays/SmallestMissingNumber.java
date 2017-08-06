import java.io.*;
public class SmallestMissingNumber  // only works when there are no duplicates
{
public static int binarySearch(int[] arr)
{
int start=0;
int end=arr.length-1;
int mid=(start+end)/2;
while(start<=end)
{
if(arr[start]!=start)
{
return start;
}
if(arr[mid]==mid)
{
start=mid+1;
}
else
end=mid;
mid=(start+end)/2;
}
return mid+1;
}
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size=Integer.parseInt(br.readLine());
String[] ip=br.readLine().split(" ");
int[] arr=new int[size];
for(int i=0;i<size;i++)
arr[i]=Integer.parseInt(ip[i]);
int m=Integer.parseInt(br.readLine());

System.out.println(binarySearch(arr));
}
}
