public class utilizadores {
    private String login;
    private String password;
    private String nome;
    private boolean estado;
    private String email;
    private String tipo;

    public utilizadores(String alogin, String apassword, String anome, boolean aestado, String aemail, String atipo) {
        login = alogin;
        password = apassword;
        nome = anome;
        estado = aestado;
        email = aemail;
        tipo = atipo;
    }
    
}
