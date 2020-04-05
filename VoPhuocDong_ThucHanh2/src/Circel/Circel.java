package Circel;



public class Circel {

		private double radius;
		public double calArea()
		{
			return Math.pow(getRadius(),2)*Math.PI;
		}
		// circumference = perimeter Chuvi
		public double calCircumference()
		{
			return Math.PI*getRadius()*2;
		}
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ban kinh r = 7");
			Circel r1 = new Circel();
			r1.setRadius(7);
			System.out.println(r1.calArea());
			System.out.println(r1.calCircumference());
			//-----------------------------------
			System.out.println("Ban kinh r = 3");
			Circel r2 = new Circel();
			r2.setRadius(3);
			System.out.println(r2.calArea());
			System.out.println(r2.calCircumference());
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
	 
	}