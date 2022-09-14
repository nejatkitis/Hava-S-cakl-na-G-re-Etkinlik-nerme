import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        int tem;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava kaç derece ?");
        tem = input.nextInt();
        if(tem<=5){
            System.out.println("Haydi kayak yapmaya");
        } else if (tem<25) {
            if (tem<15){
                System.out.println("Sinemaya ne dersin ?");
            }
            if (tem>10){
                System.out.println("Piknik için güzel bir gün");
            }
        }
        else {
            System.out.println("Denize havası sana iyi gelecek");
        }
    }
}
