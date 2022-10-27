public class Conta {

    private String numeroDaConta;

    private int tipo;

    private String nome;

    private double saldo;

    private boolean status;

    public Conta(String numeroDaConta, int tipo, String nome) {

        this.numeroDaConta = numeroDaConta;

        this.tipo = tipo;
        this.nome = nome;
        this.status = false;
        this.saldo = 0;

    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        if(this.isStatus() == false) {
            this.setStatus(true);
            if(this.getTipo() == 1) {
                this.setSaldo(50);
                System.out.println("Conta corrente criada com Sucesso!");
            } else {
                this.setSaldo(150);
                System.out.println("Conta poupança criada com Sucesso");
            }
        } else {
            System.out.println("A conta já está ativa!");
        }
    }

    public void fecharConta() {
        if(this.isStatus() == true && this.getSaldo() == 0) {
            this.setStatus(false);
        } else {
            System.out.println("A conta já está inativa ou a conta ainda possui saldo!");
        }
    }
    public void depositar(double valor) {
        if(this.isStatus() == true) {
            if(valor < 0) {
                System.out.println("O valor do depósito deve ser positivo!");
            } else {
                this.setSaldo( this.getSaldo() + valor);
                System.out.println("Depósito de " + valor + " reais feito com sucesso!");
            }
        } else {
            System.out.println("Conta inativa!");
        }
    }

    public void sacar(double valor) {

        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque no valor de " + valor + " reais feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    public void pagarFatura() {
        if(this.isStatus() == false) {
            System.out.println("Conta Inativa!");
        } else{
            if(this.getTipo() == 1) {
                this.setSaldo(this.getSaldo() - 12);
            } else {
                this.setSaldo(this.getSaldo() - 20);
            }

        }
    }

};



