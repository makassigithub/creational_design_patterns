package prototype;

import java.util.HashMap;
import java.util.Map;

/* A registry serves an in memory database for protoptypes*/
public class Registry {
	private Map<String, Person> persons = new HashMap<String, Person>();

	public Registry() {
		loadPersons();
	}

	public Person createPerson(String type) {
		Person p = null;
		try {
			p = (Person) persons.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

	private void loadPersons() {
		Man man = new Man();
		man.setName("Brahima");
		man.setAge(37);
		man.setCountry(new Country());
		persons.put("man", man);
		Woman woman = new Woman();
		woman.setName("Claudine");
		woman.setAge(36);
		woman.setCountry(new Country());
		persons.put("woman", woman);
	}
}
