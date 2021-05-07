import java.util.Scanner;
class Array{

  public static void main (String s[]){

    int a ,i, sum , average, min, max , j,k;
	sum=0;
	int arr[] = new int[5];
	Scanner sd = new Scanner(System.in);
	System.out.println("enter five element in array");
	for(i=0; i<arr.length; i++)
	{
	arr[i]= sd.nextInt();
	}
	
	for(i=0; i<arr.length; i++)
	{
	System.out.print(+arr[i]+ " ");
	}
	for(i=0; i<arr.length; i++)
	{
	sum = sum + arr[i];
	}
	average = sum / arr.length;
	System.out.println("Average is "+average);
	
	if(arr.length ==1)
	{
		min=max = arr[0];
	}
	else{
		max=arr[1];
		min=arr[0];
	}
	for( i=2; i<arr.length; i++)
	{
		if(arr[i]> max)
			max= arr[i];
		else if (arr[i]<min)
			min= arr[i];
	}
   System.out.println("Smallest Element is "+min);
   System.out.println("Largest Element is "+max);
//   arr[i]= arr[0];
   //arr[j]= arr[1];
   for( j=0; j<arr.length; j++)
   {
	   for(i=j+1;i<arr.length; i++)
	   {
	   if(arr[i] == arr[j])
	   {
		   System.out.println("Duplicate Element is "+arr[i]+ "and" +arr[j]);
	   }
	   }
   }
   
 //  System.out.print(+arr[0]+ " "+arr[1]);
  // System.out.print(+arr[i]+ " ");
   for(i=0; i< 2; i++)
	{
	System.out.print(+arr[i]+ " ");
	}
   
  }
  
}