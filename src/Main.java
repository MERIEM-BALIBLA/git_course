//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("=== Calculatrice ===");
        System.out.println("5 + 3 = " + calc.additionner(5, 3));
        System.out.println("5 - 3 = " + calc.soustraire(5, 3));
        System.out.println("5 * 3 = " + calc.multiplier(5, 3));
        System.out.println("6 / 3 = " + calc.diviser(6, 3));
    }
}