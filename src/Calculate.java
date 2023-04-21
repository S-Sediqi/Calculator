import java.text.DecimalFormat;

public class Calculate {

    private static final String PLUS = "+";
    private static final String MINS = "-";
    private static final String MULT = "*";
    private static final String DIVD = "/";
    protected String input;

    protected Calculate(String input) {
        this.input = input;
    }

    private String getInput() {
        return this.input;
    }

    private String getOperation() {
        String s = getInput();
        String a = "";
        if (s.contains(PLUS)) {
            a = PLUS;
        } else if (s.contains(MINS)) {
            a = MINS;
        } else if (s.contains(MULT)) {
            a = MULT;
        } else if (s.contains(DIVD)) {
            a = DIVD;
        }
        return a;
    }

    private String calculateInput(String op) {
        String input = getInput();
        String answer = "";
        double d = 0.0;
        int f_index = input.indexOf(op);
        if (f_index == -1) {
            return "no operation found";
        }
        if (f_index == 0) {
            return "false entry";
        }
        if (f_index >= 1) {
            int s_index = input.indexOf(op, f_index + 1);
            if (s_index >= 1) {
                return "only one operation is allowed";
            }
            if (s_index == -1) {
                String a = input.substring(0, f_index);
                String b = input.substring(f_index + 1, input.length());
                if (b.length() == 0) {
                    return "enter a second parameter";
                } else {
                    double d1 = Double.parseDouble(a);
                    double d2 = Double.parseDouble(b);
                    if (op.equals(PLUS)) {
                        d = doubleAdd(d1, d2);
                    }
                    if (op.equals(MINS)) {
                        d = doubleSubtract(d1, d2);
                    }
                    if (op.equals(MULT)) {
                        d = doubleMultiply(d1, d2);
                    }
                    if (op.equals(DIVD)) {
                        d = doubleDivide(d1, d2);
                    }
                    answer = toFormat(d);
                    // answer = "" + sum;
                }
            }
        }
        return answer;
    }

    private String getAnswer() {
        String answer = calculateInput(getOperation());
        return answer;
    }

    private String toFormat(double number) {
        String answer = "";
        if (number == 0) {
            return "" + 0;
        } else if (Math.abs(number) < 0.0001) {
            return "" + 0;
        } else {
            DecimalFormat df = new DecimalFormat("#.####");
            answer = df.format(number);
        }
        answer = answer.replace(',', '.');
        return answer;
    }

    private double doubleAdd(double a, double b) {
        double answer = a + b;
        return answer;
    }

    private double doubleSubtract(double a, double b) {
        double answer = a - b;
        return answer;
    }

    private double doubleMultiply(double a, double b) {
        double answer = a * b;
        return answer;
    }

    private double doubleDivide(double a, double b) {
        double answer = a / b;
        return answer;
    }

    public String toString() {
        return getAnswer();
    }
}
