import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Age "+age);
        int phone_number=Integer.parseInt(JOptionPane.showInputDialog("Enter your Phone number "));
        JOptionPane.showMessageDialog(null,"Your phone number is "+phone_number);
    }
}
