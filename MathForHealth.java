
public class MathForHealth {

	public static void main(String[] args) {
		final double health = 1;
		final double modifiedHealth = 40;
		final double damage = 10;
		double newHealth = health - (damage/modifiedHealth);
		System.out.println(newHealth);
	}

}
