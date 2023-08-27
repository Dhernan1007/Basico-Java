public class ForLoop {

    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
    turnOnOffLight();

        for (int i = 1; i < 11; i++) {
            printSOS();
        }

    }

    public static void printSOS(){
        //         ^
        //significa "No devolver nada"
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){

        //operador Ternario
        isTurnOnLight = (isTurnOnLight) ? false : true;

        /* OTRA MANERA

        if(isTurnOnLight){
            isTurnOnLight = false;
        }else {
            isTurnOnLight = true;
        }
        */
        return isTurnOnLight;
    }
}
