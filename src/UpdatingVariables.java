             //upper camel case
public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bono $200

        salary = salary + 200;
        System.out.println(salary);

        // 2 horas extras $30 c/u
        //Comida : $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto

        String nombre = "Moisés Hernández";
        nombre = nombre + " Castillo";
        System.out.println(nombre);

        nombre = "Darwin " + nombre;
        System.out.println(nombre);
    }
}
