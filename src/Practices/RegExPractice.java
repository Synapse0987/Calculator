import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExPractice{
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("w3school", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to W3School!");

        boolean results = matcher.find();
        if (results){
            System.out.printf("String found starting at %d until %d", matcher.start(), matcher.end());
        } else{
            System.out.println("Cannot find");
        }
    }
}