
class TestAnime {
public static void main(String[] args) {
	
	//One Piece
	Anime OnePiece = new Anime();
	OnePiece.setNome("One Piece");
	OnePiece.setAno(2016);
	OnePiece.setDiasAtuais(true);

	System.out.println("Nome do anime 1: "+OnePiece.getNome());
	System.out.println("Ano do anime 1: "+OnePiece.getAno());
	OnePiece.estaAtivoHoje();

	//Sword Art Online
	Anime SwordArtOnline = new Anime();
	SwordArtOnline.setNome("Sword Art Online");
	SwordArtOnline.setAno(2012);
	SwordArtOnline.setDiasAtuais(false);

	System.out.println("Nome do anime 2: "+SwordArtOnline.getNome());
	System.out.println("Ano do anime 2: "+SwordArtOnline.getAno());
	SwordArtOnline.estaAtivoHoje(); 
	System.out.println("Obs: Sword Art Online está sendo produzido nos dias atuais. O resultado contrário é apenas para teste do uso de false.");
	
        }

}
