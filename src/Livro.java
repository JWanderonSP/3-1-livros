public class Livro {
    private String nome;
    private int numeroPaginas;
    private Pessoa pessoa;
    
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public Livro(String nome,int numeroPaginas,Pessoa pessoa){
        this.nome=nome;
        this.numeroPaginas=numeroPaginas;
        pessoa.setLivro(this);
    }
}
