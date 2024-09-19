package LAMDA_EXPRESSION;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class student{
    String name;
    int mark;
    student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
}

public class object_lamda {
    public static void main(String args[])
    {
        student[] s=new student[3];
        s[0]=new student("rahim",30);
        s[1]=new student("krishna",29);
        s[2]=new student("patrik",45);

        Arrays.sort(s,(a, b)->{
            return a.mark-b.mark;
        });
        for(student x:s)
            //System.out.println(x);//this will print address logical error

            System.out.println(x.name+"  "+x.mark);


    }
}
