package SRC;
public class ejemplo5 {
 
    record Punto(int x, int y) {}
    record Linea(Punto inicio, Punto fin) {}
 
    public static void main(String[] args) {
        Object figura = new Linea(new Punto(0, 0), new Punto(5, 8));
 
        if (figura instanceof Linea linea) {
            Punto inicio = linea.inicio();
            Punto fin = linea.fin();
            System.out.println("Desde (" + inicio.x() + "," + inicio.y() + ") hasta (" + fin.x() + "," + fin.y() + ")");
        }
    }
}
