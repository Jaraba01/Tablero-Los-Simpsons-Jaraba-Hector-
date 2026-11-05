import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;

    public static void main(String[] args) {
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 'L';
            }
        }
        Random aleatorio = new Random();
        int filaaleatoria = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaaleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        tablero[filaaleatoria][columnaaleatoria] = 'B';

        int filaaleatoriaHomer;
        int columnaaleatoriaHomer;
        for (int i = 0; i < 10; i++) {
            do {
             filaaleatoriaHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
             columnaaleatoriaHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            }while(tablero[filaaleatoriaHomer][columnaaleatoriaHomer] != 'L');
            tablero[filaaleatoriaHomer][columnaaleatoriaHomer] = 'H';
        }
        int filaaleatoriaMuro;
        int columnaaleatoriaMuro;
        for (int i = 0; i < 10; i++) {
            do {
                filaaleatoriaMuro = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaaleatoriaMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            }while(tablero[filaaleatoriaMuro][columnaaleatoriaMuro] != 'L');
            tablero[filaaleatoriaMuro][columnaaleatoriaMuro] = 'M';
        }
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
    }
    private static void  imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}