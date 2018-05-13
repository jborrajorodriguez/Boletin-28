package boletin28;

import javax.swing.JOptionPane;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Alumno {

    private String nome;
    private int nota;
    private Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, int nota,String rua,int numero) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = new Enderezo(rua,numero);
    }

    

   

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }

    public void cambiarNota() {
        int nuevaNota = Integer.parseInt(JOptionPane.showInputDialog("Nueva nota"));
        nota=nuevaNota;
    }

    public String amosar() {
        return this.toString()+enderezo.toString();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    private class Enderezo {

        private String rua;
        private int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }

    }

}
