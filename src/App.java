public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Pessoa pes=new Pessoa("Izabel");
        Livro Lr=new Livro("As aventuras de Tintin", 100, pes);
        System.out.println("Izabel qual livro você leu?");
        System.out.println("Eu li "+Lr.getNome());
        System.out.println("Ele tem "+Lr.getNumeroPaginas() + " páginas.");
        System.out.println("Portanto,");
        System.out.println(pes.getNome() +" leu " +Lr.getNumeroPaginas() + " páginas do livro cujo o título é "+ Lr.getNome() + ".");
        
    }
}
