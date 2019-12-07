package classroom.web11_28_19.history;

public class Calculate {

    public int calc (String op, int a, int b) {
        int result;
        if(op.equals("add") ) {
            result = a+b;
        } else if (op.equals("sub") ) {
            result = a - b;
        } else if (op.equals("mult")) {
            result = a*b;
        } else {
            result  = a/b;
        }

        return result;

    }

}
