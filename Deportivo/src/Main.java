import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner (System.in);
        try {
            Jugador player1 = new Jugador("Alan", 21, true, true, 2);
            Jugador player2 = new Jugador("Pedro", 17, true, true, 0);
            Jugador player3 = new Jugador("Juan", 19, false, true, 1);
            Jugador player4 = new Jugador("Beto", 24, true, false, 3);
            System.out.println("Jugador 1");
            System.out.println("Nombre: " + player1.getNombre());
            System.out.println("Edad: " + player1.getEdad());
            System.out.println("Partidos Jugados: " + player1.getPartidosJugados());
            player1.validarEdad();
            player1.validarExamenMedico();
            player1.validarSanciones();

            Arbitro arbitro1 = new Arbitro("Pepe", 45, true, true, 7);
            Arbitro arbitro2 = new Arbitro("Alex", 16, true, true, 7);
            Arbitro arbitro3 = new Arbitro("Tito", 25, false, true, 7);
            Arbitro arbitro4 = new Arbitro("Ariel", 30, true, false, 7);
            System.out.println("Arbitro 1");
            System.out.println("Nombre: " + arbitro1.getNombre());
            System.out.println("Edad: " + arbitro1.getEdad());
            System.out.println("Partidos Pitados: " + arbitro1.getPartidosPitados());
            arbitro1.validarEdad();
            arbitro1.validarExamenMedico();
            arbitro1.validarSanciones();
            System.out.println("Ingrese su nombre: ");
            String nombre = escaner.next();
            System.out.println("Ingrese su edad: ");
            int edad = escaner.nextInt();
            System.out.println("Tiene Examenes Medicos(true/false): ");
            boolean examenesM = escaner.nextBoolean();
            System.out.println("Si no tiene sancion (true), si tiene (false): ");
            boolean sinSancion = escaner.nextBoolean();
            System.out.println("Ingrese el numero de partidos: ");
            int partidos = escaner.nextInt();

            player2.setNombre(nombre);
            player2.setEdad(edad);
            player2.setExamenMedicoPasado(examenesM);
            player2.setSinSanciones(sinSancion);
            player2.setPartidosJugados(partidos);

            System.out.println("Jugador 2");
            System.out.println("Nombre: " + player2.getNombre());
            System.out.println("Edad: " + player2.getEdad());
            System.out.println("Partidos Jugados: " + player2.getPartidosJugados());
            player2.validarEdad();
            player2.validarExamenMedico();
            player2.validarSanciones();
        } catch (Exception e){
            System.out.println("Ha sucedido un error");
        }
    }
}