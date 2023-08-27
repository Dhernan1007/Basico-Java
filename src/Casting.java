public class Casting {
    public static void main(String[] args) {

        //En un año ubiqué a 30 perritos
        // Cuántos perritos ubiqué al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);//2.5

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        //                            ^
        //                        casteo de datos
        System.out.println(estimatedMonthlyDogs); //2
        //al castear de esta manera del ejemplo quita la parte decimal

        //EXACTITUD

        int a = 30;
        int b = 12;

        System.out.println(a/b);//2 --> porque son variables enteras y su resultado tambien lo será
        System.out.println((double) a/b); // 2.5 ahora si me dará en decimal

        //CASTEO ENTRE TIPOS DE DATOS
        int c = 30;
        int d = 12;

        double e = c/d;
        System.out.println(e + " este es");//2.0

        /* si hago la división el resultado será 2.0 ya que tendrá en cuenta que la variable resultado
         es double pero al percatarse que la operación viene dada por dos enteros
         entonces mostratrá un entero reasignado a double.
         Para evitar esto haremos lo siguiente*/

        e = (double) c/d;
        System.out.println(e + " resultado exacto"); //2.5

        //Casteo automatico
        char n = '1';
        int nI = n;

        /*EL CASTING se hará automatico cuando cumpla cierta condición, en este caso
         porque el tipo char es mas liviano que int*/
        System.out.println(nI);//49 --> SI, no es un error da 49.

        /* En este caso pasa lo inverso al anterior, se intenta pasar
         de un dato grande a uno pequeño por lo que el casteo debe
         hacerse de forma manual*/

        //Casteo Explicito
        short nS = (short) n;
        System.out.println(nS);



    }
}
