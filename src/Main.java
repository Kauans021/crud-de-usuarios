import java.util.Date;
public class Main {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.cadastrarUsuario(new Usuario("Kauan","Soares",new Date(),90028922,'M',"R louca","user","ABCD","email"));

        uc.cadastrarUsuario(new Usuario("Cau","Soares",new Date(),90028922,'M',"R louca","user","ABCD","email"));
    }
}
