package assignment_second;

public class Circle {
	public double  cricle_Calculate_Area(int r) throws Exception{// 	Return value double 
		if(r>=0) {
		double ans= Math.PI*Math.pow(r, 2);// find area this formula 
		
		return ans;}
		
		else {
			
			  throw new Exception ("  Value should be greater then 0 it is postive"); 
		}
	}

	public double cricle_Circumference(int r) throws Exception {
		// TODO Auto-generated method stub
		if(r>=0) {
		double ans =2*Math.PI*r;
		return ans;
	}else {
		throw new Exception ("  Value should be greater then 0 it is postive");
	}
	}
	

	public double cricle_Volume(int nextInt) throws Exception{
		// TODO Auto-generated method stub
		if(nextInt>=0) {
		double ans=4/3 *Math.PI*Math.pow(nextInt, 3);
		return ans;
	}else {
		throw new Exception ("  Value should be greater then 0 it is postive");
	}
	}
		

}
