package lesson8;

public class Lesson8 {
	public String name = "Lesson";
	public int index = 8;
	public String getName() {
		String hello = "Hello!";
		return name + index + hello;
	}
	public void printHelloWorld() {
		System.out.println("Hello, world!");
		return;
	}
	public void printTillHello(String[] texts, int stopCode) {
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
			if (texts[i].equals("Hello")) {
				System.out.println(stopCode);
				return;
			}
		}
	}
	public void printName() {
		String name = getName();
		System.out.println(name);
	}
}
