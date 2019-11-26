package ArrayDemo;

public class max_Array {

	public static void main(String[] args) {
		double [] points = {
				26.1,45.3,12.5,65.4, 67.6
		};

		//printing all points
		for (int i=0; i<points.length; i++){
			System.out.println(points[i] + " ");
		}


		//summing all the points
		double total=0;
		for(int j=0; j<points.length; j++){
		total += points[j];

		}
		System.out.println("Total points is:" + total);


		//finding the maximum point

	double max = points[0];
	for(int k =1; k<points.length; k++){
		if(points[k] >max ) max = points[k];{

		}

	}
	System.out.println("Maximum value is:" +max);
	}

}
