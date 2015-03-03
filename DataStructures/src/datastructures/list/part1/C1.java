package datastructures.list.part1;

public class C1 {
	private String name;
	public C1() {
		this.name = "My name is C";
	}
	
	public C1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
