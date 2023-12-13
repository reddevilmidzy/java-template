import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readXX() {
        System.out.println("blah blah");
        String value = readLine();
        System.out.println();
        return value;
    }

    protected String readLine() {
        return Console.readLine();
    }
}
