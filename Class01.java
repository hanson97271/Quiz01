class obj{
	int width;
	int height;
	int length;
	int surfaceArea;
	double volume;
	double r;
	
	
	
	void Cal_Area() {
		System.out.println("半徑="+r);
		System.out.println("球型體積="+volume);
		System.out.println("長="+length+",寬="+width+",高"+height);
		System.out.println("立方體表面積="+surfaceArea);
	}
}


public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj box=new obj();
		box.height=6;
		box.length=4;
		box.width=5;
		
		box.r=10;
		double pi=3.14159;
		box.volume=pi*box.r*box.r*box.r*4/3;
		box.surfaceArea = (box.height * box.length + box.height * box.width + box.length * box.width) * 2;
		box.Cal_Area();
	}

}
/*output
 * 半徑=10.0
球型體積=4188.786666666667
長=4,寬=5,高6
立方體表面積=148*/
