package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Tangan(GL gl, float warna1, float warna2, float warna3) {
        gl.glColor3f(warna1, warna2, warna3);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.5f, 1.0f, 0.0f);
        gl.glVertex3f(-1.75f, 0.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glVertex3f(0.0f, -1.20f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glVertex3f(1.25f, 0.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.25f, 0.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, -0.5f);
        gl.glVertex3f(1.25f, 0.5f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glVertex3f(0.0f, -1.20f, 0.0f);
        gl.glVertex3f(0.0f, -1.20f, -0.5f);
        gl.glVertex3f(1.0f, -1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glVertex3f(0.0f, -1.20f, 0.0f);
        gl.glVertex3f(0.0f, -1.20f, -0.5f);
        gl.glVertex3f(-1.0f, -1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, 1.0f, -0.5f);
        gl.glVertex3f(-1.5f, 1.0f, -0.5f);
        gl.glVertex3f(-1.75f, 0.0f, -0.5f);
        gl.glVertex3f(-1.0f, -1.0f, -0.5f);
        gl.glVertex3f(0.0f, -1.20f, -0.5f);
        gl.glVertex3f(1.0f, -1.0f, -0.5f);
        gl.glVertex3f(1.25f, 0.5f, -0.5f);
        gl.glVertex3f(0.0f, 1.25f, -0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.25f, 0.5f, 0.0f);
        gl.glVertex3f(1.6f, 0.4f, 0.0f);
        gl.glVertex3f(1.6f, -0.9f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.25f, 0.5f, 0.0f);
        gl.glVertex3f(1.6f, 0.4f, 0.0f);
        gl.glVertex3f(1.6f, 0.4f, -0.5f);
        gl.glVertex3f(1.25f, 0.5f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.6f, -0.9f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, -0.5f);
        gl.glVertex3f(1.6f, -0.9f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.6f, 0.4f, 0.0f);
        gl.glVertex3f(1.6f, -0.9f, 0.0f);
        gl.glVertex3f(1.6f, -0.9f, -0.5f);
        gl.glVertex3f(1.6f, 0.4f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.25f, 0.5f, -0.5f);
        gl.glVertex3f(1.6f, 0.4f, -0.5f);
        gl.glVertex3f(1.6f, -0.9f, -0.5f);
        gl.glVertex3f(1.0f, -1.0f, -0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.5f, 1.11f, 0.0f);
        gl.glVertex3f(-1.7f, 1.2f, 0.0f);
        gl.glVertex3f(-1.7f, 1.51f, 0.0f);
        gl.glVertex3f(-1.5f, 1.6f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.5f, 1.11f, 0.0f);
        gl.glVertex3f(-1.5f, 1.11f, -0.5f);
        gl.glVertex3f(-1.0f, 1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 1.11f, 0.0f);
        gl.glVertex3f(-1.7f, 1.2f, 0.0f);
        gl.glVertex3f(-1.7f, 1.2f, -0.5f);
        gl.glVertex3f(-1.5f, 1.11f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.7f, 1.2f, 0.0f);
        gl.glVertex3f(-1.7f, 1.51f, 0.0f);
        gl.glVertex3f(-1.7f, 1.51f, -0.5f);
        gl.glVertex3f(-1.7f, 1.2f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.7f, 1.51f, 0.0f);
        gl.glVertex3f(-1.5f, 1.6f, 0.0f);
        gl.glVertex3f(-1.5f, 1.6f, -0.5f);
        gl.glVertex3f(-1.7f, 1.51f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 1.6f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, 0.0f);
        gl.glVertex3f(0.0f, 1.25f, -0.5f);
        gl.glVertex3f(-1.5f, 1.6f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.0f, 1.0f, -0.5f);
        gl.glVertex3f(-1.5f, 1.11f, -0.5f);
        gl.glVertex3f(-1.7f, 1.2f, -0.5f);
        gl.glVertex3f(-1.7f, 1.51f, -0.5f);
        gl.glVertex3f(-1.5f, 1.6f, -0.5f);
        gl.glVertex3f(0.0f, 1.25f, -0.5f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 1.0f, 0.0f);
        gl.glVertex3f(-2.6f, 1.0f, 0.0f);
        gl.glVertex3f(-2.8f, 0.91f, 0.0f);
        gl.glVertex3f(-2.8f, 0.60f, 0.0f);
        gl.glVertex3f(-2.6f, 0.51f, 0.0f);
        gl.glVertex3f(-1.5f, 0.51f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 1.0f, 0.0f);
        gl.glVertex3f(-2.6f, 1.0f, 0.0f);
        gl.glVertex3f(-2.6f, 1.0f, -0.5f);
        gl.glVertex3f(-1.5f, 1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.6f, 1.0f, 0.0f);
        gl.glVertex3f(-2.8f, 0.91f, 0.0f);
        gl.glVertex3f(-2.8f, 0.91f, -0.5f);
        gl.glVertex3f(-2.6f, 1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.8f, 0.91f, 0.0f);
        gl.glVertex3f(-2.8f, 0.60f, 0.0f);
        gl.glVertex3f(-2.8f, 0.60f, -0.5f);
        gl.glVertex3f(-2.8f, 0.91f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.8f, 0.60f, 0.0f);
        gl.glVertex3f(-2.6f, 0.51f, 0.0f);
        gl.glVertex3f(-2.6f, 0.51f, -0.5f);
        gl.glVertex3f(-2.8f, 0.60f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.6f, 0.51f, 0.0f);
        gl.glVertex3f(-1.5f, 0.51f, 0.0f);
        gl.glVertex3f(-1.5f, 0.51f, -0.5f);
        gl.glVertex3f(-2.6f, 0.51f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 1.0f, -0.5f);
        gl.glVertex3f(-2.6f, 1.0f, -0.5f);
        gl.glVertex3f(-2.8f, 0.91f, -0.5f);
        gl.glVertex3f(-2.8f, 0.60f, -0.5f);
        gl.glVertex3f(-2.6f, 0.51f, -0.5f);
        gl.glVertex3f(-1.5f, 0.51f, -0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 0.49f, 0.0f);
        gl.glVertex3f(-2.8f, 0.49f, 0.0f);
        gl.glVertex3f(-3.0f, 0.40f, 0.0f);
        gl.glVertex3f(-3.0f, 0.09f, 0.0f);
        gl.glVertex3f(-2.8f, 0.0f, 0.0f);
        gl.glVertex3f(-1.5f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 0.49f, 0.0f);
        gl.glVertex3f(-2.8f, 0.49f, 0.0f);
        gl.glVertex3f(-2.8f, 0.49f, -0.5f);
        gl.glVertex3f(-1.5f, 0.49f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.8f, 0.49f, 0.0f);
        gl.glVertex3f(-3.0f, 0.40f, 0.0f);
        gl.glVertex3f(-3.0f, 0.40f, -0.5f);
        gl.glVertex3f(-2.8f, 0.49f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-3.0f, 0.40f, 0.0f);
        gl.glVertex3f(-3.0f, 0.09f, 0.0f);
        gl.glVertex3f(-3.0f, 0.09f, -0.5f);
        gl.glVertex3f(-3.0f, 0.40f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-3.0f, 0.09f, 0.0f);
        gl.glVertex3f(-2.8f, 0.0f, 0.0f);
        gl.glVertex3f(-2.8f, 0.0f, -0.5f);
        gl.glVertex3f(-3.0f, 0.09f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.8f, 0.0f, 0.0f);
        gl.glVertex3f(-1.5f, 0.0f, 0.0f);
        gl.glVertex3f(-1.5f, 0.0f, -0.5f);
        gl.glVertex3f(-2.8f, 0.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 0.49f, -0.5f);
        gl.glVertex3f(-2.8f, 0.49f, -0.5f);
        gl.glVertex3f(-3.0f, 0.40f, -0.5f);
        gl.glVertex3f(-3.0f, 0.09f, -0.5f);
        gl.glVertex3f(-2.8f, 0.0f, -0.5f);
        gl.glVertex3f(-1.5f, 0.0f, -0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.01f, 0.0f);
        gl.glVertex3f(-2.5f, -0.01f, 0.0f);
        gl.glVertex3f(-2.7f, -0.10f, 0.0f);
        gl.glVertex3f(-2.7f, -0.40f, 0.0f);
        gl.glVertex3f(-2.5f, -0.49f, 0.0f);
        gl.glVertex3f(-1.2f, -0.49f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.01f, 0.0f);
        gl.glVertex3f(-2.5f, -0.01f, 0.0f);
        gl.glVertex3f(-2.5f, -0.01f, -0.5f);
        gl.glVertex3f(-1.2f, -0.01f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.5f, -0.01f, 0.0f);
        gl.glVertex3f(-2.7f, -0.10f, 0.0f);
        gl.glVertex3f(-2.7f, -0.10f, -0.5f);
        gl.glVertex3f(-2.5f, -0.01f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.7f, -0.10f, 0.0f);
        gl.glVertex3f(-2.7f, -0.40f, 0.0f);
        gl.glVertex3f(-2.7f, -0.40f, -0.5f);
        gl.glVertex3f(-2.7f, -0.10f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.7f, -0.40f, 0.0f);
        gl.glVertex3f(-2.5f, -0.49f, 0.0f);
        gl.glVertex3f(-2.5f, -0.49f, -0.5f);
        gl.glVertex3f(-2.7f, -0.40f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.5f, -0.49f, 0.0f);
        gl.glVertex3f(-1.2f, -0.49f, 0.0f);
        gl.glVertex3f(-1.2f, -0.49f, -0.5f);
        gl.glVertex3f(-2.5f, -0.49f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.01f, -0.5f);
        gl.glVertex3f(-2.5f, -0.01f, -0.5f);
        gl.glVertex3f(-2.7f, -0.10f, -0.5f);
        gl.glVertex3f(-2.7f, -0.40f, -0.5f);
        gl.glVertex3f(-2.5f, -0.49f, -0.5f);
        gl.glVertex3f(-1.2f, -0.49f, -0.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.51f, 0.0f);
        gl.glVertex3f(-1.8f, -0.51f, 0.0f);
        gl.glVertex3f(-2.0f, -0.6f, 0.0f);
        gl.glVertex3f(-2.0f, -0.91f, 0.0f);
        gl.glVertex3f(-1.8f, -1.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.51f, 0.0f);
        gl.glVertex3f(-1.8f, -0.51f, 0.0f);
        gl.glVertex3f(-1.8f, -0.51f, -0.5f);
        gl.glVertex3f(-1.2f, -0.51f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.8f, -0.51f, 0.0f);
        gl.glVertex3f(-2.0f, -0.6f, 0.0f);
        gl.glVertex3f(-2.0f, -0.6f, -0.5f);
        gl.glVertex3f(-1.8f, -0.51f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.0f, -0.6f, 0.0f);
        gl.glVertex3f(-2.0f, -0.91f, 0.0f);
        gl.glVertex3f(-2.0f, -0.91f, -0.5f);
        gl.glVertex3f(-2.0f, -0.6f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-2.0f, -0.91f, 0.0f);
        gl.glVertex3f(-1.8f, -1.0f, 0.0f);
        gl.glVertex3f(-1.8f, -1.0f, -0.5f);
        gl.glVertex3f(-2.0f, -0.91f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.8f, -1.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, -0.5f);
        gl.glVertex3f(-1.8f, -1.0f, -0.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.2f, -0.51f, -0.5f);
        gl.glVertex3f(-1.8f, -0.51f, -0.5f);
        gl.glVertex3f(-2.0f, -0.6f, -0.5f);
        gl.glVertex3f(-2.0f, -0.91f, -0.5f);
        gl.glVertex3f(-1.8f, -1.0f, -0.5f);
        gl.glVertex3f(-1.0f, -1.0f, -0.5f);
        gl.glEnd();
    }
    
    static void Baling(GL gl, float warna1, float warna2, float warna3) {
        gl.glColor3f(warna1, warna2, warna3);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(0.0f, 0.5f, 0.0f);
        gl.glVertex3f(1.0f, 0.7f, 0.0f);
        gl.glVertex3f(1.0f, 0.9f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.5f, 0.9f, 0.0f);
        gl.glVertex3f(-1.5f, 0.7f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(0.0f, 0.5f, 0.0f);
        gl.glVertex3f(1.0f, 0.7f, 0.0f);
        gl.glVertex3f(1.0f, 0.7f, -0.15f);
        gl.glVertex3f(0.0f, 0.5f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.0f, 0.7f, 0.0f);
        gl.glVertex3f(1.0f, 0.9f, 0.0f);
        gl.glVertex3f(1.0f, 0.9f, -0.15f);
        gl.glVertex3f(1.0f, 0.7f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(1.0f, 0.9f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, -0.15f);
        gl.glVertex3f(1.0f, 0.9f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.5f, 0.9f, 0.0f);
        gl.glVertex3f(-1.5f, 0.9f, -0.15f);
        gl.glVertex3f(0.0f, 1.0f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(-1.5f, 0.9f, 0.0f);
        gl.glVertex3f(-1.5f, 0.7f, 0.0f);
        gl.glVertex3f(-1.5f, 0.7f, -0.15f);
        gl.glVertex3f(-1.5f, 0.9f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(0.0f, 0.5f, 0.0f);
        gl.glVertex3f(-1.5f, 0.7f, 0.0f);
        gl.glVertex3f(-1.5f, 0.7f, -0.15f);
        gl.glVertex3f(0.0f, 0.5f, -0.15f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex3f(0.0f, 0.5f, -0.15f);
        gl.glVertex3f(1.0f, 0.7f, -0.15f);
        gl.glVertex3f(1.0f, 0.9f, -0.15f);
        gl.glVertex3f(0.0f, 1.0f, -0.15f);
        gl.glVertex3f(-1.5f, 0.9f, -0.15f);
        gl.glVertex3f(-1.5f, 0.7f, -0.15f);
        gl.glEnd();
    }
     static void Tabung(GL gl, float radius, float lenght, float warna1, float warna2, float warna3) {
        gl.glColor3f(warna1, warna2, warna3);
        float BODY_LENGTH = lenght;
        float BODY_RADIUS = radius;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }

    static void Bola(GL gl, float warna1, float warna2, float warna3) {
        gl.glColor3f(warna1, warna2, warna3);
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
}
