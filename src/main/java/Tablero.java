/**
 * Clase que representa el tablero de juego
 * Contiene una matriz 8x8 y métodos para manipularla
 */
public class Tablero {
    private Pieza[][] casillas; // Matriz 8x8 que almacena las piezas
    private static final int TAMANIO = 8; // Tamaño constante del tablero
    
    /**
     * Constructor del tablero - inicializa el tablero con las piezas en posición inicial
     */
    public Tablero() {
        casillas = new Pieza[TAMANIO][TAMANIO]; // Creamos matriz 8x8
        inicializarTablero(); // Llamamos al método que coloca las piezas iniciales
    }
    
    /**
     * Método para colocar las piezas en su posición inicial
     */
    private void inicializarTablero() {
        // Recorremos todas las filas y columnas del tablero
        for (int fila = 0; fila < TAMANIO; fila++) {
            for (int columna = 0; columna < TAMANIO; columna++) {
                // Las piezas solo van en casillas donde (fila + columna) es impar
                if ((fila + columna) % 2 != 0) {
                    if (fila < 3) {
                        // Primeras 3 filas: piezas negras ("B")
                        casillas[fila][columna] = new Pieza("B");
                    } else if (fila > 4) {
                        // Últimas 3 filas: piezas rojas ("R")
                        casillas[fila][columna] = new Pieza("R");
                    }
                    // Las filas 3 y 4 se dejan vacías (no se crean piezas)
                }
            }
        }
    }
    
    /**
     * Método para mostrar el tablero en consola
     */
    public void mostrarTablero() {
        System.out.println("\n  Tablero de Damas");
        System.out.println("  0 1 2 3 4 5 6 7"); // Encabezado de columnas
        
        for (int fila = 0; fila < TAMANIO; fila++) {
            System.out.print(fila + " "); // Muestra el número de fila
            
            for (int columna = 0; columna < TAMANIO; columna++) {
                if (casillas[fila][columna] != null) {
                    // Si hay pieza, muestra su color
                    System.out.print(casillas[fila][columna] + " ");
                } else if ((fila + columna) % 2 == 0) {
                    // Casilla blanca (no jugable)
                    System.out.print("■ ");
                } else {
                    // Casilla negra vacía
                    System.out.print(". ");
                }
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        System.out.println(); // Línea en blanco al final
    }
    
    /**
     * Método para validar si un movimiento es legal
     * @param filaOrigen Fila de origen
     * @param colOrigen Columna de origen
     * @param filaDestino Fila de destino
     * @param colDestino Columna de destino
     * @param turnoActual Color del turno actual ("R" o "B")
     * @return true si el movimiento es válido, false si no lo es
     */
    public boolean validarMovimiento(int filaOrigen, int colOrigen, 
                                   int filaDestino, int colDestino, 
                                   String turnoActual) {
        
        // 1. Validar que las coordenadas estén dentro del tablero
        if (filaOrigen < 0 || filaOrigen >= TAMANIO || colOrigen < 0 || colOrigen >= TAMANIO ||
            filaDestino < 0 || filaDestino >= TAMANIO || colDestino < 0 || colDestino >= TAMANIO) {
            System.out.println("Error: Las coordenadas deben estar entre 0 y 7");
            return false;
        }
        
        // 2. Validar que haya una pieza en la posición de origen
        if (casillas[filaOrigen][colOrigen] == null) {
            System.out.println("Error: No hay pieza en la posición seleccionada");
            return false;
        }
        
        // 3. Validar que el color de la pieza coincida con el turno actual
        if (!casillas[filaOrigen][colOrigen].getColor().equals(turnoActual)) {
            System.out.println("Error: No es el turno de las piezas " + 
                             casillas[filaOrigen][colOrigen].getColor());
            return false;
        }
        
        // 4. Validar que la casilla destino esté vacía
        if (casillas[filaDestino][colDestino] != null) {
            System.out.println("Error: La casilla destino está ocupada");
            return false;
        }
        
        // 5. Validar que el movimiento sea diagonal (una casilla en diagonal)
        int diffFila = filaDestino - filaOrigen;
        int diffCol = colDestino - colOrigen;
        
        // El movimiento debe ser exactamente una casilla en diagonal
        if (Math.abs(diffFila) != 1 || Math.abs(diffCol) != 1) {
            System.out.println("Error: Solo se permiten movimientos diagonales de una casilla");
            return false;
        }
        
        // 6. Validar dirección según el color
        if (turnoActual.equals("R")) {
            // Piezas rojas solo pueden moverse hacia abajo (aumentar fila)
            if (diffFila != 1) {
                System.out.println("Error: Las piezas rojas solo pueden moverse hacia abajo");
                return false;
            }
        } else { // Piezas negras
            // Piezas negras solo pueden moverse hacia arriba (disminuir fila)
            if (diffFila != -1) {
                System.out.println("Error: Las piezas negras solo pueden moverse hacia arriba");
                return false;
            }
        }
        
        // 7. Validar que sea una casilla negra (donde (fila+columna) es impar)
        if ((filaDestino + colDestino) % 2 == 0) {
            System.out.println("Error: Solo se puede mover a casillas negras");
            return false;
        }
        
        // Si pasó todas las validaciones, el movimiento es válido
        return true;
    }
    
    /**
     * Método para ejecutar un movimiento en el tablero
     * @param filaOrigen Fila de origen
     * @param colOrigen Columna de origen
     * @param filaDestino Fila de destino
     * @param colDestino Columna de destino
     */
    public void moverPieza(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        // Mueve la pieza de origen a destino
        casillas[filaDestino][colDestino] = casillas[filaOrigen][colOrigen];
        // Deja vacía la casilla de origen
        casillas[filaOrigen][colOrigen] = null;
    }
}