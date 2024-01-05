import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtd = sc.nextInt();
        sc.close();
        
        double cachorro_quente = 4.00;
        double x_salada = 4.50;
        double x_bacon = 5.00;
        double torrada_simple = 2.00;
        double refrigerente = 1.50;
        double valor = 0;

        if (codigo == 1){
            valor = cachorro_quente * qtd;
        }else if (codigo == 2){
            valor = x_salada * qtd;
        }else if (codigo == 3){
            valor = x_bacon * qtd;
        }else if (codigo == 4){
            valor = torrada_simple * qtd;
        } else if (codigo == 5){
            valor = refrigerente * qtd;
        }else {
            System.out.println("Erro!");
        }

        System.out.printf("Total: R$ %.2f\n", valor);


    }
}
