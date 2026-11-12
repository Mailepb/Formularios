package Libreria;
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrincipal principal = new FrmPrincipal();
                principal.setLocationRelativeTo(null); // Centra la ventana
                principal.setVisible(true);
            }
        });
    }
}
