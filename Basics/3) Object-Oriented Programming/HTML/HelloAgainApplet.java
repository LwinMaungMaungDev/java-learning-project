import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class HelloAgainApplet extends java.applet.Applet {
    Font f = new Font("TimesRoman",Font.BOLD,36);

    public void paint(Graphics g) {
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Hello again!", 5, 25);
    }
}

/*
    1) Note the part that says extends java.applet.Applet—that’s the 
    part that says your applet class is a subclass of the Applet class.

    2)  Most of the time you need to make a class public only 
    if you want it to be visible to all the other classes in your Java program; 
    but applets, in particular, must be declared to be public.

    3) There are two things to know about the paint() method. First, note that this method is declared
    public, just as the applet itself was. The paint() method is actually public for a different
    reason—because the method it’s overriding is also public. If you try to override a method in your
    own class that’s public in a superclass, you get a compiler error, so the public is required.
    Secondly, note that the paint() method takes a single argument: an instance of the Graphics
    class. The Graphics class provides platform-independent behavior for rendering fonts, colors,
    and basic drawing operations

    4) Inside your paint() method, you’ve done three things:
    You’ve told the graphics object that the default drawing font will be the one contained
    in the instance variable f.
    You’ve told the graphics object that the default color is an instance of the Color class
    for the color red.
    Finally, you’ve drawn your "Hello Again!"" string onto the screen itself, at the x and y
    positions of 5 and 25. The string will be rendered in the default font and color
    
    5) You also can import an entire package of (public) classes by using an asterisk
    (*) in place of a specific class name. For example, to import all the classes in the awt
    package, you can use this line:
    import java.awt.*;
*/