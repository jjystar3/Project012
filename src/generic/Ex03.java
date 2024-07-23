package generic;

public class Ex03 {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();

		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}
}

class ThreeDPrinter<T> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
}
