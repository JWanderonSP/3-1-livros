public class Pessoa {
    private String nome;
    private int qntLivrosLidos;
    private Livro livro;




    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQntLivrosLidos() {
        return qntLivrosLidos;
    }
    public void setQntLivrosLidos(int qntLivrosLidos) {
        this.qntLivrosLidos = qntLivrosLidos;
    }

    public Pessoa(String nome ){
        setNome(nome);
        
    }
    
}
