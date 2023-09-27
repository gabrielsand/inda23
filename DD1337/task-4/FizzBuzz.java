/**
 * Enkel klass som implementerar FizzBuzz.
 *
 * @author Örn Segerstedt
 * @version 2023-09-27
 */
public class FizzBuzz {
    /**
     * Printar alla FizzBuzz-tal i intervallet [1, n] (inklusivt).
     * 
     * @param n den övre gränsen
     */
    public static void print(int n) {
        // Skriv din kod här!
    }

    // Kör FizzBuzz med kommandoradsargument för n
    public static void main(String[] args) {
        // Hämta input från användaren (av typ String)
        String input = args[0];
        // Konvertera input från String till int
        int number = Integer.parseInt(input);
        // Printa
        print(number);
    }
}
