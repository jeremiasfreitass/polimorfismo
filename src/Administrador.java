public class Administrador extends Funcionario implements Autenticavel{
    private AutenticaSenha autentificador;
    public Administrador() {
        this.autentificador = new AutenticaSenha();
    }

    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }
    public boolean autentica(int senha){
        return this.autentificador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

}
