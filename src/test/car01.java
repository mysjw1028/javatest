package test;

public class car01 {

	static double calc(double gasline, double distance) {
		System.out.println(distance / gasline);
		int e = (int) (distance / gasline);
		return e;
	}

	public static void main(String[] args) {
		double gasline = 8.86;
		double distance = 182.736;
		double efficiency = calc(gasline, distance);
		System.out.println("연비 : " + efficiency + "km/L");
	}
}
