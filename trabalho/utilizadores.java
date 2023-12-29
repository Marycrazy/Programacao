public class utilizadores{
    private static String login;
    private String password;
    private String nome;
    private boolean estado;
    private static String email;
    private String tipo;

    public utilizadores(String alogin, String apassword, String anome, boolean aestado, String aemail, String atipo) {
        login = alogin;
        password = apassword;
        nome = anome;
        estado = aestado;
        email = aemail;
        tipo = atipo;
    }

    public String getlogin() {
        return login;
    }

     public void setlogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        utilizadores.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
