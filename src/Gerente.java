public class Gerente extends Funcionario implements Autenticavel{

    private AutenticaSenha autentificador;
    public Gerente() {
        this.autentificador = new AutenticaSenha();
    }

    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }
    public boolean autentica(int senha){
        return this.autentificador.autentica(senha);
    }
    public double getBonificacao(){

        System.out.println("Chamando o método de bonificacao do Gerente");
        return super.getSalario();
    }

}
