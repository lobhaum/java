public class TestaGetSet { 
    public static void main(String[] args) { 
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente(); 
        //paulo.nome = "paulo silveira";
        cliente.setNome("Paulo Silveira");
        cliente.setCpf("222.222.222-22");
        cliente.setProfissao("Analista de Sistemas");
        
        conta.setTitular(cliente);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
        
        System.out.println(conta.getTitular().getProfissao());
    }
}