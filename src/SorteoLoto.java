import java.util.Random;

public class SorteoLoto {
    public static void main(String[] args) {
        // Creamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // Creamos un array para almacenar los números del sorteo
        int[] numerosSorteo = new int[6];

        // Generamos los 6 números aleatorios
        for (int i = 0; i < 6; i++) {
            // Generamos un número aleatorio entre 1 y 41 (inclusive)
            int numero = random.nextInt(41) + 1;
            
            // Verificamos que el número generado no esté repetido
            while (contieneNumero(numerosSorteo, numero)) {
                numero = random.nextInt(41) + 1;
            }

            // Almacenamos el número en el array
            numerosSorteo[i] = numero;
        }

        // Mostramos los números del sorteo
        System.out.print("Números del sorteo: ");
        for (int num : numerosSorteo) {
            System.out.print(num + " ");
        }
    }

    // Método para verificar si un número ya está en el array
    private static boolean contieneNumero(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }
}

