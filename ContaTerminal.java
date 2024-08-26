import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.err.println("Por favor digite o número da Numero");
    String Numero = scanner.nextLine();

    System.err.println("Por favor digite o número da agencia");
    String agencia = scanner.nextLine();

    System.err.println("Por favor digite o número da nome Cliente");
    String nomeCliente = scanner.nextLine();

    System.err.println("Por favor digite o número da saldo");
    float saldo = scanner.nextFloat();

    String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, sua conta é %s e seu saldo é %.2f já está disponível para saque.",
        nomeCliente, agencia, Numero, saldo
    );

    System.out.println(mensagem);
    
      scanner.close();
