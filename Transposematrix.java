public class transposematrix
  [
public static void main(String args[])
  {
int original[][]={{1,2,3},{7,8.9},{5,6,7}};
    int transpose[][]=new int[3][3];
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        transpose[i][j]=original[j][i];
      }
    }
    System.out.println("print without transpose:");
    for(int i=0;i<3;i++)
    {
for(j=0;j<3;j++)
{
System.out.print(original[i][j]+" ");
}
System.out.println();
    }
System.out.println("printing matrix after transpose:");
    for(int i=0;i<3;i++)
    {
for(int j=0;j<3;j++)
{
System.out.print(transpose[i][j]+" ");
}
      System.out.println();
    }
  }
  }
    
