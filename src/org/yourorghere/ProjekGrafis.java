package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class ProjekGrafisextends JFrame {

    static {
        // When using a GLCanvas, we have to set the Popup-Menues to be HeavyWeight,
        // so they display properly on top of the GLCanvas
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
    }
    private Animator animator;

    /**
     * Creates new form MainFrame
     */
    public ProjekGrafis() {
        initComponents();
        final GLRenderer glrender = new GLRenderer();
        KeyListener mylisterner = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println("typed " + e.getKeyCode());
            }

            public void keyPressed(KeyEvent e) {
                System.out.println("pressed " + e.getKeyCode());
                glrender.Key_Pressed(e.getKeyCode());
                canvas.repaint();
            }

            public void keyReleased(KeyEvent e) {
                System.out.println("released " + e.getKeyCode());
            }
        };
        canvas.addGLEventListener(glrender);
        Timer mytimer = new Timer();
        TimerTask mytimertask = new TimerTask() {
            @Override
            public void run() {
                //glrender.draw_text(glut, gl);
                canvas.repaint();
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        mytimer.schedule(mytimertask, 100, 100);
        addKeyListener(mylisterner);
        animator = new Animator(canvas);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        animator = new Animator(canvas);
        // This is a workaround for the GLCanvas not adjusting its size, when the frame is resized.
        canvas.setMinimumSize(new Dimension());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        glu.gluLookAt(4, 4, 4, // eye pos
                0, 0, 0, // look at
                0, 0, 1); // up
        gl.glTranslatef(0.5f, 0.5f, 0.5f);
        gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);

        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -1.0f, -5.0f);
        gl.glPushMatrix();
        Objek.Tangan(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -1.0f, -3.5f);
        gl.glPushMatrix();
        Objek.Tangan(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        Objek.Bola(gl);
        gl.glPopMatrix();

        gl.glTranslatef(0.8f, 0.8f, 0.1f);
        gl.glRotatef(180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl);
        gl.glPopMatrix();
        gl.glTranslatef(-0.8f, -1.6f, -0.1f);

        gl.glTranslatef(2.4f, 3.2f, 0.1f);
        gl.glRotatef(-180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl);
        gl.glPopMatrix();

        gl.glTranslatef(0.8f, 0.8f, 0.0f);
        gl.glPushMatrix();
        Objek.Tabung(gl);
        gl.glPopMatrix();

        gl.glTranslatef(-0.8f, 1.0f, 0.0f);
        gl.glRotatef(-90, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl);
        gl.glPopMatrix();

        gl.glTranslatef(1.8f, 1.6f, 0.0f);
        gl.glRotatef(180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl);
        gl.glPopMatrix();

        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        oldMouseX = e.getX();
        oldMouseY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Dimension size = e.getComponent().getSize();
        float thetaY = 360.0f * ((float) (x - oldMouseX) / (float) size.width);
        float thetaX = 360.0f * ((float) (oldMouseY - y) / (float) size.height);
        oldMouseX = x;
        oldMouseY = y;
        view_rotx += thetaX;
        view_roty += thetaY;
    }

    public void mouseMoved(MouseEvent e) {
    }
}
