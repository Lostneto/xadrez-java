package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	//contrutor recebe o tabuleiro apenas, a posi��o inicial da pe�a � nulo
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	//apenas o pacote tabuleiro e subclasses poder�o acessar este tabuleiro desta pe�a
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


}
