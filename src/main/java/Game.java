public class Game {
    private InputOutput inputOutput = new InputOutput();
    private Validate validate = new Validate();
    private Number number = new Number();
    private BaseballUtil baseballUtil = new BaseballUtil();

    public void start() {
        while (true) {
            String random = number.create();
            while (true) {
                inputOutput.startOutput();
                String input = inputOutput.numberInput();
                if (!validate.numberValidate(input)) {
                    throw new IllegalArgumentException();
                }
                inputOutput.hitterResultOutput(baseballUtil.ball(random, input),
                        baseballUtil.strike(random, input));
                if (baseballUtil.strike(random, input) == 3) {
                    inputOutput.endOutput();
                    break;
                }
            }
            inputOutput.restartOutput();
            String yesOrNo = inputOutput.yesOrNoInput();
            if (!validate.yesOrNoValidate(yesOrNo)) {
                throw new IllegalArgumentException();
            }
            if (yesOrNo.equals("2")) {
                break;
            }
        }

    }
}
