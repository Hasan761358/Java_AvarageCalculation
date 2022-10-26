import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum=0,nelements=0,avarage;

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number=sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i%12==0){
                nelements++;
                sum+=i;
            }
       } avarage=sum/nelements;
        System.out.println("Ortalama : "+ avarage);

    }
}