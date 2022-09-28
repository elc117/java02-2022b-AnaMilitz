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
    } public static void main(String[] args) {
		System.out.println("Hello World");
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
            System.out.println("O anime não está sendo produzido nos dias atuais!");
    }
   
}
public static void main(String[] args) {
	Anime OnePiece = new Anime();
	Anime SwordArtOnline = new Anime();
	
	SwordArtOnline.setNome("Sword Art Online");
	OnePiece.setNome("One Piece");
	System.out.println("Nome do anime 1: "+OnePiece.getNome());
	System.out.println("Nome do anime 2: "+SwordArtOnline.getNome());
	
	SwordArtOnline.setAno(2300);
	OnePiece.setAno(2016);
	System.out.println("Ano do anime 1: "+OnePiece.getAno());
	System.out.println("Ano do anime 2: "+SwordArtOnline.getAno());
	
	SwordArtOnline.setDiasAtuais(true);
	OnePiece.setDiasAtuais(true);
	OnePiece.estaAtivoHoje());
	SwordArtOnline.estaAtivoHoje();
}

