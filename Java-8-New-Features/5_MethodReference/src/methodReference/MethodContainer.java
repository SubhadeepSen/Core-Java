package methodReference;

public class MethodContainer {

	private final static String city = "Hyderabad";
	private String name;

	public MethodContainer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCity() {
		return city;
	}
}
