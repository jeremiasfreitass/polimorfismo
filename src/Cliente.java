public class Cliente implements Autenticavel{

    private AutenticaSenha autentificador;
    public Cliente() {
        this.autentificador = new AutenticaSenha();
    }

    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }
    public boolean autentica(int senha){
        return this.autentificador.autentica(senha);
    }

}
