public class Teste {
    public static void main(String[] args) {
        Conta conta1 = new Conta("9230197841235" , 1, "Pessoa1");
        Conta conta2 = new Conta("8931263192123", 2 , "Pessoa2");

        conta1.abrirConta();
        System.out.println("Saldo da conta " + conta1.getNumeroDaConta() + " = " + conta1.getSaldo());
        conta2.abrirConta();
        System.out.println("Saldo da conta " + conta2.getNumeroDaConta() + " = " + conta2.getSaldo());
        conta1.depositar(100);
        System.out.println("Saldo da conta " + conta1.getNumeroDaConta() + " = " + conta1.getSaldo());
        conta2.depositar(200);
        System.out.println("Saldo da conta " + conta2.getNumeroDaConta() + " = " + conta2.getSaldo());
        conta1.sacar(100);
        System.out.println("Saldo da conta " + conta1.getNumeroDaConta() + " = " + conta1.getSaldo());
        conta2.sacar(200);
        System.out.println("Saldo da conta " + conta2.getNumeroDaConta() + " = " + conta2.getSaldo());
        conta1.pagarFatura();
        System.out.println("Saldo da conta " + conta1.getNumeroDaConta() + " = " + conta1.getSaldo());
        conta2.pagarFatura();
        System.out.println("Saldo da conta " + conta2.getNumeroDaConta() + " = " + conta2.getSaldo());
        conta1.fecharConta();
        conta2.fecharConta();
    }
}
