

public class Salvaje {
	private int Id_animal;
	private int Height;
	private int Weight;
	private int Age;
	private String Name;
	private String Specie;
	private int Force;

	public Salvaje(int id_animal, int height, int weight, int age, String name, String specie, int force) {
		super();
		Id_animal = id_animal;
		Height = height;
		Weight = weight;
		Age = age;
		Name = name;
		Specie = specie;
		Force = force;
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

	public String getSpecie() {
		return Specie;
	}

	public void setSpecie(String specie) {
		Specie = specie;
	}

	public int getForce() {
		return Force;
	}

	public void setForce(int force) {
		Force = force;
	}

	@Override
	public String toString() {
		return "Salvaje [Id_animal=" + Id_animal + ", Height=" + Height + ", Weight=" + Weight + ", Age=" + Age
				+ ", Name=" + Name + ", Specie=" + Specie + ", Force=" + Force + "]";
	}
}
