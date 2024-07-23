package generic;

class Powder {

	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Powder 입니다";
	}

}

class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Plastic 입니다";
	}

}

class ThreeDPrinter1 {

	private Powder material;

	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}

}

class ThreeDPrinter2 {

	private Plastic material;

	public Plastic getMaterial() {
		return material;
	}

	public void setMaterial(Plastic material) {
		this.material = material;
	}

}