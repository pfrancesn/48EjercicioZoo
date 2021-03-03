
public class Salvaje extends Animal {
	private String Specie;
	private int Force;

	public Salvaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salvaje(String specie, int force) {
		super();
		Specie = specie;
		Force = force;
	}

	public Salvaje(int id_animal, int height, int weight, int age, String name, String specie, int force) {
		super(id_animal, height, weight, age, name);
		Specie = specie;
		Force = force;
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
		return "Salvaje [Specie=" + Specie + ", Force=" + Force + "]";
	}
	
	

}
