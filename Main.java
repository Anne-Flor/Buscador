public class Main {

    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("1");
        System.out.println(novoEndereco);
    }
}