class obj{
	int width;
	int height;
	int length;
	int surfaceArea;
	double volume;
	double r;
	
	
	
	void Cal_Area() {
		System.out.println("�b�|="+r);
		System.out.println("�y����n="+volume);
		System.out.println("��="+length+",�e="+width+",��"+height);
		System.out.println("�ߤ�����n="+surfaceArea);
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
 * �b�|=10.0
�y����n=4188.786666666667
��=4,�e=5,��6
�ߤ�����n=148*/
