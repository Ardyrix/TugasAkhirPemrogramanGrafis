/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author HAQI
 */
public class Objek {

    static void kepala(GL gl) {

        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 3, 0);//2
        gl.glVertex3f(0, 3, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(5, 0, 0);//5
        gl.glVertex3f(5, 3, 0);//6
        gl.glVertex3f(0, 3, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(5, 0, 3);//8
        gl.glVertex3f(5, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 3, 0);//2
        gl.glVertex3f(5, 3, 0);//6
        gl.glVertex3f(5, 3, 3);//7
        gl.glVertex3f(0, 3, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(5, 0, 0);//5
        gl.glVertex3f(5, 3, 0);//6
        gl.glVertex3f(5, 3, 3);//7
        gl.glVertex3f(5, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(5, 3, 3);//7
        gl.glVertex3f(5, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 3, 3);//3
        gl.glEnd();
    }

    static void badan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 2, 0);//2
        gl.glVertex3f(0, 2, 4);//3
        gl.glVertex3f(0, 0, 4);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(3, 0, 0);//5
        gl.glVertex3f(3, 2, 0);//6
        gl.glVertex3f(0, 2, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 4);//4
        gl.glVertex3f(3, 0, 4);//8
        gl.glVertex3f(3, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 2, 0);//2
        gl.glVertex3f(3, 2, 0);//6
        gl.glVertex3f(3, 2, 4);//7
        gl.glVertex3f(0, 2, 4);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(3, 0, 0);//5
        gl.glVertex3f(3, 2, 0);//6
        gl.glVertex3f(3, 2, 4);//7
        gl.glVertex3f(3, 0, 4);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(3, 2, 4);//7
        gl.glVertex3f(3, 0, 4);//8
        gl.glVertex3f(0, 0, 4);//4
        gl.glVertex3f(0, 2, 4);//3
        gl.glEnd();
    }

    static void tangankanan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void tangankiri(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void kakikanan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void kakikiri(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

}
