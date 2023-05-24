package array;

public class Deepcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {3,6,8,9,7};
 int arrclone[]=arr.clone();
 System.out.println(arr==arrclone);
 for(int i=0;i<arr.length;i++)
 {
	 System.out.print(arrclone[i]+" ");
 }
 
	}

}

