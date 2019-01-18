package select_sort;

public class select_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,10,5,8,7,6,4,3,2,9};
		int index = 0;
		System.out.println("整列の前");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
		for(int i=0;i<num.length;i++)
		{
			int min=num[i];
			for(int j=i;j<num.length;j++)
			{
				if(min>num[j])
				{
					min=num[j];
					index=j;
				}	
			}
			int temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
		System.out.println();
		System.out.println("整列の後");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}
