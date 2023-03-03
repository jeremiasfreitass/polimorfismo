public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Sr. Freitas");
        g.setSalario(5000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setNome("Sr. Branco");
        editorVideo.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setNome("Sr. Montecchiari");
        designer.setSalario(2000.0);



        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());


    }
}
