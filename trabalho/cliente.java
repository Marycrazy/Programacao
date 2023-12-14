class cliente extends utilizadores{
    private String morada;
    private static int nif;
    private static int telefone;
    
    public cliente(String alogin, String apassword, String anome, boolean aestado, String aemail, String atipo, String amorada, int anif, int atelefone) {
        super(alogin, apassword, anome, aestado, aemail, atipo);
        morada = amorada;
        nif = anif;
        telefone = atelefone;
    }
}
