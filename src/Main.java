import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Salvaje> Salvajes = new ArrayList<Salvaje>();
		ArrayList<Domestico> Domesticos = new ArrayList<Domestico>();
		String ruta = "zoo.txt";
		File fichero = new File(ruta);
		int option = 0;

		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Main.CopyFile(fichero, Salvajes, Domesticos, ruta);

		do {
			option = 0;
			Main.ShowMenu();
			while (option > 6 || 0 >= option) {
				option = sn.nextInt();
				if (option > 6 || 0 >= option) {
					System.out.println("Introduzca una opción correcta: ");
				}
			}
			switch (option) {
			case 1:
				Main.Case1(Salvajes, Domesticos, sn, sc);
				break;
			case 2:
				Main.Case2(Salvajes, Domesticos, sn);
				break;
			case 3:
				Main.Case3(Salvajes, Domesticos, sn, sc);
				break;
			case 4:
				Main.Case4(Domesticos);
				break;
			case 5:
				Main.Case5(Salvajes, Domesticos);
				break;
			case 6:
				System.out.println("Ha salido.");
				break;
			}
		} while (option != 6);
		Main.SaveCopyInRealOne(Salvajes, Domesticos, ruta);
	}

	public static void CopyFile(File fichero, ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos,
			String ruta) {
		if (fichero.exists()) {
			String linea = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				while (linea != null) {
					linea = br.readLine();
					if (linea != null) {
						String[] Data = linea.split("\\|");
						if (Data[0].equalsIgnoreCase("salvaje")) {
							Salvaje SalvajeAñadir = new Salvaje(Integer.parseInt(Data[1]), Integer.parseInt(Data[2]),
									Integer.parseInt(Data[3]), Integer.parseInt(Data[4]), Data[5], Data[6],
									Integer.parseInt(Data[7]));
							Salvajes.add(SalvajeAñadir);
						} else if (Data[0].equalsIgnoreCase("domestico")) {
							boolean Data8 = false;
							if (Data[8].equalsIgnoreCase("true")) {
								Data8 = true;
							}
							Domestico DomesticoAñadir = new Domestico(Integer.parseInt(Data[1]),
									Integer.parseInt(Data[2]), Integer.parseInt(Data[3]), Integer.parseInt(Data[4]),
									Data[5], Data[6], Data8, Data[7], Data[8]);
							Domesticos.add(DomesticoAñadir);
						}
					}
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ShowMenu() {
		System.out.println("Pulsa 1 si: Alta animal." + '\n' + "Pulsa 2 si: Baja animal" + '\n'
				+ "Pulsa 3 si: Modificación de dato de animal" + '\n'
				+ "Pulsa 4 si: Listado de todos los animales domésticos por pantalla ordenados por edad" + '\n'
				+ "Pulsa 5 si: Listado de todos los animales salvajes y domésticos juntos por pantalla ordenados por peso"
				+ '\n' + "Pulsa 6 si: Salir");
	}

	public static void Case1(ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos, Scanner sn, Scanner sc) {
		int option = 0;
		System.out.println("Pulse 1 si es salvaje o pulse 2 si es domestico.");
		while (option > 2 || 0 >= option) {
			option = sn.nextInt();
			if (option > 2 || 0 >= option) {
				System.out.println("Introduzca una opción correcta: ");
			}
		}
		switch (option) {
		case 1:
			boolean Exist = true;
			int IdGiven = 0;
			while (Exist == true) {
				Exist = false;
				System.out.println("SALVAJE" + '\n' + "Introduzca el Id: ");
				IdGiven = sn.nextInt();
				for (int i = 0; Salvajes.size() > i; i++) {
					if (IdGiven == Salvajes.get(i).getId_animal()) {
						Exist = true;
						System.out.println("Ese Id ya existe, introduzca otro.");
					}
				}
			}
			System.out.println("Introduzca la altura: ");
			int HeightGiven = sn.nextInt();
			System.out.println("Introduzca el peso: ");
			int WeightGiven = sn.nextInt();
			System.out.println("Introduzca la edad: ");
			int AgeGiven = sn.nextInt();
			System.out.println("Introduzca el nombre: ");
			String NameGiven = sc.nextLine();
			System.out.println("Introduzca la especie: ");
			String SpecieGiven = sc.nextLine();
			System.out.println("Introduzca la fuerza: ");
			int ForceGiven = sn.nextInt();
			Salvaje SalvajeAñadir = new Salvaje(IdGiven, HeightGiven, WeightGiven, AgeGiven, NameGiven, SpecieGiven,
					ForceGiven);
			Salvajes.add(SalvajeAñadir);
			System.out.println("Animal añadido." + '\n');
			break;
		case 2:
			boolean Exist2 = true;
			int IdGiven2 = 0;
			while (Exist2 == true) {
				Exist2 = false;
				System.out.println("Introduzca el Id: ");
				IdGiven2 = sn.nextInt();
				for (int i = 0; Salvajes.size() > i; i++) {
					if (IdGiven2 == Salvajes.get(i).getId_animal()) {
						Exist2 = true;
						System.out.println("Ese Id ya existe, introduzca otro.");
					}
				}
			}
			System.out.println("Introduzca la altura: ");
			int HeightGiven2 = sn.nextInt();
			System.out.println("Introduzca el peso: ");
			int WeightGiven2 = sn.nextInt();
			System.out.println("Introduzca la edad: ");
			int AgeGiven2 = sn.nextInt();
			System.out.println("Introduzca el nombre: ");
			String NameGiven2 = sc.nextLine();
			System.out.println("Introduzca la especie: ");
			String SpecieGiven2 = sc.nextLine();
			System.out.println("¿Es mimoso? (y/n)");
			String option2 = "";
			boolean Lovely = false;
			while (!option2.equalsIgnoreCase("y") && !option2.equalsIgnoreCase("n")) {
				option2 = sc.nextLine();
				Lovely = false;
				switch (option2) {
				case "y":
					Lovely = true;
					break;
				case "n":
					Lovely = false;
					break;
				}
				if (!option2.equalsIgnoreCase("y") && !option2.equalsIgnoreCase("n")) {
					System.out.println("Introduzca y/n.");
				}
			}
			System.out.println("Introduzca el sonido que hace: ");
			String SoundGiven2 = sc.nextLine();
			System.out.println("Introduzca el nombre del dueño: ");
			String OwnerGiven2 = sc.nextLine();
			Domestico DomesticoAñadir = new Domestico(IdGiven2, HeightGiven2, WeightGiven2, AgeGiven2, NameGiven2,
					SpecieGiven2, Lovely, SoundGiven2, OwnerGiven2);
			Domesticos.add(DomesticoAñadir);
			System.out.println("Animal añadido." + '\n');
			break;
		}
	}

	public static void Case2(ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos, Scanner sn) {
		boolean Found = false;
		System.out.println("Introduzca el Id: ");
		int IdGiven = sn.nextInt();
		for (int i = 0; Salvajes.size() > i; i++) {
			if (IdGiven == Salvajes.get(i).getId_animal()) {
				Salvajes.remove(i);
				Found = true;
			}
		}
		for (int i = 0; Domesticos.size() > i; i++) {
			if (IdGiven == Domesticos.get(i).getId_animal()) {
				Domesticos.remove(i);
				Found = true;
			}
		}
		if (Found == true) {
			System.out.println("Animal eliminado." + '\n');
		} else {
			System.out.println("Animal no encontrado." + '\n');
		}
	}

	public static void Case3(ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos, Scanner sn, Scanner sc) {
		boolean Found = false;
		int position = 0;
		System.out.println("Introduzca el Id: ");
		int IdGiven = sn.nextInt();
		for (int i = 0; Salvajes.size() > i; i++) {
			if (IdGiven == Salvajes.get(i).getId_animal()) {
				position = i;
				Found = true;
				System.out.println("Pulse 1 si: cambiar altura" + '\n' + "Pulse 2 si: cambiar peso" + '\n'
						+ "Pulse 3 si: cambiar edad" + '\n' + "Pulse 4 si: cambiar fuerza");
				int option = sn.nextInt();
				while (option > 4 || 0 >= option) {
					option = sn.nextInt();
					if (option > 4 || 0 >= option) {
						System.out.println("Introduzca una opción correcta: ");
					}
				}
				switch (option) {
				case 1:
					System.out.println("Introduzca la nueva altura: ");
					int NewHeight = sn.nextInt();
					Salvajes.get(position).setHeight(NewHeight);
					break;
				case 2:
					System.out.println("Introduzca el nuevo peso: ");
					int NewWeight = sn.nextInt();
					Salvajes.get(position).setHeight(NewWeight);
					break;
				case 3:
					System.out.println("Introduzca la nueva edad: ");
					int NewAge = sn.nextInt();
					Salvajes.get(position).setHeight(NewAge);
					break;
				case 4:
					System.out.println("Introduzca la nueva fuerza: ");
					int NewForce = sn.nextInt();
					Salvajes.get(position).setHeight(NewForce);
					break;
				}
				System.out.println("Datos cambiados." + '\n');
			}
		}
		for (int i = 0; Domesticos.size() > i; i++) {
			if (IdGiven == Domesticos.get(i).getId_animal()) {
				position = i;
				Found = true;
				System.out.println("Pulse 1 si: cambiar altura" + '\n' + "Pulse 2 si: cambiar peso" + '\n'
						+ "Pulse 3 si: cambiar edad" + '\n' + "Pulse 4 si: cambiar dueño");
				int option = sn.nextInt();
				while (option > 4 || 0 >= option) {
					option = sn.nextInt();
					if (option > 4 || 0 >= option) {
						System.out.println("Introduzca una opción correcta: ");
					}
				}
				switch (option) {
				case 1:
					System.out.println("Introduzca la nueva altura: ");
					int NewHeight = sn.nextInt();
					Domesticos.get(position).setHeight(NewHeight);
					break;
				case 2:
					System.out.println("Introduzca el nuevo peso: ");
					int NewWeight = sn.nextInt();
					Domesticos.get(position).setHeight(NewWeight);
					break;
				case 3:
					System.out.println("Introduzca la nueva edad: ");
					int NewAge = sn.nextInt();
					Domesticos.get(position).setHeight(NewAge);
					break;
				case 4:
					System.out.println("Introduzca el nuevo dueño: ");
					String NewOwner = sc.nextLine();
					Domesticos.get(position).setOwner(NewOwner);
					break;
				}
				System.out.println("Datos cambiados." + '\n');
			}
		}
		if (Found == false) {
			System.out.println("Animal no encontrado." + '\n');
		}
	}

	public static void Case4(ArrayList<Domestico> Domesticos) {
		/*Collections.sort(Domesticos, new Comparator<Domestico>() {
			public int compare(Domestico D1, Domestico D2) {
				return new Integer(D2.getAge()).compareTo(new Integer(D1.getAge()));
			}
		});
		for (int i = 0; Domesticos.size() > i; i++) {
			System.out.println(Domesticos.get(i).toString());
		}
		System.out.print('\n');*/
	}

	public static void Case5(ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos) {
		int length = Salvajes.size() + Domesticos.size();
		int[][] WeigthAndId = new int[2][length];
		int[] helper = new int[1];
		int for2 = 0;
		for (int i = 0; Salvajes.size() > i; i++) {
			WeigthAndId[0][i] = Salvajes.get(i).getWeight();
			WeigthAndId[1][i] = Salvajes.get(i).getId_animal();
			for2 = i + 1;
		}
		for (int i = 0; Domesticos.size() > i; i++) {
			WeigthAndId[0][for2] = Domesticos.get(i).getWeight();
			WeigthAndId[1][for2] = Domesticos.get(i).getId_animal();
			for2++;
		}
		int times = (length);
		do {
			for (int i = (length - 1); 0 < i; i--) {
				int j = i - 1;
				if (WeigthAndId[0][i] > WeigthAndId[0][j]) {
					helper[0] = WeigthAndId[0][i];
					WeigthAndId[0][i] = WeigthAndId[0][j];
					WeigthAndId[0][j] = helper[0];
					helper[0] = WeigthAndId[1][i];
					WeigthAndId[1][i] = WeigthAndId[1][j];
					WeigthAndId[1][j] = helper[0];
				}
			}
			times--;
		} while (times != 0);
		for (int i = 0; length > i; i++) {
			for (int j = 0; Salvajes.size() > j; j++) {
				if (WeigthAndId[1][i] == Salvajes.get(j).getId_animal()) {
					System.out.println(Salvajes.get(j).toString());
				}
			}
			for (int j = 0; Domesticos.size() > j; j++) {
				if (WeigthAndId[1][i] == Domesticos.get(j).getId_animal()) {
					System.out.println(Domesticos.get(j).toString());
				}
			}
		}
		System.out.print('\n');
	}

	public static void SaveCopyInRealOne(ArrayList<Salvaje> Salvajes, ArrayList<Domestico> Domesticos, String ruta) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			for (int i = 0; Salvajes.size() > i; i++) {
				bw.write("salvaje|" + Salvajes.get(i).getId_animal() + "|" + Salvajes.get(i).getHeight() + "|"
						+ Salvajes.get(i).getWeight() + "|" + Salvajes.get(i).getAge() + "|" + Salvajes.get(i).getName()
						+ "|" + Salvajes.get(i).getSpecie() + "|" + Salvajes.get(i).getForce() + '\n');
			}
			for (int i = 0; Domesticos.size() > i; i++) {
				String LovelyText = "";
				if (Domesticos.get(i).isLovely()) {
					LovelyText = "true";
				} else {
					LovelyText = "false";
				}
				bw.write("domestico|" + Domesticos.get(i).getId_animal() + "|" + Domesticos.get(i).getHeight() + "|"
						+ Domesticos.get(i).getWeight() + "|" + Domesticos.get(i).getAge() + "|"
						+ Domesticos.get(i).getName() + "|" + Domesticos.get(i).getSpecie() + "|" + LovelyText + "|"
						+ Domesticos.get(i).getSound() + "|" + Domesticos.get(i).getOwner() + '\n');
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


