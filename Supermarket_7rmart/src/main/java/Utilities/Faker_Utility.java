package Utilities;

public class Faker_Utility {
	public String getFakeFirstName() {

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.firstName();

		return text;

	}

	public String getFakeLastName() {

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.lastName();

		return text;

	}

}
