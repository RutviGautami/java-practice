import java.util.Scanner;
public class P5c7Short{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of arry: ");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter arry");

		for(int i=0;i<n;i++){
			System.out.print("Enter: ");
			arr1[i]=sc.nextInt();
		}
		 for(int y=0;y<n-1;y++){
			if(arr1[y]>arr1[y+1]){
				arr1[y]=arr1[y]+arr1[y+1];
				arr1[y+1]=arr1[y]-arr1[y+1];
				arr1[y]=arr1[y]-arr1[y+1];
			}

		}
		for(int z=0;z<n;z++){
			System.out.print(arr1[z]+",");
		}
		System.out.println();                                                    
		System.out.print("pivot index: ");
		int pivot=sc.nextInt();
		if((1 <= pivot)&&(pivot<n)){
		int[] arr2=new int[n];
		for(int k=0;k<(n-pivot);k++){
                 arr2[k]=arr1[k+pivot];
        }
        for(int k=(n-pivot);k<n;k++){
                 arr2[k]=arr1[k-n+pivot];
        }
        System.out.print("pivoted arry");
        for(int j=0;j<n;j++){
                 System.out.print(arr2[j]+",");
        }
        System.out.println();
        System.out.print("Enter element: ");
        int target=sc.nextInt();
        int r=0;
        for(int l=0;l<n;l++){
             if(arr2[l]==target){
             	System.out.print("index = "+l);
             	r=1;
             	break;
             }
        }
        if(r==0){
        	System.out.print("-1");
        }
    }
    else{
    	System.out.print("Error");
    }

	}
}