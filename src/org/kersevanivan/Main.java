package org.kersevanivan;

public class Main {

    public static void main(String[] args) {
	    MyString ourString = new MyString();

	    ourString.register( new StringObserver() );
		ourString.register( new StringObserver() );

	    ourString.setString("TEst");
    }
}
