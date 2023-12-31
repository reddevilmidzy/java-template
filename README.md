# java-template

**코드 템플릿**

* **Controller**
	* [Controller](#controller)
	* [InputController](#inputcontroller)
* **View**
	* [InputView](#inputview)
	* [OutputView](#outputview)
	* [number comma](#comma)
 	* [iterator](#iterator) 
* **Constant**
	* [ErrorMessage](#errormessge)
* **Model**
	* [equals](#equals)
	* [hashCode](#hashcode)
	* [map foreach](#map-foreach)
	* [list foreach](#list-foreach)
 	* [enum static method](#valueof)
* **Validate**
	* [Regax](#regax)
	* [Separator](#separator)
	* [Range](#range)



<br>

## 구현 기능 목록 템플릿

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
```

<br>

```java
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

```

<br>

## InputView

```java



    public String readXX() {
        System.out.println("blah blah");
        String value = readLine();
        System.out.println();
        return value;
    }

    protected String readLine() {
        return Console.readLine();
    }

```

<br>

## OutputView

```java


    public static final String ERROR_FORM = "[ERROR] %s%n";

    public void printErrorMessage(Throwable throwable) {
        System.out.printf(ERROR_FORM, throwable.getMessage());
	System.out.println();
    }

```

<br>

## ErrorMessge

```java


    INVALID_XX("유효하지 않은 값입니다."),

    RETRY_INPUT("다시 입력해 주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

```

<br>

## Regax

```java
public static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]+$");
public static final Pattern KOREAN_AND_ENGLISH_PATTERN = Pattern.compile("^[ㄱ-ㅎ가-힣A-Za-z]+$");
```

<br>

## Separator

```java
private static void validate(String value) {
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (value.startsWith(",") || value.endsWith(",")) {
            throw new IllegalArgumentException();
        }
        if (value.contains(",,")) {
            throw new IllegalArgumentException();
        }
    }
```

<br>

## Range

```java
private static void validate(String value) {
	try {
		if (Integer.parseInt(value) < 0) {
			throw new IllegalArgumentException();
		}
	} catch (NumberFormatException exception) {
		throw new IllegalArgumentException();
	}
}
```

<br>

## equals 

```java
@Override
public boolean equals(Object obj) {
	if (this == obj) {
            return true;
        }
        if (!(obj instanceof X target)) {
            return false;
        }
	return // TODO:
}
```

<br>

## hashCode

```java
@Override
public int hashCode() {
	return Objects.hash(vo);
}
```

<br>

## comma

```java
public static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("###,###");

private String formatted(Integer value) {
        return NUMBER_FORMAT.format(value);
    }
```

<br>

## iterator

```java
private void printValues(Iterator<Crew> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName());
            if (iterator.hasNext()) {
                System.out.print(" : ");
            }
        }
        System.out.println();
    }
```

<br>


## map forEach

```java
public void forEach(BiConsumer<? super K, ? super V> action) {
        map.forEach(action);
    }
```

<br>

## list forEach

```java
public void forEach(Consumer<? super T> action) {
	list.forEach(action);
}
```

<br>

## valueof

```java

    public static ENUM_TYPE valueOfName(String name) {
        return Arrays.stream(values())
                .filter(s -> s.cmd.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.));
    }
```
