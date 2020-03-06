package builder;

public class House {

	/* private + final => encapsulation and immutability */
	private final String color;
	private final double size;
	private final String location;

	/* The static inner builder class */
	static class HouseBuilder {
		private String color;
		private double size;
		private String location;

//public HouseBuilder() {}

		/*
		 * The builder method calling calling the private constructor for the outer
		 * class
		 */
		public House build() {
			return new House(this);
		}

		HouseBuilder withColor(String color) {
			this.color = color;
			return this;
		}

		HouseBuilder withSize(double size) {
			this.size = size;
			return this;
		}

		HouseBuilder withLocation(String location) {
			this.location = location;
			return this;
		}
	}

	/* Private constructor force the use of the inner class builder method */
	private House(HouseBuilder builder) {
		this.color = builder.color;
		this.size = builder.size;
		this.location = builder.location;
	}

	public String getColor() {
		return color;
	}

	public double getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}

}