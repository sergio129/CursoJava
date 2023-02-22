import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]) {
        /*
        tipos primitivos enteros: byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valor minino del byte: " + numeroByte);
        System.out.println("Valor minino del byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minino del byte: " + Byte.MIN_VALUE);

        Short numeroShort=10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor Maximo numeroShort = " + Short.MAX_VALUE);
        System.out.println("Valor Minimo numeroShort = " + Short.MIN_VALUE);

        int numeroInt=10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor Maximo numeroInt = " + Integer.MAX_VALUE);
        System.out.println("Valor Minimo numeroInt = " + Integer.MIN_VALUE);


        long numeroLong=10;
        System.out.println("numeroLong = " + numeroInt);
        System.out.println("Valor Maximo numeroLong = " + Long.MAX_VALUE);
        System.out.println("Valor Minimo numeroLong = " + Long.MIN_VALUE);

    }
}
