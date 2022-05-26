package br.ufes.inf.jpalmeida.hello;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
     // using default font standard.flf, obtained from maven artifact
     String asciiArt1 = FigletFont.convertOneLine(args[0]);
     System.out.println(asciiArt1);
    }
}
