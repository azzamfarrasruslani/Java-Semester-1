
package Pertemuan14;



class RangeErrorException extends Exception {
    public RangeErrorException(String message) {
        super(message);
    }
}

//@author AZZAM FARRAS RUSLANI
public class PerbaikanPC11 {
    public static void main(String[] args) {
        int position = 1;
        try {
            // Corrected the condition to throw an exception when position <= 0
            if (position <= 0) {
                throw new RangeErrorException("Position " + position + " is out of range.");
            }
        } catch (RangeErrorException e) {
            System.out.println("Range error: " + e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
