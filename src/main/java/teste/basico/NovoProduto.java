package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO(Produto.class);
		
		Produto produto = new Produto("Mentoria 2 meses", 2000.00);
		
		dao.incluirAtomico(produto).fechar();

	}

}
