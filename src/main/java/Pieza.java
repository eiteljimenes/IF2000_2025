/**
 * Clase que representa una pieza del juego de damas
 * Cada pieza tiene un color (R para rojo, B para negro)
 */
public class Pieza {
    private String color; // Almacena el color de la pieza: "R" para rojo, "B" para negro
    
    /**
     * Constructor de la clase Pieza
     * @param color El color de la pieza ("R" o "B")
     */
    public Pieza(String color) {
        this.color = color; // Asigna el color recibido al atributo de la clase
    }
    
    /**
     * Método para obtener el color de la pieza
     * @return El color de la pieza
     */
    public String getColor() {
        return color; // Devuelve el color almacenado
    }
    
    /**
     * Método para representar la pieza como texto
     * @return El color de la pieza como String
     */
    @Override
    public String toString() {
        return color; // Cuando se imprima la pieza, se mostrará su color
    }
}