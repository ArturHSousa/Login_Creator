import java.util.regex.*;

public class Exception_dados {

    private String nome;
    private String email;
    private String senha;


    //Nome
    public static class ExcepitonNomeInvalido extends Exception {
        public ExcepitonNomeInvalido() {
        }
    }
    public static void ExcepitonNome(String nome) throws ExcepitonNomeInvalido {
        if (!nome.matches("[a-zA-Z_ ]+")) {
            //"matches" é usado para verificar padrões, ou seja "!nome.matches("[a-zA-Z]+")" que dizer que na variavel nome, tudo que for diferente do alfabeto de "A" a "Z" e de "_" e de "espaço" entra no if caindo no ExcepitonNomeInvalido
            throw new ExcepitonNomeInvalido();
        }
    }


    //Email
    public static class ExcepitonEmailInvalido extends Exception {
        public ExcepitonEmailInvalido() {
        }
    }
    public static void ExcepitonEmail(String email) throws ExcepitonEmailInvalido {
        if (!email.matches("[a-zA-Z0-9_@.]+")) {
            throw new ExcepitonEmailInvalido();
        }
        if (!email.contains("@")) {
            //"contains" serve para dizer que deve ou não ter um determinado caractere
            //diferente do "equals" que obriga a ter exatamente aquela palavra ou frase
            throw new ExcepitonEmailInvalido();
        }
    }


    //Senha
    public static class ExceptionSenhaInvalida extends Exception {
        public ExceptionSenhaInvalida() {
        }
    }
    public static void ExceptionSenha(String senha) throws ExceptionSenhaInvalida {
        if (!senha.matches("[a-zA-Z0-9_!@#$.-]+")) {
            throw new ExceptionSenhaInvalida();
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
