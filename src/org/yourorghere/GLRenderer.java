package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author BOT
 */
public class GLRenderer implements GLEventListener {

    class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }

        void vectorRotation(vector reference, float angle) {
            vector temp = reference;
            float magnitude = (float) Math.sqrt(Math.pow(temp.x, 2) + Math.pow(temp.y, 2) + Math.pow(temp.z, 2));
            temp.x = temp.x / magnitude;
            temp.y = temp.y / magnitude;
            temp.z = temp.z / magnitude;
            float dot_product = (x * temp.x) + (y * temp.y) + (z * temp.z);
            float cross_product_x = (y * temp.z) - (temp.z * z);
            float cross_product_y = -((x * temp.z) - (z * temp.x));
            float cross_product_z = (x * temp.y) - (y * temp.x);
            float last_factor_rodrigues = (float) (1 - Math.cos(Math.toRadians(angle % 90)));
            x = (float) ((x * Math.cos(Math.toRadians(angle % 90)))
                    + (cross_product_x * Math.sin(Math.toRadians(angle % 90)))
                    + (dot_product * last_factor_rodrigues * x));
            y = (float) ((this.y * Math.cos(Math.toRadians(angle % 90)))
                    + (cross_product_y * Math.sin(Math.toRadians(angle % 90)))
                    + (dot_product * last_factor_rodrigues * y));
            z = (float) ((z * Math.cos(Math.toRadians(angle % 90)))
                    + (cross_product_z * Math.sin(Math.toRadians(angle % 90)))
                    + (dot_product * last_factor_rodrigues * z));
        }
    }
    vector depanBelakang = new vector(0f, 0f, -1f);
    vector samping = new vector(1f, 0f, 0f);
    vector vertikal = new vector(0f, 1f, 0f);
    float Cx = 0, Cy = 2.5f, Cz = 0;
    float Lx = 0, Ly = 2.5f, Lz = -20f;
    float angle_depanBelakang = 0f;
    float angle_depanBelakang2 = 0f;
    float angle_samping = 0f;
    float angle_samping2 = 0f;
    float angle_vertikal = 0f;
    float angle_vertikal2 = 0f;
    float danboAngle = 90f;
    float kakikananAngle = 0f;
    float kakikiriAngle = 0f;
    float tangankananAngle = 1;
    float tangankiriAngle = 1;
    double direction1 = 5;
    double direction2 = 5;
    double direction3 = 5;
    double direction4 = 5;
    boolean ori = true, kakiKanan1, kakiKanan2, kakiKiri1, kakiKiri2 = false;

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

    private void cameraRotation(vector reference, double angle) {
        float M = (float) (Math.sqrt(Math.pow(reference.x, 2) + Math.pow(reference.y, 2) + Math.pow(reference.z, 2)));
        float Up_x1 = reference.x / M;
        float Up_y1 = reference.y / M;
        float Up_z1 = reference.z / M;
        float VLx = Lx - Cx;
        float VLy = Ly - Cy;
        float VLz = Lz - Cz;
        float dot_product = (VLx * Up_x1) + (VLy * Up_y1) + (VLz * Up_z1);
        float cross_product_x = (Up_y1 * VLz) - (VLy * Up_z1);
        float cross_product_y = -((Up_x1 * VLz) - (Up_z1 * VLx));
        float cross_product_z = (Up_x1 * VLy) - (Up_y1 * VLx);
        float last_factor_rodriques = (float) (1 - Math.cos(Math.toRadians(angle % 90)));
        float Lx1 = (float) ((VLx * Math.cos(Math.toRadians(angle % 90)))
                + (cross_product_x * Math.sin(Math.toRadians(angle % 90)))
                + (dot_product * last_factor_rodriques * VLx));
        float Ly1 = (float) ((VLy * Math.cos(Math.toRadians(angle % 90)))
                + (cross_product_y * Math.sin(Math.toRadians(angle % 90)))
                + (dot_product * last_factor_rodriques * VLy));
        float Lz1 = (float) ((VLz * Math.cos(Math.toRadians(angle % 90)))
                + (cross_product_z * Math.sin(Math.toRadians(angle % 90)))
                + (dot_product * last_factor_rodriques * VLz));
        Lx = Lx1 + Cx;
        Ly = Ly1 + Cy;
        Lz = Lz1 + Cz;
    }

    public void init(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        gl.setSwapInterval(1);
        float ambient[] = {0f, 26, 81f, 55f};
        float diffuse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float position[] = {1.0f, 1.0f, 1.0f, 0.0f};
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position, 0);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glClearColor(0f, 0f, 0.0f, 1.0f);
        gl.glShadeModel(GL.GL_SMOOTH);

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) {
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

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);

        gl.glLoadIdentity();

        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                vertikal.x, vertikal.y, vertikal.z);

        gl.glRotatef(danboAngle, 1.0f, 0.0f, 0.0f);
        gl.glTranslatef(-2.5f, -16.0f, -7.0f);
        gl.glColor3f(1, 0, 0);
        Objek.kepala(gl);
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glTranslatef(1.0f, 0.5f, 3.0f);
        Objek.badan(gl);
        gl.glPopMatrix();
        gl.glTranslatef(-0.2f, 0.5f, 3.3f);
        gl.glRotatef(tangankananAngle, 1.0f, 0.0f, 0.0f);
        Objek.tangankanan(gl);
        gl.glPopMatrix();
        gl.glTranslatef(4.1f, 0.5f, 3.3f);
        gl.glRotatef(tangankiriAngle, 1.0f, 0.0f, 0.0f);
        Objek.tangankiri(gl);
        gl.glPopMatrix();
        gl.glTranslatef(1.3f, 0.5f, 7.0f);
        gl.glRotatef(kakikananAngle, 1.0f, 0.0f, 0.0f);
        Objek.kakikanan(gl);
        gl.glPopMatrix();
        gl.glTranslatef(2.8f, 0.5f, 7.0f);
        gl.glRotatef(kakikiriAngle, 1.0f, 0.0f, 0.0f);
        gl.glColor3f(1, 0, 0);
        Objek.kakikiri(gl);
        gl.glPopMatrix();

        tangankananAngle += direction1;
        if (tangankananAngle > 50) {
            direction1 = -direction1;
        } else if (tangankananAngle < -50) {
            direction1 = -direction1;
        }
        tangankiriAngle -= direction2;
        if (tangankiriAngle < -50) {
            direction2 = -direction2;
        } else if (tangankiriAngle > 50) {
            direction2 = -direction2;
        }
        if (kakiKanan1) {
            kakikananAngle -= direction3;
            if (kakikananAngle < -70) {
                direction3 = -direction3;
            } else if (kakikananAngle > 10) {
                direction3 = -direction3;
            }
        }
        if (kakiKanan2) {
            kakikananAngle += direction3;
            if (kakikananAngle < -70) {
                direction3 = -direction3;
            } else if (kakikananAngle > 10) {
                direction3 = -direction3;
            }
        }
        if (kakiKiri1) {
            kakikiriAngle += direction4;
            if (kakikiriAngle < -70) {
                direction4 = -direction4;
            } else if (kakikiriAngle > 10) {
                direction4 = -direction4;
            }
        }
        if (kakiKiri2) {
            kakikiriAngle -= direction4;
            if (kakikiriAngle < -70) {
                direction4 = -direction4;
            } else if (kakikiriAngle > 10) {
                direction4 = -direction4;
            }
        }
        gl.glFlush();

    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    void Key_Pressed(int keyCode) {
        
        switch (keyCode) {
        //panah ATAS
            case 38:
                vectorMovement(depanBelakang, 2f, 1f);
                break;
        //panah BAWAH
            case 40:
                vectorMovement(depanBelakang, 2f, -1f);
                break;
        //huruf D
            case 68:
                vectorMovement(samping, 2f, -1f);
                break;
        //huruf A
            case 65:
                vectorMovement(samping, 2f, 1f);
                break;
        //huruf S
            case 83:
                vectorMovement(vertikal, 2f, 1f);
                break;
        //huruf X
            case 87:
                vectorMovement(vertikal, 2f, -1f);
                break;
        //huruf Z
            case 90:
                if (kakiKanan1) {
                    kakiKanan1 = false;
                } else {
                    kakiKanan1 = true;
                }   break;
        //huruf Y
            case 88:
                if (kakiKanan2) {
                    kakiKanan2 = false;
                } else {
                    kakiKanan2 = true;
                }   break;
        //huruf V
            case 86:
                if (kakiKiri1) {
                    kakiKiri1 = false;
                } else {
                    kakiKiri1 = true;
                }   break;
        //huruf C
            case 67:
                if (kakiKiri2) {
                    kakiKiri2 = false;
                } else {
                    kakiKiri2 = true;
                }   break;
        //Huruf J
            case 74:
                angle_vertikal += 7f;
                samping.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
                depanBelakang.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
                cameraRotation(vertikal, angle_vertikal - angle_vertikal2);
                angle_vertikal2 = angle_vertikal;
                break;
        //huruf L
            case 76:
                angle_vertikal -= 7f;
                samping.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
                depanBelakang.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
                cameraRotation(vertikal, angle_vertikal - angle_vertikal2);
                angle_vertikal2 = angle_vertikal;
                break;
        //huruf K
            case 75:
                angle_samping -= 7f;
                depanBelakang.vectorRotation(samping, angle_samping - angle_samping2);
                cameraRotation(samping, angle_samping - angle_samping2);
                angle_samping2 = angle_samping;
                break;
        //Huruf I
            case 73:
                angle_samping += 7f;
                depanBelakang.vectorRotation(samping, angle_samping - angle_samping2);
                cameraRotation(samping, angle_samping - angle_samping2);
                angle_samping2 = angle_samping;
                break;
        //panah KIRI
            case 37:
                angle_depanBelakang -= 15f;
                samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
                vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
                angle_depanBelakang2 = angle_depanBelakang;
                break;
        //panah KANAN    
            case 39:
                angle_depanBelakang += 15f;
                samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
                vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
                angle_depanBelakang2 = angle_depanBelakang;
                break;
            default:
                break;
        }
    }
}
