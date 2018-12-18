package src.main.pl.coderslab;

import org.apache.commons.io.EndianUtils;

public class Main1 {

    public static void main(String[] args) {

        short value1 = 1024;
        short value2;
        value2 = EndianUtils.swapShort(value1);
        System.out.println(value1);
        System.out.println(value2);
    }


}
