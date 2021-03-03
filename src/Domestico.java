

public class Domestico {
	private int Id_animal;
	private int Height;
	private int Weight;
	private int Age;
	private String Name;
	private String Specie;
	private boolean Lovely;
	private String Sound;
	private String Owner;

	public Domestico(int id_animal, int height, int weight, int age, String name, String specie, boolean lovely,
			String sound, String owner) {
		super();
		Id_animal = id_animal;
		Height = height;
		Weight = weight;
		Age = age;
		Name = name;
		Specie = specie;
		Lovely = lovely;
		Sound = sound;
		Owner = owner;
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

	public boolean isLovely() {
		return Lovely;
	}

	public void setLovely(boolean lovely) {
		Lovely = lovely;
	}

	public String getSound() {
		return Sound;
	}

	public void setSound(String sound) {
		Sound = sound;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	@Override
	public String toString() {
		return "Domestico [Id_animal=" + Id_animal + ", Height=" + Height + ", Weight=" + Weight + ", Age=" + Age
				+ ", Name=" + Name + ", Specie=" + Specie + ", Lovely=" + Lovely + ", Sound=" + Sound + ", Owner="
				+ Owner + "]";
	}
}
