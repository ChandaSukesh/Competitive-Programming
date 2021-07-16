// triangleareabycoordinates(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function triangleareabycoordinates(x1, y1, x2, y2, x3, y3) that takes 6 int or float
// values that represent the three points (x1,y1), (x2,y2), and (x3,y3), and returns as a float the
// area of the triangle formed by those three points. Hint: you should make constructive use of
// the triangleArea function you just wrote above.

public class TriangleAreaByCoordinates {
	public int triangleAreaByCoordinates(double x1, double y1, double x2, double y2, double x3, double y3) {

		int calc=(int) (x1*(y2-y3) +x2*(y3-y1) + x3*(y1-y2));
		int ans=(int)  calc/2;
		return ans;
	}
}