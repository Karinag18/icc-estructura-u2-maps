import controllers.Mapa;
import controllers.EmpleadoContoller;
import controllers.Ejercicios;

import models.Empleado;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runMapExample() {
        System.out.println("\n----- Ejecutando ejemplo de Mapa -----");
        Mapa mapa = new Mapa();
        mapa.hashMap();
        mapa.linkedhashMapa();
        mapa.treeMapa();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoController = new EmpleadoContoller();
        boolean result = empleadoController.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);
        result = empleadoController.addEmpleado(new Empleado(2, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        // Agregar empleados
        empleadoController.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoController.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoController.addEmpleado(new Empleado(3, "Andres", "Senior"));

        // Mostrar solo los nombres
        empleadoController.displayEmpleadosSoloNombres();
    }

    private static void runEjercicios() {
        System.out.println("\nDeber anagramas y sumatorio");

        // Test de anagramas
        System.out.println("Test areAnagrams");
        System.out.println(Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));   // false
        System.out.println(Ejercicios.areAnagrams("triangle", "integral")); // true

        // Test de sumatoriaDeDos
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("\nTest sumatoriaDeDos");
        System.out.println(Arrays.toString(ejercicios.sumatoriaDeDos(new int[]{9,2,3,6}, 5))); // [1, 2]
        System.out.println(Arrays.toString(ejercicios.sumatoriaDeDos(new int[]{9,2,3,6}, 10))); // null
    }
}
