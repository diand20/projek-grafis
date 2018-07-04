package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class GLRenderer implements GLEventListener {

    //class vector untuk memudah vektor-isasi
    private class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }
    }
    vector lineal1 = new vector(0f, 0f, -1f);//deklarasi awal vektor untuk maju
    vector lineal2 = new vector(0f, 0f, 1f);
    vector lateral1 = new vector(-1f, 0f, 0f);//deklarasi awal vektor untuk maju
    vector lateral2 = new vector(1f, 0f, 0f);
    vector vertical1 = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik
    vector vertical2 = new vector(0f, -1f, 0f);
    vector horizontal = new vector(0f, -1f, 0f);

    /*
      ini adalah metod untuk melakukan pergerakan.
      magnitude adalah besarnya gerakan sedangkan
      direction digunakan untuk menentukan arah.
      gunakan -1 untuk arah berlawanan dengan vektor awal
     */
    private void vectorMovement(vector toMove, float magnitude, float direction) {
        float speedX = toMove.x * magnitude * direction;
        float speedY = toMove.y * magnitude * direction;
        float speedZ = toMove.z * magnitude * direction;
        Cx += speedX;
        Cy += speedY;
        Cz += speedZ;
        Lx += speedX;
        Ly += speedY;
        Lz += speedZ;
    }
    float Cx = 5f, Cy = 0f, Cz = 5f;
    float Lx = 0f, Ly = 0f, Lz = -20f;

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: "
                + gl.getClass().getName());
        // Enable VSync
        gl.setSwapInterval(1);
        gl.glEnable(GL.GL_DEPTH_TEST);
        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    float angle = 0, gerakTangan = 0, gerakBaling = -2.3f;
    boolean gerakkanan = false;
    float anglel = 0, direction = 1;

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT
                | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        // Move the "drawing cursor" around
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                0, 1, 0);
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -1.0f, -5.0f);
        if (gerakkanan == true) {
            gl.glTranslatef(gerakTangan, 0.0f, 0.0f);
        }
        gl.glPushMatrix();
        Objek.Tangan(gl, 1.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        gl.glRotatef(110, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(-0.3f, -0.24f, 1.65f);
        gl.glPushMatrix();
        Objek.Tabung(gl, 0.67f, 3.0f, 1.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        if (gerakkanan == true) {
            gl.glTranslatef(-gerakTangan, 0.0f, 0.0f);
        }
        gl.glPopMatrix();

        gl.glLoadIdentity();
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                0, 1, 0);
        gl.glPushMatrix();
        gl.glTranslatef(7.2f, 2.5f, -6.6f);
        if (gerakkanan == true) {
            gl.glRotatef(-anglel, 0.3f, 0.0f, 1.0f);
        }
        gl.glPushMatrix();
        Objek.Bola(gl, 0.70f, 1.0f, 0.0f, 0.0f);
        gl.glPopMatrix();

        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
        gl.glTranslatef(0.0f, -0.1f, 0.7f);
        gl.glPushMatrix();
        Objek.Tabung(gl, 0.60f, 2.5f, 1.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        gl.glTranslatef(0.0f, 0.1f, 3.2f);
        gl.glPushMatrix();
        Objek.Bola(gl, 0.70f, 1.0f, 0.0f, 0.0f);
        gl.glPopMatrix();

        if (anglel < 25) {
            anglel += direction;
        }
        if (anglel >= 25 || anglel <= 0) {
            direction = -direction;
        }
        gl.glPopMatrix();

        gl.glLoadIdentity();
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                0, 1, 0);
        gl.glPushMatrix();
        gl.glTranslatef(3.0f, -1.0f, -3.5f);

//        gl.glTranslatef(gerakTangan, 0.0f, 0.0f);
        gl.glPushMatrix();
        Objek.Tangan(gl, 1.0f, 0.5f, 0.0f);
        gl.glPopMatrix();
//      gl.glTranslatef(-gerakTangan, 0.0f, 0.0f);

        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
        gl.glTranslatef(-0.5f, -1.2f, 0.0f);
        gl.glTranslatef(0.0f, 0.0f, gerakBaling);
        gl.glRotatef(angle, 0.0f, 0.0f, 1.0f);

        gl.glPushMatrix();
        Objek.Bola(gl, 0.2f, 1.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        gl.glTranslatef(0.8f, 0.8f, 0.1f);
        gl.glRotatef(180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl, 1.0f, 1.0f, 1.0f);
        gl.glPopMatrix();
        gl.glTranslatef(-0.8f, -1.6f, -0.1f);

        gl.glTranslatef(2.4f, 3.2f, 0.1f);
        gl.glRotatef(-180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl, 1.0f, 1.0f, 1.0f);
        gl.glPopMatrix();

        gl.glTranslatef(0.8f, 0.8f, 0.0f);
        gl.glPushMatrix();
        Objek.Tabung(gl, 0.15f, 3.0f, 1.0f, 0.0f, 0.0f);
        gl.glPopMatrix();

        gl.glTranslatef(-0.8f, 1.0f, 0.0f);
        gl.glRotatef(-90, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl, 0.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        gl.glTranslatef(1.8f, 1.6f, 0.0f);
        gl.glRotatef(180, 0.0f, 0.0f, 1.0f);
        gl.glPushMatrix();
        Objek.Baling(gl, 0.0f, 1.0f, 0.0f);
        gl.glPopMatrix();

        gl.glRotatef(-angle, 0.0f, 0.0f, 1.0f);
        angle = angle + 10.0f;

        if (gerakBaling > -9.0f) {
            gerakBaling = gerakBaling - 0.1f;
        }
        if (gerakTangan > -1.5f) {
            gerakTangan = gerakTangan - 0.055f;
        }

        gl.glPopMatrix();
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable,
            boolean modeChanged, boolean deviceChanged) {
    }

    public void Key_Pressed(int keyCode) {

        //huruf S    
        if (keyCode == 83) {
            vectorMovement(lineal1, 2f, -1f);
        } //huruf W
        else if (keyCode == 87) {
            vectorMovement(lineal2, 2f, -1f);
        } //panah kiri    
        else if (keyCode == 37) {
            vectorMovement(lateral1, 2f, -1f);
        } //panah atas      
        else if (keyCode == 38) {
            vectorMovement(vertical1, 2f, -1f);
        } //panah kanan
        else if (keyCode == 39) {
            vectorMovement(lateral2, 2f, -1f);
        } //panah bawah
        else if (keyCode == 40) {
            vectorMovement(vertical2, 2f, -1f);
        } else if (keyCode == 71) {
            Cx = 2f;
            Cy = 10f;
            Cz = -6f;
            Lx = 0f;
            Ly = -90f;
            Lz = 0f;
        } else if (keyCode == 72) {
            Cx = 5;
            Cy = 0;
            Cz = 5;
            Lx = 0;
            Ly = 0;
            Lz = -20;
        } //huruf R 
        else if (keyCode == 82) {
            gerakkanan = true;
        } else {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.     
        }
    }
}
