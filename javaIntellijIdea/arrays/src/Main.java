//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 7;
        numeros[2] = 5;
        numeros[3] = 2;
        numeros[4] = 51;
        numeros[5] = 8;
        numeros[6] = 2;
        numeros[7] = 2;
        numeros[8] = 2;
        numeros[9] = 2;

        for(int x=0;x<=9;x++){
            System.out.println(numeros[x]);
        }

        //length, se utiliza para obtener la longitud de un array
        System.out.println("-----------------------------------");
        int [] numeros2 = {8,3,1,7,4};
        for(int x=0;x<=numeros2.length -1; x++){
            System.out.println(numeros2[x]);
        }

        //clonar arrays
        int [] copiaArray;
        copiaArray = numeros2.clone();
    }
}


