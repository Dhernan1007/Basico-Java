public class Funciones {
    public static void main(String[] args) {

        int y = 3;

        System.out.println(4*Math.PI*Math.pow(y,2));
        System.out.println((4/3)*Math.PI*Math.pow(y,3));
        System.out.println( Math.PI*Math.pow(y,2));

        double area = circleArea(y);
        System.out.println("Esta es el área: " + area);

        double aEsfera = esferaArea(y);
        double vEsfera = volEsfera(y);
        System.out.println("Esta es el área de una esfera: " + aEsfera);
        System.out.println("Este es el volumen de una esfera: " + vEsfera);



        System.out.println("El resultado de la conversión es: " + converToDolar(1012, "Bs") + '$');
        System.out.println("El resultado de la conversión es: " + converToDolar(1012, "PEN") + '$');
    }

    /* NOTA: las funciones deben vivir al nivel de las clases
    es por ello que salgo del scope del método main
    */

    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }

    //ESFERA
    public static double esferaArea(double r){
       return 4*Math.PI*Math.pow(r,2);
    }

    /**
     * Descripción: Función que permite determinar el volumen de una esfera
     * @param r es una variable de tipo double que representa el radio de la esfera
     * @return Devuelve el valor del volumen de la esfera
     * */
    public static double volEsfera(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripción: Función que convierte Bs o PEN a Dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta Bs o PEN
     * @return quantity Devuelve la cantidad actualizada en Dolares
     *
     * */
    public static double converToDolar(double quantity, String currency){
        //Bs PEN
        switch (currency){
            case "Bs":
                quantity = quantity * 0.03;
            break;
            case "PEN":
                quantity = quantity * 0.27;
            break;
        }
        return quantity;
    }

}
