import java.util.Scanner;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        Exception_dados dados = new Exception_dados();

        out.println("_____ CRIAÇÃO DE LOGIN _____");
        out.println();

        out.print("Digite seu nome de usuário: ");
        dados.setNome(sc.nextLine());
        out.println();
        try{
            Exception_dados.ExcepitonNome(dados.getNome());
        }
        catch (Exception_dados.ExcepitonNomeInvalido e){
            System.out.println("Use apenas letras para criar seu nome de usuário");
            return;
        }

        out.print("Digite seu email: ");
        dados.setEmail(sc.nextLine());
        out.println();

        out.print("Digite sua senha: ");
        dados.setSenha(sc.nextLine());
        out.println();

        out.println("_____ LOGIN CRIADO _____");
        out.println("Nome: "+ dados.getNome());
        out.println("Email: "+ dados.getEmail());
        out.println("Senha: "+ dados.getSenha());


    }

}
