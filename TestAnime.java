
class TestAnime {
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

}
