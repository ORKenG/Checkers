//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.swing.JFrame;

public class CheckerBoard extends JFrame {
    private static final long serialVersionUID = 1L;
    CheckerPanel pan;

    public CheckerBoard() {
        this.setSize(866, 720);
        this.pan = new CheckerPanel();
        this.add(this.pan);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckerBoard();
    }
}
