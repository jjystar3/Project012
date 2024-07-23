package generic;

public class Ex02 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder();
		
		printer.setMaterial(p1);
		
		Object object = printer.getMaterial();
		
		Powder p2 = (Powder)object;
		
		p2.doPrinting();
		
	}
}

class ThreeDPrinter3 {

	private Object material; // 자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

}