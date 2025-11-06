
public class CriarContato {

    public static void main(String[] args) {

    Contato contato1 = new Contato(
     "Heitor",
     "vax@gmail.com",
     "(11) 91234-4321"
    );

    Contato contato2 = new Contato(
         "Kingvax",
         "vax2@gmail.com",
         "(69) 94453-09321"
    );

    Contato contato3 = new Contato(
         "Heitor1000",
         "heitor1000@gmail.com",
         "(17) 67432-05963");

    Contato contato4 = new Contato(
         "ManoBrown",
         "manoguy@gmail.com",
         "(17) 65634-21242");
         //contato1.imprimeInformacoes();
         agenda agenda = new agenda();
         agenda.armazenarContato(contato1);
         agenda.armazenarContato(contato2);
         agenda.armazenarContato(contato3);
         agenda.armazenarContato(contato4);

         agenda.imprimirContatos();
         agenda.removerContato(contato3);
}
}
