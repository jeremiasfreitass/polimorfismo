public class SistemaInterno{

    private int senha = 152535;

    public void autentica(Autenticavel autenticado){
        boolean autenticou = autenticado.autentica(this.senha);
        if(autenticou){
            System.out.println("Acesso autorizado");
        }else {
            System.out.println("Acesso bloqueado");
        }
    }
}
