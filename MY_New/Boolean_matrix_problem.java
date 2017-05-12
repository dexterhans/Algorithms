import java.io.*;
class Boolean_matrix_problem{
        public static void main(String[] args) throws Exception
        {
                int t;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                t=Integer.parseInt(br.readLine());
                while(t--!=0)
                {
                        String[] ip=br.readLine().split(" ");
                        int m=Integer.parseInt(ip[0]);
                        int n=Integer.parseInt(ip[1]);
                        String[] ip1=br.readLine().split(" ");
                        int[][] arr=new int[m][n];
                        int x=0;
                        for(int i=0;i<m;i++)
                                for(int j=0;j<n;j++)
                                {
                                        arr[i][j]=Integer.parseInt(ip1[x++]);
                                }
                        int flag_row=0;
                        int flag_column=0;
                        for(int i=0;i<n;i++)
                                flag_row|=arr[0][i];
                        for(int i=0;i<m;i++)
                                flag_column|=arr[i][0];
                        for(int i=1;i<m;i++)
                                for(int j=1;j<n;j++)
                                {
                                        if(arr[i][j]==1)
                                        {
                                                arr[i][0]=1;
                                                arr[0][j]=1;
                                        }
                                }

                        for(int i=1;i<m;i++)
                                for(int j=1;j<n;j++)
                                {
                                        if(arr[i][0]==1||arr[0][j]==1)
                                                arr[i][j]=1;
                                }
                        for(int i=1;i<m;i++)
                                arr[i][0]=arr[i][0]|flag_column;
                        for(int i=1;i<n;i++)
                                arr[0][i]=arr[0][i]|flag_row;
                        arr[0][0]=flag_column|flag_row;

                        for(int i=0;i<m;i++)
                                for(int j=0;j<n;j++)
                                {

                                        System.out.print(arr[i][j]+" ");
                                }
                        System.out.println();
                }
        }
}

