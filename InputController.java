public class InputController {

    private final InputView inputView;
    private final OutputView outputView;


    public InputController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

	public Object getXX() {
		while (true) {
			try {
				return readXX();
			} catch (IllegalArgumentException exception) {
                outputView.printErrorMessage(exception);
            }
		}
	}

	private Object readXX() {
		String value = inputView.readXX();
		return XX.from(value);
	}
}
