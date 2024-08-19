//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creacipor por asignacion, se crea en el string pool
        String s1 = "la";
        //creacion por constructor, se crea en el string pool y heap
        String s2 = new String("academia");
        String s3 = "the";

        // compara las referencias de los objetos,  verifica si ambas variables apuntan al mismo objeto en la memoria
        System.out.println(s1 == s2);
        //equals verifica si el contenido de las cadenas es el mismo
        System.out.println(s2.equals(s3));
        System.out.println(s2 == s3);
        System.out.println(s2.intern() == s3);

    }
}