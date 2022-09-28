class Anime{

    private string nome;
    private boolean diasAtuais;
    private int ano;

    public Anime(){
        nome = "";
        diasAtuais = false;
        ano = 0;
    }

    public Anime( string nome, boolean diasAtuais, int ano ){
        this.nome = nome;
        this.diasAtuais = diasAtuais;
        this.ano = ano;
    }
    
    public string getNome(){
        return nome;
    }

    public boolean getDiasAtuais(){
        return diasAtuais;
    }
    
    public int getAno(){
        return ano;
    }

    public void setNome( string nome ){
        this.nome = nome;
    }

    public void setDiasAtuais( boolean diasAtuais ){
        this.diasAtuais = diasAtuais;
    }
    
    public void setAno( int ano ){
        this.ano = ano;
    }

    public void estaAtivoHoje(){
        if( diasAtuais )
            System.out.println("O anime está sendo produzido nos dias atuais!\n");
        else
            system.out.println("O anime não está sendo produzido nos dias atuais!\n");
    }
}
