import java.util.Scanner;

/**
 * Clase principal que controla el flujo del juego
 * Maneja los turnos y la interacción con los jugadores
 */
public class Juego {
    private Tablero tablero; // El tablero de juego
    private String turnoActual; // Indica de quién es el turno: "R" o "B"
    private Scanner scanner; // Para leer la entrada del usuario
    
    /**
     * Constructor del juego - inicializa los componentes
     */
    public Juego() {
        tablero = new Tablero(); // Crea un nuevo tablero
        turnoActual = "R"; // Empiezan las piezas rojas
        scanner = new Scanner(System.in); // Prepara el scanner para leer entrada
    }
    
    /**
     * Método principal que ejecuta el juego
     */
    public void jugar() {
        System.out.println("=== JUEGO DE DAMAS ===");
        System.out.println("Instrucciones:");
        System.out.println("- Las piezas R (rojas) empiezan el juego");
        System.out.println("- Las piezas B (negras) juegan después");
        System.out.println("- Ingresa las coordenadas como números (0-7)");
        System.out.println("- Formato: fila columna (ejemplo: 2 3)");
        
        // Bucle principal del juego
        while (true) {
            // 1. Mostrar el tablero actual
            tablero.mostrarTablero();
            
            // 2. Indicar de quién es el turno
            System.out.println("Turno de las piezas: " + 
                             (turnoActual.equals("R") ? "ROJAS (R)" : "NEGRAS (B)"));
            
            // 3. Obtener las coordenadas del jugador
            int[] coordenadas = obtenerCoordenadas();
            if (coordenadas == null) {
                continue; // Si hubo error, volver a pedir coordenadas
            }
            
            int filaOrigen = coordenadas[0];
            int colOrigen = coordenadas[1];
            int filaDestino = coordenadas[2];
            int colDestino = coordenadas[3];
            
            // 4. Validar y ejecutar el movimiento
            if (tablero.validarMovimiento(filaOrigen, colOrigen, filaDestino, colDestino, turnoActual)) {
                tablero.moverPieza(filaOrigen, colOrigen, filaDestino, colDestino);
                System.out.println("¡Movimiento exitoso!");
                
                // 5. Cambiar el turno
                turnoActual = (turnoActual.equals("R")) ? "B" : "R";
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }
    }
    
    /**
     * Método para obtener las coordenadas de origen y destino del jugador
     * @return Array con [filaOrigen, colOrigen, filaDestino, colDestino] o null si hay error
     */
    private int[] obtenerCoordenadas() {
        try {
            System.out.print("Ingresa fila y columna de ORIGEN (ej: 5 2): ");
            int filaOrigen = scanner.nextInt();
            int colOrigen = scanner.nextInt();
            
            System.out.print("Ingresa fila y columna de DESTINO (ej: 4 3): ");
            int filaDestino = scanner.nextInt();
            int colDestino = scanner.nextInt();
            
            // Limpiar el buffer del scanner
            scanner.nextLine();
            
            return new int[]{filaOrigen, colOrigen, filaDestino, colDestino};
            
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar números válidos (0-7)");
            scanner.nextLine(); // Limpiar el buffer en caso de error
            return null;
        }
    }
}