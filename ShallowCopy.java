package array;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr= {
		{1,2,3,4,5},
		{6,7,8,9,10}
};
int clonearr[][]=arr.clone();//shallow copy is created here
System.out.println(arr[1]==clonearr[1]);
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}
System.out.println(arr[0]);
System.out.println(clonearr[0]);
	}

}
