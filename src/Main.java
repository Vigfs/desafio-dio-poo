import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
           Curso curso1 = new Curso();
           curso1.setTitulo("Curso Java");
           curso1.setDescricao("Descrição Curso Java");
           curso1.setCargaHoraria(8);

           Curso curso2 = new Curso();
           curso2.setTitulo("Curso JS");
           curso2.setDescricao("Descrição Curso JS");
           curso2.setCargaHoraria(4);

           Mentoria mentoria1 = new Mentoria();
           mentoria1.setTitulo("mentoria de java");
           mentoria1.setDescricao("descrição mentoria de java");
           mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
    }

}
