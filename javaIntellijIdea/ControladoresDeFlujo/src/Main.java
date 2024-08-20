//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //A diferencia de otros lenguajes, en los ifs, es necesario los parentesis
        if(5<15){
            System.out.println("El primer numero es menor");
        }
        else if (5 > 15){
            System.out.println("El segundo nummero es menor");
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }

        //Se puede obtener una version simplificada con el operador ternario
        String resultado = (5<15) ? "El primer numero es menor": "El segundo numero es menor";

        int numero = 15;

        //Switch
        switch (numero)
        {
            case 1:
                System.out.println("El numero es el uno");
                break;
            case 5:
                System.out.println("El numero es el 5");
                break;
            default:
                System.out.println("Error");
        }
    }
}