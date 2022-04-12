package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        int number =12;// if there is only one statement in the block===> it is not adviced

        String result ="";
        if (number==1)
            result="january";
        else if (number==2)
            result="february";
        else if (number==3)
            result="march";
        else if (number==4)
            result = "April";
        else if (number==5)
            result = "may";
        else if (number==6)
            result = "June";
        else if (number==7)
            result="july";
        else if (number==8)
            result="August";
        else if (number==9)
            result = "September";
        else if (number==10)
            result = "October";
        else if (number==11)
            result = "November";
        else
            result="December";
        System.out.println(result);
    }
}
