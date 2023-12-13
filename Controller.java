public class VendingMachineController {

    private final InputController inputController;
    private final OutputView outputView;

    public Controller(InputController inputController, OutputView outputView) {
        this.inputController = inputController;
        this.outputView = outputView;
    }

    public void run() {
    }
}
