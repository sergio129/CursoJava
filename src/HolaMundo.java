
import java.util.Scanner;

public class HolaMundo {
    public static void main(String args[]) {
        Scanner Dato = new Scanner(System.in);
        System.out.print("Proporciona el titulo:");
        String titulo = Dato.nextLine();
        System.out.print("Proporciona el autor:");
        String autor = Dato.nextLine();
        System.out.print(titulo+ " fue escrito por " +autor);

    }
}
