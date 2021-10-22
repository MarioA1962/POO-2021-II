package PracticaCalificada1.Pregunta2;

public class Libro {

    private String titulo;
    private String autor;
    private int ISNB;
    private int N_paginas;
    private int edicion;
    private String editorial;
    private String fecha;


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

    public int getISNB() {
        return ISNB;
    }

    public void setISNB(int ISNB) {
        this.ISNB = ISNB;
    }

    public int getN_paginas() {
        return N_paginas;
    }

    public void setN_paginas(int n_paginas) {
        N_paginas = n_paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Libro(){
    }

    public Libro(String titulo, String autor, int ISNB, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISNB = ISNB;
        this.edicion = edicion;
    }

    public boolean validaIsbn(){
        int contador = 0;
        int num;
        num = getISNB();
        for(int i = 0; i<String.valueOf(num).length(); i++){
            contador = contador + (i+1)*Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        }
        if(String.valueOf(num).length() != 10){
            System.out.println("Numero invalido");
        }else{
            if(contador%11==0){
                System.out.println("Numero valido");
            }else{
                System.out.println("Numero invalido");
            }
        }
        return false;
    }
    public void ImprimirLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Edicion: " + edicion);
        System.out.println("Editorial: " + editorial);
        System.out.println("ISBN: " + ISNB);
    }
    public void ImprimirDetalleLibro(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Edicion: " + getEdicion());
        System.out.println("Editorial: " + getEditorial());
        System.out.println("ISBN: " + getISNB());
        System.out.println("Numero de paginas : " + getN_paginas());
        System.out.println("Fecha : " + getFecha());
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISNB=" + ISNB +
                ", N_paginas=" + N_paginas +
                ", edicion=" + edicion +
                ", editorial='" + editorial + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
