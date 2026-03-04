package main;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Fusca", 1980, "verde");
		System.out.println("A marca do carro é " + carro1.getMarca());
		System.err.println("O ano do carro é " + carro1.getAno());
		System.err.println("A cor do carro é " + carro1.getCor());	
		System.out.println("--------------------------------------------------");	
		Trator trator1 = new Trator ("Renalt", 2000, "cinza", "200cv", "4 rodas");
		System.out.println("A marca do trator é " + trator1.getMarca());
		System.out.println("A potência do trator é " + trator1.getPotencia());
		System.out.println("A roda do trator é " + trator1.getRoda());
		System.out.println("--------------------------------------------------");	
		
		System.out.println("O carro faz " + carro1.Buzinar());

		System.out.println("O trator faz " + trator1.Buzinar());
	}

}
