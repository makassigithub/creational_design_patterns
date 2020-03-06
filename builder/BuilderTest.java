package builder;

public class BuilderTest {
	public static void main(String... args) {
		House.HouseBuilder builder = new House.HouseBuilder();

		House myLovelyHouse = builder.withColor("green").withSize(234 * 100.54).withLocation("Zambakro").build();

		System.out.println("color: " + myLovelyHouse.getColor());
		System.out.println("size: " + myLovelyHouse.getSize());
		System.out.println("location: " + myLovelyHouse.getLocation());

	}

}
