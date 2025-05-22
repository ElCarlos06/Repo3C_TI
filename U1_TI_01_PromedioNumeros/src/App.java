import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int sum, res;

        String num1 = JOptionPane.showInputDialog("Ingresa numero 1: ");
        String num2 = JOptionPane.showInputDialog("Ingresa numero 2: ");
        String num3 = JOptionPane.showInputDialog("Ingresa numero 3: ");
        
        sum = Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3);
        res = sum/3;

        System.out.println(sum);
        System.out.println(res);

    }
    
}
