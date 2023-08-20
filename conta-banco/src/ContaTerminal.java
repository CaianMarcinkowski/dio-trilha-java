import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Definindo os atributos
        String nome, agencia;
        int numero;
        double saldo;

        //Declarando a classe Scanner para obter valores pelo treminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando e obtendo os valores
        System.out.println("Por Favor, digite o número da Agencia: ");
        agencia = scanner.next();

        System.out.println("Por Favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por Favor, digite seu nome: ");
        nome = scanner.next();

        System.out.println("Por Favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        //Encerrando o scanner por segurança
        scanner.close();

        //Imprimindo a mensagem com os valores obtidos
        System.out.println(
            "Olá, "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
            ", conta "+numero+" e seu saldo R$"+saldo+ " já esta disponivel para saque.");
    }
}
