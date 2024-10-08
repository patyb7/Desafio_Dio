
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digita o número da conta: ");
        int conta = scanner.nextInt();

        //System.out.println("Digite o valor depositado: ");
        float saldo = 237.48F;

        System.out.println("Olá" + nome + ", obrigada por criar a conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo é: "+ saldo + " já está disponível para saque" );


    }

}