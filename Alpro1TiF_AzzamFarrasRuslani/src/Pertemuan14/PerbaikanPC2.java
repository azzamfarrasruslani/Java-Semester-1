package Pertemuan14;

//@author AZZAM FARRAS RUSLANI
public class PerbaikanPC2 {

    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index velue");
                i = 0;
            }
        }
    }
}
