package lamdaIntro;


//for a interface with single abstract method require class to run its method

interface FractionToPercentage
{
    double Ftopercentage(double fraction);
}

class Coversion implements FractionToPercentage
{
    @Override
    public double Ftopercentage(double fraction) {
        return fraction*100;
    }


}
public class PreLamda {
    public static void main(String[] args) {
        //Meth-1
        Coversion coversion=new Coversion();
        double ans=coversion.Ftopercentage(.453);
        System.out.println(ans);
        //Meth-2
        double ans2= new FractionToPercentage() {
            @Override
            public double Ftopercentage(double fraction) {
                return fraction*100;
            }
        }.Ftopercentage(.34267);
        System.out.println(ans2);
        //Meth-3
        //we can define lamda expreesion for the given interface
        FractionToPercentage fractionToPercentage=(x)->x*100;//this is defination
        //of method inside interface
        //and interface must have single abstract method so mapping is simple
        System.out.println(fractionToPercentage.Ftopercentage(.232432));


    }
}
