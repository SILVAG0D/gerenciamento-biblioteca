public class Livro {
    private Integer codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private Boolean status;

    public Livro(Integer codigo, String titulo, String autor, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.status = true;
    }

    public Livro() {
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return  String.format("Livro titulo %s, autor %s, categoria %s, codigo %d, status %b",
                this.titulo, this.autor, this.categoria, this.codigo, this.status);
    }
}
