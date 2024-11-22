package numeros_aleatorios;

public class Aleatorio {

	public static void main(String[] args) {
		int[] aleatorio = new int[100];
		System.out.println("Número aleatorio");
		for(int i =0; i<aleatorio.length; i++) {
			aleatorio[i] = (int) (Math.random()*10);
			System.out.println(i + ": " + aleatorio[i]);
		}

	}

}
