# Setting up environment

First, you set up an environment so that your Java-capable browser can find your HTML files
and your applets. Much of the time, you’ll keep your HTML files and your applet code in the
same directory. Although this isn’t required, it makes it easier to keep track of each element. In
this example, you use a directory called HTML that contains all the files you’ll need.

# Compile the applet

compile the applet just as you did the application, using javac, the Java compiler

- javac HelloWorldApplet.java

Just as for applications, you should now have a file called HelloWorldApplet.class in your
HTML directory.

# Include appplet in a web page

To include an applet in a Web page, you refer to that applet in the HTML code for that Web
page. Here, you create a very simple HTML file in the HTML directory

# View the applet

Now, you’re ready for the final test—actually viewing the result of your applet. To view the
applet, you need one of the following:

- A browser that supports Java applets, such as Netscape 2.0
- The appletviewer application, which is part of the JDK. The appletviewer is not a
  Web browser and won’t enable you to see the entire Web page, but it’s acceptable for
  testing to see how an applet will look and behave if there is nothing else available.
