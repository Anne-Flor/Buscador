import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta");
        var cep = leitura.nextLine();
        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradoDeArquivo gerador = new GeradoDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}