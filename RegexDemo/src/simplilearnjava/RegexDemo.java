package simplilearnjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexDemo {
	public static void main(String args[])
    {

        Pattern pattern = Pattern.compile("is");

        Matcher m = pattern.matcher("Regex is Regular Expression");

        while (m.find())

            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
}
}
