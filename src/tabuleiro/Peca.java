package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	//contrutor recebe o tabuleiro apenas, a posição inicial da peça é nulo
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	//apenas o pacote tabuleiro e subclasses poderão acessar este tabuleiro desta peça
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


}
