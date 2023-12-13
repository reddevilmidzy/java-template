# java-template

**코드 템플릿**

* [Controller](https://github.com/reddevilmidzy/java-template/blob/main/Controller.java)
* [InputController](https://github.com/reddevilmidzy/java-template/blob/main/InputController.java)
* [InputView](https://github.com/reddevilmidzy/java-template/blob/main/InputView.java)
* [OutputView](https://github.com/reddevilmidzy/java-template/blob/main/OutputView.java)
* [Model](https://github.com/reddevilmidzy/java-template/blob/main/Model.java)


**구현 기능 목록 템플릿**

```text
# 구현 기능 목록

## 기능


## 입력


## 출력


## 예외

```

<br>

## Controller

```java
private final InputController inputController;
private final OutputView outputView;

public Controller(InputController inputController, OutputView outputView) {
    this.inputController = inputController;
    this.outputView = outputView;
}

public void run() {
}
```

<br>

## InputController

```java
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
```

<br>

## InputView

```java

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
```

<br>

## OutputView

```java
public class OutputView {

    public static final String ERROR_FORM = "[ERROR] %s%n";

    public void printErrorMessage(Throwable throwable) {
        System.out.printf(ERROR_FORM, throwable.getMessage());
    }
}
```

<br>

