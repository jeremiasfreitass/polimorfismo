public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario jeremias = new Gerente();
        jeremias.setNome("Jeremias Freitas");
        jeremias.setCpf("18736818798");
        jeremias.setSalario(2500);

        System.out.println(jeremias.getNome());
        System.out.println(jeremias.getBonificacao());

    }
}
