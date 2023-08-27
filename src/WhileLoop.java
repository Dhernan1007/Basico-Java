public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main (String[] args){

        turnOnOffLight();

        int i = 1;
       while(isTurnOnLight && i <= 10){
            printSOS();
            i++;
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
