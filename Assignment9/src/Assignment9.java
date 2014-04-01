//
//
//

public class Assignment9 {

	public static void main(String [] args){
		
	}
	public static double findMax(double[]a, int b){
		double max = a[0];
		for (int i=1; i<a.length; i++){
			if(a[i]>max){
				max=a[i];
				//recursion -> what is my base case
			}
			if(i==0){
				return a[0];
			}else{
				max=findMax(a,i-1);
				if (a[i]>max){
					return a[i];
				}
			}
		}
	}
	
	public int linkedTotal(args){
		return args.length;
	}
}
