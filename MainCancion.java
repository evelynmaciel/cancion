
import java.util.Scanner;

public class MainCancion {

    public static void main(String[] args) {
        Scanner musica = new Scanner(System.in);
        System.out.println("Ingresa el titulo de una cancion:");
        String titulo = musica.nextLine();
        System.out.println("Ingresa el autor de dicha cancion o el grupo musical:");
        String autor = musica.nextLine();
        Cancion miCancion = new Cancion();
        miCancion.setTitulo(titulo);
        miCancion.setAutor(autor);
        miCancion.getTitulo();
        miCancion.getAutor();
        System.out.println(miCancion.toString());
    }
}
