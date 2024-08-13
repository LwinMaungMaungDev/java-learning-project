import java.awt.Graphics;

class HelloWorldApplet extends java.applet.Applet {

    public void paint(Graphics g) {
        g.drawString("Hello world!", 5, 25);
    }
}

/*
    1) The import line at the top of the file is somewhat analogous to an #include statement
    in C; it enables this applet to interact with the JDK classes for creating applets and for
    drawing graphics on the screen.

    2) The paint() method displays the content of the applet onto the screen. Here, the
    string Hello World gets drawn. Applets use several standard methods to take the place
    of main(), which include init() to initialize the applet, start() to start it running,
    and paint() to display it to the screen.
*/