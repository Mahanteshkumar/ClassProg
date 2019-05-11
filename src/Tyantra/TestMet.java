package Tyantra;

public class TestMet {

	int methodOfA() {
		return(true?null:0);//nullpointerexception
	}
	public static void main(String[] args) {
		TestMet t=new TestMet();
		t.methodOfA();
	}

}
