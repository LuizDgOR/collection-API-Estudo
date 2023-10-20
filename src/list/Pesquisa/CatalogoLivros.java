package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    private List <Livro> livroList;

    public CatalogoLivros() {
       this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }


    //cria-se uma lista dentro do método para adicionar autores com o mesmo nome

    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }

            }
        }
        return  livrosPorAutor;
    }

    public List<Livro>pesquisaPorIntervaloAnos(int anoInicial, int anofinal){
        List <Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao()>= anofinal && l.getAnoPublicacao()<= anofinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pequisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    //test dos métodos
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2003);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2004);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2000,2003));
        System.out.println((catalogoLivros.pequisaPorTitulo("Livro 1")));
    }
}
