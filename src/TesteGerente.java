public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Rayssa Montecchiari");
        g1.setCpf("18736818798");
        g1.setSalario(5000.0);
        g1.setSenha(101010);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());

        boolean autenticou = g1.autentica(101010);

        System.out.println(autenticou);

    }
}
