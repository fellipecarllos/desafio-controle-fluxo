import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Informe o segundo número: ");
        int paramentroDois = terminal.nextInt();

     try {
        contar(parametroUm,paramentroDois);
        } catch (ParametrosInvalidosException e) {
        System.out.println("Segundo parâmetro deve ser maior que o primeiro.");
        }

        terminal.close();

    }

    static void contar(int parametroUm, int paramentroDois ) throws ParametrosInvalidosException{

        if(paramentroDois <= parametroUm)
            throw new ParametrosInvalidosException();

        int contagem  = paramentroDois - parametroUm; 
         for(int x = 1; x <= contagem;x++){
            System.out.println("Imprimindo o número " + x);
        }

    }

}
