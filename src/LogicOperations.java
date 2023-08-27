import java.sql.SQLOutput;

public class LogicOperations {
    public static void main(String[] args){
        int a = 8;
        int b = 5;

        System.out.println("a es igual a b? --> " + (a==b));//false
        System.out.println("a es diferente de b? --> " + (a!=b));//true

        //Operadores Relacionales
        System.out.println("a es mayor a b? --> " + (a > b));//true
        System.out.println("a es menor a b? --> " + (a < b));//false
    }
}
