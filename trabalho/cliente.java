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

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public static int getNif() {
        return nif;
    }

    public static void setNif(int nif) {
        cliente.nif = nif;
    }

    public static int getTelefone() {
        return telefone;
    }

    public static void setTelefone(int telefone) {
        cliente.telefone = telefone;
    }
}
