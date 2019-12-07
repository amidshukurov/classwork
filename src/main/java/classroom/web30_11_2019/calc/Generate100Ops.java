package classroom.web30_11_2019.calc;

import classroom.web11_28_19.database.DbOps;

import java.util.Arrays;
import java.util.List;

public class Generate100Ops {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            generate();
        }
    }
   public static void generate(){
       List<String> ops = Arrays.asList("plus", "minus", "mult", "div");
       int op1 = (int) (Math.random()*100);
       int op2 = (int) (Math.random()*100);
       String op = ops.get((int)Math.random()*4);
        int result = oper(op1, op2, op);
       int user = (int)(Math.random()*10);
       DbOps.insert_op(op1, op2, op, result, user);
    }


    static int oper(int op1, int op2, String ops) {
        int r = -13;
        switch (ops) {
            case "plus" : r=op1 + op2; break;
            case "minus": r=op1 - op2; break;
            case "mult" : r=op1 * op2; break;
            case "div"  : r=op1 / op2; break;
        }
        return r;
    }
}
