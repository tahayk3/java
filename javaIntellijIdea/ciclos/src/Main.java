//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ciclo while
        int x = 0;
        while(x<=10){
            System.out.println("vuelta: " + x);
            x++;
        }

        //do while
        int y =0;
        do{
            System.out.println("vuelta: " + y);
            y++;
        }while(y!=5);

        //for
        for(int q=0; q<=10;q++){
            System.out.println("vuelta: "+ q);
        }

        //foreach
        String[] values = {"a", "b", "c"};
        for(String str: values){
            System.out.println("vuelta: "+ str);
        }

    }
}