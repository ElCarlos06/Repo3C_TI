package Model;

import javax.swing.JOptionPane;

public class SecureUser {
    private String nombreUsuario;
    private String password;


    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password){
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;

        
        if(password.length()>=8 && password != null && !password.isEmpty()){
            for(char c : password.toCharArray()){
                if (c >= 65 && c <=90) {
                    mayuscula = true;
                }
                if (c >= 97 && c<=122){
                    minuscula= true;
                }
                if (c >= 48 && c <=57){
                    digito = true;
                }
            }
            if(mayuscula != true){
                JOptionPane.showMessageDialog(null, "Debe contener una mayuscula");
            }
            if(minuscula != true){
                JOptionPane.showMessageDialog(null, "Debe contener una minuscula");
            }
            if(digito != true){
                JOptionPane.showMessageDialog(null, "Debe contener un digito");
            }
            

        }
        
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public boolean autenticar(String intentPassword){
            if(intentPassword == password){
                JOptionPane.showMessageDialog(null, "Acceso concedido.");
                return true;
            }else {
                JOptionPane.showMessageDialog(null,"Accedo denegado");
                return false;
            }
        }
}
