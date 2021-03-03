
public class Animal {
	private int Id_animal;
	private int Height;
	private int Weight;
	private int Age;
	private String Name;

	public Animal() {
		super();
	}

	public Animal(int id_animal, int height, int weight, int age, String name) {
		super();
		Id_animal = id_animal;
		Height = height;
		Weight = weight;
		Age = age;
		Name = name;
	}

	public int getId_animal() {
		return Id_animal;
	}

	public void setId_animal(int id_animal) {
		Id_animal = id_animal;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Animal [Id_animal=" + Id_animal + ", Height=" + Height + ", Weight=" + Weight + ", Age=" + Age
				+ ", Name=" + Name + "]";
	}

}
