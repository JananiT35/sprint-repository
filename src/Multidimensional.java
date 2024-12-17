package task;

public class Multidimensional {

    public static void main(String[] args) {
        // Initialize the 3x3 matrix with the given numbers
        
      

int n=9,sum=0;
int array[][]=new int[3][3];

for (int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	array[i][j]=n--;
}
}
for (int i=0;i<3;i++)
{
System.out.print("[");
 sum=0;

for(int j=0;j<3;j++)
{
	System.out.print(array[i][j]+"  ");
	sum+=array[0][j];
}
System.out.print("]");
System.out.println();
}
System.out.println("sum:"+sum);
    }}
