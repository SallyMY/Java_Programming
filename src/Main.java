import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg)  {


        int x = 6;
        int y = 3;
        int z = 12;

        int w = method1(x,y,z);

        System.out.println("w" + " "+ w);
    }
    public static int method1 (int y, int z, int x)

    {
        return (x * z)/y;
    }

}