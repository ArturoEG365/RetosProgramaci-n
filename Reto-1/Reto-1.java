/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
*/


class retos{
    public static void main( String[] args) {
        for(int a = 1; a <= 100; a++){
            if (a%3==0 && a%5==0) {
                System.out.println("fizzbuzz" + " " +a);
            }else{
                if (a%3==0) {
                    System.out.println("fizz" + " " + a);
                }else{
                    if (a%5==0) {
                        System.out.println("buzz"+ " " + a);
                    }
                    else{
                        System.out.println(a);
                    }
                }
            }
        }
    }
}