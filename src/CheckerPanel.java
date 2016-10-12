//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class CheckerPanel extends JPanel implements MouseMotionListener, MouseListener {
    private static final long serialVersionUID = 1L;
    public Checker checker = new Checker();
    public Colision col = new Colision();
    boolean highlight11 = false;
    boolean highlight12 = false;
    boolean highlight13 = false;
    boolean highlight14 = false;
    boolean highlight21 = false;
    boolean highlight22 = false;
    boolean highlight23 = false;
    boolean highlight24 = false;
    boolean highlight31 = false;
    boolean highlight32 = false;
    boolean highlight33 = false;
    boolean highlight34 = false;
    boolean highlight41 = false;
    boolean highlight42 = false;
    boolean highlight43 = false;
    boolean highlight44 = false;
    boolean highlight51 = false;
    boolean highlight52 = false;
    boolean highlight53 = false;
    boolean highlight54 = false;
    boolean highlight61 = false;
    boolean highlight62 = false;
    boolean highlight63 = false;
    boolean highlight64 = false;
    boolean highlight71 = false;
    boolean highlight72 = false;
    boolean highlight73 = false;
    boolean highlight74 = false;
    boolean highlight81 = false;
    boolean highlight82 = false;
    boolean highlight83 = false;
    boolean highlight84 = false;
    boolean square11 = false;
    boolean square12 = false;
    boolean square13 = false;
    boolean square14 = false;
    boolean square21 = false;
    boolean square22 = false;
    boolean square23 = false;
    boolean square24 = false;
    boolean square31 = false;
    boolean square32 = false;
    boolean square33 = false;
    boolean square34 = false;
    boolean square61 = false;
    boolean square62 = false;
    boolean square63 = false;
    boolean square64 = false;
    boolean square71 = false;
    boolean square72 = false;
    boolean square73 = false;
    boolean square74 = false;
    boolean square81 = false;
    boolean square82 = false;
    boolean square83 = false;
    boolean square84 = false;
    public int X11 = 87;
    public boolean moved11 = false;
    public int Y11 = 33;
    public int X12 = 246;
    public int Y12 = 33;
    public int X13 = 407;
    public int Y13 = 33;
    public int X14 = 566;
    public int Y14 = 33;
    public int X21 = 6;
    public int Y21 = 110;
    public int X22 = 166;
    public int Y22 = 110;
    public int X23 = 327;
    public int Y23 = 110;
    public int X24 = 487;
    public int Y24 = 110;
    public int X31 = 88;
    public int Y31 = 190;
    public int X32 = 246;
    public int Y32 = 190;
    public int X33 = 407;
    public int Y33 = 190;
    public int X34 = 566;
    public int Y34 = 190;
    public int X41 = 6;
    public int Y41 = 270;
    public int X42 = 166;
    public int Y42 = 270;
    public int X43 = 327;
    public int Y43 = 270;
    public int X44 = 487;
    public int Y44 = 270;
    public int X51 = 6;
    public int Y51 = 350;
    public int X52 = 166;
    public int Y52 = 350;
    public int X53 = 327;
    public int Y53 = 350;
    public int X54 = 487;
    public int Y54 = 350;
    public int X61 = 6;
    public int Y61 = 430;
    public int X62 = 166;
    public int Y62 = 430;
    public int X63 = 327;
    public int Y63 = 430;
    public int X64 = 487;
    public int Y64 = 430;
    public int X71 = 88;
    public int Y71 = 510;
    public int X72 = 246;
    public int Y72 = 510;
    public int X73 = 407;
    public int Y73 = 510;
    public int X74 = 566;
    public int Y74 = 510;
    public int X81 = 6;
    public int Y81 = 590;
    public int X82 = 166;
    public int Y82 = 590;
    public int X83 = 327;
    public int Y83 = 590;
    public int X84 = 487;
    public int Y84 = 590;

    public CheckerPanel() {
        this.checker.white11X = this.X11;
        this.checker.white11Y = this.Y11;
        this.col.ball11X = this.X11;
        this.col.ball11Y = this.Y11;
        this.checker.white12X = this.X12;
        this.checker.white12Y = this.Y12;
        this.col.ball13X = this.X12;
        this.col.ball13Y = this.Y12;
        this.checker.white13X = this.X13;
        this.checker.white13Y = this.Y13;
        this.col.ball15X = this.X13;
        this.col.ball15Y = this.Y13;
        this.checker.white14X = this.X14;
        this.checker.white14Y = this.Y14;
        this.col.ball17X = this.X14;
        this.col.ball17Y = this.Y14;
        this.checker.white21X = this.X21;
        this.checker.white21Y = this.Y21;
        this.col.ball22X = this.X21;
        this.col.ball22Y = this.Y21;
        this.checker.white22X = this.X22;
        this.checker.white22Y = this.Y22;
        this.col.ball24X = this.X22;
        this.col.ball24Y = this.Y22;
        this.checker.white23X = this.X23;
        this.checker.white23Y = this.Y23;
        this.col.ball26X = this.X23;
        this.col.ball26Y = this.Y23;
        this.checker.white24X = this.X24;
        this.checker.white24Y = this.Y24;
        this.col.ball28X = this.X24;
        this.col.ball28Y = this.Y24;
        this.checker.white31X = this.X31;
        this.checker.white31Y = this.Y31;
        this.col.ball31X = this.X31;
        this.col.ball31Y = this.Y31;
        this.checker.white32X = this.X32;
        this.checker.white32Y = this.Y32;
        this.col.ball33X = this.X32;
        this.col.ball33Y = this.Y32;
        this.checker.white33X = this.X33;
        this.checker.white33Y = this.Y33;
        this.col.ball35X = this.X33;
        this.col.ball35Y = this.Y33;
        this.checker.white34X = this.X34;
        this.checker.white34Y = this.Y34;
        this.col.ball37X = this.X34;
        this.col.ball37Y = this.Y34;
        this.checker.blue11X = this.X61;
        this.checker.blue11Y = this.Y61;
        this.col.ball62X = this.X61;
        this.col.ball62Y = this.Y61;
        this.checker.blue12X = this.X62;
        this.checker.blue12Y = this.Y62;
        this.col.ball64X = this.X62;
        this.col.ball64Y = this.Y62;
        this.checker.blue13X = this.X63;
        this.checker.blue13Y = this.Y63;
        this.col.ball66X = this.X63;
        this.col.ball66Y = this.Y63;
        this.checker.blue14X = this.X64;
        this.checker.blue14Y = this.Y64;
        this.col.ball68X = this.X64;
        this.col.ball68Y = this.Y64;
        this.checker.blue21X = this.X71;
        this.checker.blue21Y = this.Y71;
        this.col.ball71X = this.X71;
        this.col.ball71Y = this.Y71;
        this.checker.blue22X = this.X72;
        this.checker.blue22Y = this.Y72;
        this.col.ball73X = this.X72;
        this.col.ball73Y = this.Y72;
        this.checker.blue23X = this.X73;
        this.checker.blue23Y = this.Y73;
        this.col.ball75X = this.X73;
        this.col.ball75Y = this.Y73;
        this.checker.blue24X = this.X74;
        this.checker.blue24Y = this.Y74;
        this.col.ball77X = this.X74;
        this.col.ball77Y = this.Y74;
        this.checker.blue31X = this.X81;
        this.checker.blue31Y = this.Y81;
        this.col.ball82X = this.X81;
        this.col.ball82Y = this.Y81;
        this.checker.blue32X = this.X82;
        this.checker.blue32Y = this.Y82;
        this.col.ball84X = this.X82;
        this.col.ball84Y = this.Y82;
        this.checker.blue33X = this.X83;
        this.checker.blue33Y = this.Y83;
        this.col.ball86X = this.X83;
        this.col.ball86Y = this.Y83;
        this.checker.blue34X = this.X84;
        this.checker.blue34Y = this.Y84;
        this.col.ball88X = this.X84;
        this.col.ball88Y = this.Y84;
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 660, 700);
        g.setColor(Color.lightGray);
        g.fillRect(660, 0, 700, 700);
        g.setColor(Color.yellow);
        g.fillRect(2, 26, 80, 80);
        g.fillRect(162, 26, 80, 80);
        g.fillRect(322, 26, 80, 80);
        g.fillRect(482, 26, 80, 80);
        g.fillRect(82, 106, 80, 80);
        g.fillRect(242, 106, 80, 80);
        g.fillRect(402, 106, 80, 80);
        g.fillRect(562, 106, 80, 80);
        g.fillRect(2, 186, 80, 80);
        g.fillRect(162, 186, 80, 80);
        g.fillRect(322, 186, 80, 80);
        g.fillRect(482, 186, 80, 80);
        g.fillRect(82, 266, 80, 80);
        g.fillRect(242, 266, 80, 80);
        g.fillRect(402, 266, 80, 80);
        g.fillRect(562, 266, 80, 80);
        g.fillRect(2, 346, 80, 80);
        g.fillRect(162, 346, 80, 80);
        g.fillRect(322, 346, 80, 80);
        g.fillRect(482, 346, 80, 80);
        g.fillRect(82, 426, 80, 80);
        g.fillRect(242, 426, 80, 80);
        g.fillRect(402, 426, 80, 80);
        g.fillRect(562, 426, 80, 80);
        g.fillRect(2, 506, 80, 80);
        g.fillRect(162, 506, 80, 80);
        g.fillRect(322, 506, 80, 80);
        g.fillRect(482, 506, 80, 80);
        g.fillRect(82, 586, 80, 80);
        g.fillRect(242, 586, 80, 80);
        g.fillRect(402, 586, 80, 80);
        g.fillRect(562, 586, 80, 80);
        g.setColor(Color.green);
        this.checker.checkerBlue11(g);
        this.checker.checkerBlue12(g);
        this.checker.checkerBlue13(g);
        this.checker.checkerBlue14(g);
        this.checker.checkerBlue21(g);
        this.checker.checkerBlue22(g);
        this.checker.checkerBlue23(g);
        this.checker.checkerBlue24(g);
        this.checker.checkerBlue31(g);
        this.checker.checkerBlue32(g);
        this.checker.checkerBlue33(g);
        this.checker.checkerBlue34(g);
        g.setColor(Color.CYAN);
        this.checker.checkerWhite11(g);
        this.checker.checkerWhite12(g);
        this.checker.checkerWhite13(g);
        this.checker.checkerWhite14(g);
        this.checker.checkerWhite21(g);
        this.checker.checkerWhite22(g);
        this.checker.checkerWhite23(g);
        this.checker.checkerWhite24(g);
        this.checker.checkerWhite31(g);
        this.checker.checkerWhite32(g);
        this.checker.checkerWhite33(g);
        this.checker.checkerWhite34(g);
        this.repaint();
        g.dispose();
        this.setSize(860, 680);
    }

    public void mouseDragged(MouseEvent e) {
        if(this.square11) {
            this.X11 = e.getX() - 34;
            this.Y11 = e.getY() - 34;
            this.col.ball11X = this.X11;
            this.col.ball11Y = this.Y11;
            this.checker.white11X = this.X11;
            this.checker.white11Y = this.Y11;
        }

        if(this.square12) {
            this.X12 = e.getX() - 34;
            this.Y12 = e.getY() - 34;
            this.col.ball13X = this.X12;
            this.col.ball13Y = this.Y12;
            this.checker.white12X = this.X12;
            this.checker.white12Y = this.Y12;
        }

        if(this.square13) {
            this.X13 = e.getX() - 34;
            this.Y13 = e.getY() - 34;
            this.col.ball15X = this.X13;
            this.col.ball15Y = this.Y13;
            this.checker.white13X = this.X13;
            this.checker.white13Y = this.Y13;
        }

        if(this.square14) {
            this.X14 = e.getX() - 34;
            this.Y14 = e.getY() - 34;
            this.col.ball17X = this.X14;
            this.col.ball17Y = this.Y14;
            this.checker.white14X = this.X14;
            this.checker.white14Y = this.Y14;
        }

        if(this.square21) {
            this.X21 = e.getX() - 34;
            this.Y21 = e.getY() - 34;
            this.col.ball22X = this.X21;
            this.col.ball22Y = this.Y21;
            this.checker.white21X = this.X21;
            this.checker.white21Y = this.Y21;
        }

        if(this.square22) {
            this.X22 = e.getX() - 34;
            this.Y22 = e.getY() - 34;
            this.col.ball24X = this.X22;
            this.col.ball24Y = this.Y22;
            this.checker.white22X = this.X22;
            this.checker.white22Y = this.Y22;
        }

        if(this.square23) {
            this.X23 = e.getX() - 34;
            this.Y23 = e.getY() - 34;
            this.col.ball26X = this.X23;
            this.col.ball26Y = this.Y23;
            this.checker.white23X = this.X23;
            this.checker.white23Y = this.Y23;
        }

        if(this.square24) {
            this.X24 = e.getX() - 34;
            this.Y24 = e.getY() - 34;
            this.col.ball28X = this.X24;
            this.col.ball28Y = this.Y24;
            this.checker.white24X = this.X24;
            this.checker.white24Y = this.Y24;
        }

        if(this.square31) {
            this.X31 = e.getX() - 34;
            this.Y31 = e.getY() - 34;
            this.col.ball31X = this.X31;
            this.col.ball31Y = this.Y31;
            this.checker.white31X = this.X31;
            this.checker.white31Y = this.Y31;
        }

        if(this.square32) {
            this.X32 = e.getX() - 34;
            this.Y32 = e.getY() - 34;
            this.col.ball33X = this.X32;
            this.col.ball33Y = this.Y32;
            this.checker.white32X = this.X32;
            this.checker.white32Y = this.Y32;
        }

        if(this.square33) {
            this.X33 = e.getX() - 34;
            this.Y33 = e.getY() - 34;
            this.col.ball35X = this.X33;
            this.col.ball35Y = this.Y33;
            this.checker.white33X = this.X33;
            this.checker.white33Y = this.Y33;
        }

        if(this.square34) {
            this.X34 = e.getX() - 34;
            this.Y34 = e.getY() - 34;
            this.col.ball37X = this.X34;
            this.col.ball37Y = this.Y34;
            this.checker.white34X = this.X34;
            this.checker.white34Y = this.Y34;
        }

        if(this.square61) {
            this.X61 = e.getX() - 34;
            this.Y61 = e.getY() - 34;
            this.col.ball62X = this.X61;
            this.col.ball62Y = this.Y61;
            this.checker.blue11X = this.X61;
            this.checker.blue11Y = this.Y61;
        }

        if(this.square62) {
            this.X62 = e.getX() - 34;
            this.Y62 = e.getY() - 34;
            this.col.ball64X = this.X62;
            this.col.ball64Y = this.Y62;
            this.checker.blue12X = this.X62;
            this.checker.blue12Y = this.Y62;
        }

        if(this.square63) {
            this.X63 = e.getX() - 34;
            this.Y63 = e.getY() - 34;
            this.col.ball66X = this.X63;
            this.col.ball66Y = this.Y63;
            this.checker.blue13X = this.X63;
            this.checker.blue13Y = this.Y63;
        }

        if(this.square64) {
            this.X64 = e.getX() - 34;
            this.Y64 = e.getY() - 34;
            this.col.ball68X = this.X64;
            this.col.ball68Y = this.Y64;
            this.checker.blue14X = this.X64;
            this.checker.blue14Y = this.Y64;
        }

        if(this.square71) {
            this.X71 = e.getX() - 34;
            this.Y71 = e.getY() - 34;
            this.col.ball71X = this.X71;
            this.col.ball71Y = this.Y71;
            this.checker.blue21X = this.X71;
            this.checker.blue21Y = this.Y71;
        }

        if(this.square72) {
            this.X72 = e.getX() - 34;
            this.Y72 = e.getY() - 34;
            this.col.ball73X = this.X72;
            this.col.ball73Y = this.Y72;
            this.checker.blue22X = this.X72;
            this.checker.blue22Y = this.Y72;
        }

        if(this.square73) {
            this.X73 = e.getX() - 34;
            this.Y73 = e.getY() - 34;
            this.col.ball75X = this.X73;
            this.col.ball75Y = this.Y73;
            this.checker.blue23X = this.X73;
            this.checker.blue23Y = this.Y73;
        }

        if(this.square74) {
            this.X74 = e.getX() - 34;
            this.Y74 = e.getY() - 34;
            this.col.ball77X = this.X74;
            this.col.ball77Y = this.Y74;
            this.checker.blue24X = this.X74;
            this.checker.blue24Y = this.Y74;
        }

        if(this.square81) {
            this.X81 = e.getX() - 34;
            this.Y81 = e.getY() - 34;
            this.col.ball82X = this.X81;
            this.col.ball82Y = this.Y81;
            this.checker.blue31X = this.X81;
            this.checker.blue31Y = this.Y81;
        }

        if(this.square82) {
            this.X82 = e.getX() - 34;
            this.Y82 = e.getY() - 34;
            this.col.ball84X = this.X82;
            this.col.ball84Y = this.Y82;
            this.checker.blue32X = this.X82;
            this.checker.blue32Y = this.Y82;
        }

        if(this.square83) {
            this.X83 = e.getX() - 34;
            this.Y83 = e.getY() - 34;
            this.col.ball86X = this.X83;
            this.col.ball86Y = this.Y83;
            this.checker.blue33X = this.X83;
            this.checker.blue33Y = this.Y83;
        }

        if(this.square84) {
            this.X84 = e.getX() - 34;
            this.Y84 = e.getY() - 34;
            this.col.ball88X = this.X84;
            this.col.ball88Y = this.Y84;
            this.checker.blue34X = this.X84;
            this.checker.blue34Y = this.Y84;
        }

    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("  mouse clicked white11X     " + this.checker.white11X);
        System.out.println("  mouse cliked white11Y      " + this.checker.white11Y);
        System.out.println("  mouse cliked ball11X       " + this.col.ball11X);
        System.out.println("  mouse cliked ball11Y       " + this.col.ball11Y);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        if(e.getX() > this.col.ball11X && e.getX() < this.col.ball11X + this.col.ball11.width && e.getY() > this.col.ball11Y && e.getY() < this.col.ball11Y + this.col.ball11.height) {
            this.square11 = true;
            this.highlight11 = true;
        }

        int var10000;
        if(e.getX() > this.col.rect11.x && e.getX() < this.col.rect11.x + this.col.rect11.width && e.getY() > this.col.rect11.y) {
            e.getY();
            var10000 = this.col.rect11.y;
            var10000 = this.col.rect11.height;
        }

        if(e.getX() > this.col.ball13X && e.getX() < this.col.ball13X + this.col.ball13.width && e.getY() > this.col.ball13Y && e.getY() < this.col.ball13Y + this.col.ball13.height) {
            this.square12 = true;
            System.out.println(" pressed " + this.square12);
        }

        if(e.getX() > this.col.rect13.x && e.getX() < this.col.rect13.x + this.col.rect13.width && e.getY() > this.col.rect13.y) {
            e.getY();
            var10000 = this.col.rect13.y;
            var10000 = this.col.rect13.height;
        }

        if(e.getX() > this.col.ball15X && e.getX() < this.col.ball15X + this.col.ball15.width && e.getY() > this.col.ball15Y && e.getY() < this.col.ball15Y + this.col.ball15.height) {
            this.square13 = true;
            System.out.println(" pressed " + this.square13);
        }

        if(e.getX() > this.col.rect15.x && e.getX() < this.col.rect15.x + this.col.rect15.width && e.getY() > this.col.rect15.y) {
            e.getY();
            var10000 = this.col.rect15.y;
            var10000 = this.col.rect15.height;
        }

        if(e.getX() > this.col.ball17X && e.getX() < this.col.ball17X + this.col.ball17.width && e.getY() > this.col.ball17Y && e.getY() < this.col.ball17Y + this.col.ball17.height) {
            this.square14 = true;
            System.out.println(" pressed " + this.square14);
        }

        if(e.getX() > this.col.rect17.x && e.getX() < this.col.rect17.x + this.col.rect17.width && e.getY() > this.col.rect17.y) {
            e.getY();
            var10000 = this.col.rect17.y;
            var10000 = this.col.rect17.height;
        }

        if(e.getX() > this.col.ball22X && e.getX() < this.col.ball22X + this.col.ball22.width && e.getY() > this.col.ball22Y && e.getY() < this.col.ball22Y + this.col.ball22.height) {
            this.square21 = true;
            System.out.println(" pressed " + this.square21);
        }

        if(e.getX() > this.col.ball24X && e.getX() < this.col.ball24X + this.col.ball24.width && e.getY() > this.col.ball24Y && e.getY() < this.col.ball24Y + this.col.ball24.height) {
            this.square22 = true;
            System.out.println(" pressed " + this.square22);
        }

        if(e.getX() > this.col.ball26X && e.getX() < this.col.ball26X + this.col.ball26.width && e.getY() > this.col.ball26Y && e.getY() < this.col.ball26Y + this.col.ball26.height) {
            this.square23 = true;
            System.out.println(" pressed " + this.square23);
        }

        if(e.getX() > this.col.ball28X && e.getX() < this.col.ball28X + this.col.ball28.width && e.getY() > this.col.ball28Y && e.getY() < this.col.ball28Y + this.col.ball28.height) {
            this.square24 = true;
            System.out.println(" pressed " + this.square24);
        }

        if(e.getX() > this.col.ball31X && e.getX() < this.col.ball31X + this.col.ball31.width && e.getY() > this.col.ball31Y && e.getY() < this.col.ball31Y + this.col.ball31.height) {
            this.square31 = true;
            System.out.println(" pressed " + this.square21);
        }

        if(e.getX() > this.col.ball33X && e.getX() < this.col.ball33X + this.col.ball33.width && e.getY() > this.col.ball33Y && e.getY() < this.col.ball33Y + this.col.ball33.height) {
            this.square32 = true;
            System.out.println(" pressed " + this.square22);
        }

        if(e.getX() > this.col.ball35X && e.getX() < this.col.ball35X + this.col.ball35.width && e.getY() > this.col.ball35Y && e.getY() < this.col.ball35Y + this.col.ball35.height) {
            this.square33 = true;
            System.out.println(" pressed " + this.square23);
        }

        if(e.getX() > this.col.ball37X && e.getX() < this.col.ball37X + this.col.ball37.width && e.getY() > this.col.ball37Y && e.getY() < this.col.ball37Y + this.col.ball37.height) {
            this.square34 = true;
            System.out.println(" pressed " + this.square24);
        }

        if(e.getX() > this.col.ball71X && e.getX() < this.col.ball71X + this.col.ball72.width && e.getY() > this.col.ball71Y && e.getY() < this.col.ball71Y + this.col.ball72.height) {
            this.square71 = true;
            System.out.println(" pressed " + this.square11 + " ball11 x  " + this.col.ball11.y);
        }

        if(e.getX() > this.col.ball73X && e.getX() < this.col.ball73X + this.col.ball74.width && e.getY() > this.col.ball73Y && e.getY() < this.col.ball73Y + this.col.ball74.height) {
            this.square72 = true;
            System.out.println(" pressed " + this.square12);
        }

        if(e.getX() > this.col.ball75X && e.getX() < this.col.ball75X + this.col.ball76.width && e.getY() > this.col.ball75Y && e.getY() < this.col.ball75Y + this.col.ball76.height) {
            this.square73 = true;
            System.out.println(" pressed " + this.square13);
        }

        if(e.getX() > this.col.ball77X && e.getX() < this.col.ball77X + this.col.ball78.width && e.getY() > this.col.ball77Y && e.getY() < this.col.ball77Y + this.col.ball78.height) {
            this.square74 = true;
            System.out.println(" pressed " + this.square14);
        }

        if(e.getX() > this.col.ball82X && e.getX() < this.col.ball82X + this.col.ball81.width && e.getY() > this.col.ball82Y && e.getY() < this.col.ball82Y + this.col.ball81.height) {
            this.square81 = true;
            System.out.println(" pressed " + this.square21);
        }

        if(e.getX() > this.col.ball84X && e.getX() < this.col.ball84X + this.col.ball83.width && e.getY() > this.col.ball84Y && e.getY() < this.col.ball84Y + this.col.ball83.height) {
            this.square82 = true;
            System.out.println(" pressed " + this.square22);
        }

        if(e.getX() > this.col.ball86X && e.getX() < this.col.ball86X + this.col.ball85.width && e.getY() > this.col.ball86Y && e.getY() < this.col.ball86Y + this.col.ball85.height) {
            this.square83 = true;
            System.out.println(" pressed " + this.square23);
        }

        if(e.getX() > this.col.ball88X && e.getX() < this.col.ball88X + this.col.ball87.width && e.getY() > this.col.ball88Y && e.getY() < this.col.ball88Y + this.col.ball87.height) {
            this.square84 = true;
            System.out.println(" pressed " + this.square24);
        }

        if(e.getX() > this.col.ball62X && e.getX() < this.col.ball62X + this.col.ball61.width && e.getY() > this.col.ball62Y && e.getY() < this.col.ball62Y + this.col.ball61.height) {
            this.square61 = true;
            System.out.println(" pressed " + this.square21);
        }

        if(e.getX() > this.col.ball64X && e.getX() < this.col.ball64X + this.col.ball63.width && e.getY() > this.col.ball64Y && e.getY() < this.col.ball64Y + this.col.ball63.height) {
            this.square62 = true;
            System.out.println(" pressed " + this.square22);
        }

        if(e.getX() > this.col.ball66X && e.getX() < this.col.ball66X + this.col.ball65.width && e.getY() > this.col.ball66Y && e.getY() < this.col.ball66Y + this.col.ball65.height) {
            this.square63 = true;
            System.out.println(" pressed " + this.square23);
        }

        if(e.getX() > this.col.ball68X && e.getX() < this.col.ball68X + this.col.ball87.width && e.getY() > this.col.ball68Y && e.getY() < this.col.ball68Y + this.col.ball87.height) {
            this.square64 = true;
            System.out.println(" pressed " + this.square24);
        }

    }

    public void mouseReleased(MouseEvent e) {
        this.highlight11 = false;
        this.square11 = false;
        this.square12 = false;
        this.square13 = false;
        this.square14 = false;
        this.square21 = false;
        this.square22 = false;
        this.square23 = false;
        this.square24 = false;
        this.square31 = false;
        this.square32 = false;
        this.square33 = false;
        this.square34 = false;
        this.square61 = false;
        this.square62 = false;
        this.square63 = false;
        this.square64 = false;
        this.square71 = false;
        this.square72 = false;
        this.square73 = false;
        this.square74 = false;
        this.square81 = false;
        this.square82 = false;
        this.square83 = false;
        this.square84 = false;
        System.out.println(" released " + this.square11);
    }
}
