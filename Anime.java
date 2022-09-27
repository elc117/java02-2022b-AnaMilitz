class Anime{

    private string nome;
    private boolean diasAtuais;
    private int ano;

    Anime(){
        nome = "";
        diasAtuais = false;
        ano = 0;
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

    public void setDiasAtuais( boolean _diasAtuais ){
        this.diasAtuais = diasAtuais;
    }
    
    public void setAno( int ano ){
        this.ano = ano;
    }

    public void estaAtivoHoje(){
        if( diasAtuais )
        //println("O anime está sendo produzido nos dias atuais!\n");
        else
        //println("não está!");
    }
}