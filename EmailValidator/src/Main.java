import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Verifica que se haya pasado un argumento
        if (args.length != 1) {
            System.out.println("Por favor, proporciona una cadena como argumento.");
            System.exit(1);
        }

        String email = args[0];
        String regex = "^[a-zA-Z0-9._%+-]+@(unison|uson)\\.mx$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);


        if (matcher.matches()) {
            System.out.println("La cadena es un correo válido.");
        } else {
            System.out.println("La cadena no es un correo válido.");
        }
    }
}
