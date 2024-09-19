package lamdaIntro;

interface Mathop
{
    void operation(int x,int y,String sign);
}
interface Random{
    double randomNumber();
}
interface NumberPrinter
{
    void printer();
}
interface LastDigitFinder{
    int lastDigit(int x);
}

public class lamdaIntro {
    public static void main(String[] args) {
        Mathop mathop=(x,y,sign)->{
            if(sign.equals("+")) System.out.println(x+y);
            else if(sign.equals("-")) System.out.println(x-y);
            else if(sign.equals("*")) System.out.println(x*y);
            else if(sign.equals("/")) System.out.println(x/y);
            else System.out.println("operation sign is invalid");

        };
        mathop.operation(3,6,"+");
        mathop.operation(234,133,"-");
        mathop.operation(33,66,"$");

        Random random=()->Math.random();
        System.out.println(random.randomNumber());
        NumberPrinter numberPrinter=()->{
            for(int i=0;i<5;i++)
                System.out.print(i+" ");
        };
        numberPrinter.printer();
        LastDigitFinder lastDigitFinder=(x)->x%10;
        System.out.println(lastDigitFinder.lastDigit(1234));
        System.out.println(lastDigitFinder.lastDigit(3242));
    }




}
