import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Pedir datos con la clase Scanner
        Scanner scanner = new Scanner(System.in);
        int variableInt = scanner.nextInt();
        System.out.println("La variable es:" + variableInt);

        //Pedir
        String nombre = JOptionPane.showInputDialog("Ingresa la cosa");

        JOptionPane.showMessageDialog(null, nombre);
    }
}