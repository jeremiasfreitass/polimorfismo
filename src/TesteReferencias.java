public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Sr. Freitas");
        g.setSalario(5000.0);

        Funcionario f = new Funcionario();
        g.setNome("Sr. Macedo");
        f.setSalario(2000.0);

        EditorVideo editorVideo = new EditorVideo();
        g.setNome("Sr. Branco");
        f.setSalario(2500.0);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g);
        controle.registra(f);
        controle.registra(editorVideo);

        System.out.println(controle.getSoma());


    }
}
