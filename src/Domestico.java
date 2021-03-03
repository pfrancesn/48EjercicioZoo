
public class Domestico extends Animal {
	private String Specie;
	private boolean Lovely;
	private String Sound;
	private String Owner;

	public Domestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domestico(String specie, boolean lovely, String sound, String owner) {
		super();
		Specie = specie;
		Lovely = lovely;
		Sound = sound;
		Owner = owner;
	}

	public Domestico(int id_animal, int height, int weight, int age, String name, String specie, boolean lovely,
			String sound, String owner) {
		super(id_animal, height, weight, age, name);
		Specie = specie;
		Lovely = lovely;
		Sound = sound;
		Owner = owner;
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
		return "Domestico [Specie=" + Specie + ", Lovely=" + Lovely + ", Sound=" + Sound + ", Owner=" + Owner + "]";
	}

}
