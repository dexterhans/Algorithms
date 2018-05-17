import java.io.*;
import java.util.*;
public class NextGreatestElement
{
public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int x=0;
int size=Integer.parseInt(br.readLine());
String[] ip=br.readLine().split(" ");
int[] arr=new int[size];
for(int i=0;i<size;i++)
arr[i]=Integer.parseInt(ip[i]);
Stack<Integer> stack=new Stack<Integer>();
int[] ans=new int[size];
for(int i=0;i<size;i++)
{
if(stack.isEmpty())
stack.push(i);
else
{
while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
ans[stack.pop()]=arr[i];
stack.push(i);
}
}
while(!stack.isEmpty())
ans[stack.pop()]=-1;

for(int i=0;i<size;i++)
System.out.print(ans[i]+ " ");
}
}
