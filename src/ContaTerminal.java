import java.util.Scanner;

public class ContaTerminal {

   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double saldo, numero;
        String NomeCliente , agencia;
        System.out.println("informe  o seu nome :");
        NomeCliente = input.nextLine();
        System.out.println("informe a sua agência :");
        agencia = input.nextLine();
        System.out.println(" informe sua conta :");
        numero =input.nextDouble();
        System.out.println("informe o seu saldo :");
        saldo =input.nextDouble(); 
        System.out.println(" Olá " + NomeCliente);
        System.out.println("Obrigado por criar uam conta em nosso banco, sua agéncia : " + agencia);
        System.out.println(" conta : " + numero);
        System.out.println(" e seu saldo : " + saldo);
        System.out.println(" já estar disponivel para saque");
        

    }
}
