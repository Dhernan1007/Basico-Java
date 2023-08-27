public class IfStatement {
    public static void main(String[] args){
        boolean isB = true;
        int fileSended = 3;

        if (isB){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");

        }
        /*
        Si en el if le agrego return; el programa se cortará
        pero si no lo coloco y la condición me permite ingresar al
         "if" se renderizará lo requerido en el if y el programa continuará
         */
        System.out.println("No se entró al if");
    }
}
