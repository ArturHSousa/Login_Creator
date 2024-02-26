public class Exception_dados{

    private String nome;
    private String email;
    private String senha;

    public static class ExcepitonNomeInvalido extends Exception {
        public ExcepitonNomeInvalido(String mensagem) {
            super(mensagem);
        }
    }

    public static void ExcepitonNome(String nome) throws ExcepitonNomeInvalido{
        if (!nome.matches("[a-zA-Z_ ]+")){
            //"matches" é usado para verificar padrões, ou seja "!nome.matches("[a-zA-Z]+")" que dizer que na variavel nome, tudo que for diferente do alfabeto de "A" a "Z" e de "_" e de "espaco" entra no if caindo no ExcepitonNomeInvalido
            throw new ExcepitonNomeInvalido(" "); //deixei a mensagem em branco para escrever na classe Program
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
