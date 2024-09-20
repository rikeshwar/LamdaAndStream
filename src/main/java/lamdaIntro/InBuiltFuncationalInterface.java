package lamdaIntro;

import java.util.function.*;

class GetTwoRandom{
    public double a;
    public double b;

    public GetTwoRandom(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

public class InBuiltFuncationalInterface {
    public static void main(String[] args) {
        //for writting lamda expression user need not to first create interface
        //all the timr rather java has provided different combination of interface

        Function<Integer,Integer> f1=x->2*x-3;
        //Here first Integer is method parameter datatype and second Integer is return type

        //here Function is an inBuilt functional interface with method "apply"
        System.out.println(f1.apply(12));
        Predicate<String> result=(str)->str.equals("tiger");
        //take something but always return boolean


        //here String could be any Generic and refer the test(String) as
        //its return type is always boolean
        Function<Integer,String> f2=x-> x.toString();
        //take some value and return something

        System.out.println(result.test("kriya"));
        System.out.println(result.test("tiger"));
        System.out.println(f2.apply(22));
        Consumer<String> gradePrinter=grade-> System.out.println("Grade is "+ grade);
        //only take value and process it

        gradePrinter.accept("First");
        gradePrinter.accept("Second");

        Supplier<Double> randomValue=()->Math.random();
        //only return value
        System.out.println(randomValue.get());

        //With there four functional interface most of our requirement is fullfilled

        //There sre some other functional interface can take multiple input parameter
        BiFunction<Integer,Integer,Double> divider=(x,y)->(double)x/y;
        System.out.println(divider.apply(13, 4));

        BiConsumer<Integer,String> rollGrade=(roll,grade)->
                System.out.println("Roll no. "+roll +" got grade "+ grade);
        rollGrade.accept(3,"second");
        BiPredicate<Integer,Integer> NumberCompare=(a,b)->a>b;
        System.out.println(NumberCompare.test(3, 5));
        //There is no BiSupply as one can't return two thins but if realy need then take
        //help of class
        Supplier<GetTwoRandom> getTwoRandomSupplier=()->
                new GetTwoRandom(Math.random(),Math.random());
        System.out.println("Random one "+getTwoRandomSupplier.get().a);
        System.out.println("Random two "+getTwoRandomSupplier.get().b);



    }
}
