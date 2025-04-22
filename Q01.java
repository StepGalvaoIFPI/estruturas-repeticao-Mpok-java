import java.util.Scanner;
public class Q01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Velocidade km:");
        int velocidade = Integer.valueOf(entrada.nextLine());

        if (velocidade > 80){
            System.out.println("Vermelho");
        }else{
            System.out.println("Verde");
        }
    }
}
