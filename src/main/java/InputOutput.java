import java.util.Scanner;

public class InputOutput {
    private Scanner scanner;
    public void startOutput() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public String numberInput() {
        return scanner.nextLine();
    }
}
