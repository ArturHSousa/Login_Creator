import java.util.Scanner;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        Exception_dados dados = new Exception_dados();

        out.println("_____ CRIAÇÃO DE LOGIN _____");
        out.println();

        try{
            out.print("Digite seu nome de usuário: ");
            dados.setNome(sc.nextLine());
            out.println();
            Exception_dados.ExcepitonNome(dados.getNome());
        }
        catch (Exception_dados.ExcepitonNomeInvalido e){
            System.out.println("Use apenas letras para criar seu nome de usuário");
            return;
        }

        try {
            out.print("Digite seu email: ");
            dados.setEmail(sc.nextLine());
            out.println();
            Exception_dados.ExcepitonEmail(dados.getEmail());
        }
        catch (Exception_dados.ExcepitonEmailInvalido e){
            System.out.println("Não se esqueça de usar seu @gmail ou @hotmail ou outro webmail ");
            System.out.println("Não use caracteres especiais");
            return;
        }

        out.print("Digite sua senha: ");
        dados.setSenha(sc.nextLine());
        out.println();

        out.println("_____ LOGIN CRIADO _____");
        out.println("Nome: "+ dados.getNome());
        out.println("Email: "+ dados.getEmail());
        out.println("Senha: "+ dados.getSenha());


    }

}
