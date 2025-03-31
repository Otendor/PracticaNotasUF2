import java.util.Scanner;

/**
 * Esta clase se encarga de gestionar las notas del estudiante y calcular su nota final.
 */
public class notas {

    /**
     * Nota de la UF1.
     */
    double uf1;

    /**
     * Nota de la UF2.
     */
    double uf2;

    /**
     * Nota de la UF3.
     */
    double uf3;

    /**
     * Acumulado de la UF1 (35%).
     */
    double acu1;

    /**
     * Acumulado de la UF2 (35%).
     */
    double acu2;

    /**
     * Acumulado de la UF3 (30%).
     */
    double acu3;

    /**
     * Nota final después de calcular los acumulados.
     */
    double def;

    /**
     * Objeto Scanner para leer lo que ingrese el usuario.
     */
    Scanner entrada = new Scanner(System.in);

    /**
     * Pide al usuario que ingrese las notas.
     */
    public void IngresaNotas() {
        System.out.println("Vamos a meter las notas del estudiante:");
        System.out.print("Pon la nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Pon la nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Pon la nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Chequea si las notas son válidas (no mayores a 10).
     */
    public void comprobarcion() {
        if (uf1 > 10) System.out.println("La nota 1 está mal, es mayor a 10");
        else System.out.println("La nota 1 está bien");

        if (uf2 > 10) System.out.println("La nota 2 está mal, es mayor a 10");
        else System.out.println("La nota 2 está bien");

        if (uf3 > 10) System.out.println("La nota 3 está mal, es mayor a 10");
        else System.out.println("La nota 3 está bien");
    }

    /**
     * Calcula los acumulados y la nota definitiva.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Muestra por pantalla las notas y los acumulados.
     */
    public void Mostrar() {
        System.out.println("Estas son las notas que metiste:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Indica si el estudiante aprobó o suspendió.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) System.out.println("Lo siento, suspendiste");
        else if (def >= 5 && def <= 10) System.out.println("¡Enhorabuena, aprobaste!");
        else System.out.println("Hubo un error con las notas");
    }

    /**
     * Método principal para ejecutar la aplicación.
     * @param args Los argumentos que se puedan pasar desde la línea de comandos.
     */
    public static void main(String[] args) {
        notas fc = new notas();
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
