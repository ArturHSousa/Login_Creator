import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
            System.out.println("Use apenas letras para criar seu nome de usuário!");
            return;
        }

        try {
            out.print("Digite seu email: ");
            dados.setEmail(sc.nextLine());
            out.println();
            Exception_dados.ExcepitonEmail(dados.getEmail());
        }
        catch (Exception_dados.ExcepitonEmailInvalido e){
            System.out.println("Não se esqueça de usar seu @gmail ou @hotmail ou outro webmail!");
            System.out.println("Não use caracteres especiais!");
            return;
        }

        try {
            out.print("Digite sua senha: ");
            dados.setSenha(sc.nextLine());
            out.println();
            Exception_dados.ExceptionSenha(dados.getSenha());
        }
        catch (Exception_dados.ExceptionSenhaInvalida e){
            System.out.println("Não use espaços em sua senha!");
            return;
        }

        if(ValidarSenha(dados.getSenha()) == false) {
            System.out.println("Senha fraca, sua senha deve conter:");
            System.out.println("8 digitos");
            System.out.println("1 letra maiúscula");
            System.out.println("1 número");
        }
        else {
            out.println("_____ LOGIN CRIADO _____");
            out.println("Nome: " + dados.getNome());
            out.println("Email: " + dados.getEmail());
            out.println("Senha: " + dados.getSenha());
        }
    }

    public static boolean ValidarSenha(String senha)
    {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);
        return m.matches();
    }

}
