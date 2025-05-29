import javax.swing.JOptionPane;
import Model.SecureUser;
public class App {
    public static void main(String[] args) throws Exception {

        SecureUser secureUser = new SecureUser();

        String nombreUsuario = JOptionPane.showInputDialog("Ingresa nombre de usuario: ");
        secureUser.setNombreUsuario(nombreUsuario);
        String password = JOptionPane.showInputDialog("Ingrersa una contraseña: ");
        secureUser.setPassword(password);


        if (secureUser.getNombreUsuario() !=null && !nombreUsuario.isEmpty() ) {
           
            String intenPassword = JOptionPane.showInputDialog("Ingresa la contraseña");
            secureUser.autenticar(intenPassword);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no valido");
        
        
        }
    }

    
}
