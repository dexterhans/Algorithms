import java.io.*;
public class Missing_number_in_array
{
public static void main(String[] args) throws Exception
{
int t;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
t=Integer.parseInt(br.readLine());
while(t--!=0)
{
int n=Integer.parseInt(br.readLine());
int a=0;
for(int i=1;i<=n;i++)
{
a=a^i;
}
String[] ip=br.readLine().split(" ");
int b=0;
for(int i=0;i<ip.length;i++)
{
b=b^Integer.parseInt(ip[i]);
}
System.out.println(a^b);
}

}
}
