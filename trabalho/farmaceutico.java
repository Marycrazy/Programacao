class farmaceutico extends utilizadores{
    private String morada;
    private static int nif;
    private static int telefone;
    
    public farmaceutico(String alogin, String apassword, String anome, boolean aestado, String aemail, String atipo, String amorada, int anif, int atelefone) {
        super(alogin, apassword, anome, aestado, aemail, atipo);
        morada = amorada;
        nif = anif;
        telefone = atelefone;
    }
}
