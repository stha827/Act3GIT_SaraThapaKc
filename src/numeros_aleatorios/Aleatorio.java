package numeros_aleatorios;

public class Aleatorio {

	public static void main(String[] args) {
		int[] aleatorio = new int[20];
		for(int i =0; i<aleatorio.length; i++) {
			aleatorio[i] = (int) (Math.random()*10);
			System.out.println(i + ": " + aleatorio[i]);
		}

	}

}
