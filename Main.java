import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        Delimiters e = new Delimiters("<q>", "</q>");
        System.out.println(e.getDelimitersList(tokens2));
        String open = "<sup>", close = "</sup>";
        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for(String s : delims) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));
        
        ArrayList<String> delimiters2 = new ArrayList<String>();
        String[] delims2 = {open, close, close, open};
        for(String s : delims2) delimiters2.add(s);
        System.out.println(d.isBalanced(delimiters2));
        
        ArrayList<String> delimiters3 = new ArrayList<String>();
        String[] delims3 = {close};
        for(String s : delims3) delimiters3.add(s);
        System.out.println(d.isBalanced(delimiters3));
        
        ArrayList<String> delimiters4 = new ArrayList<String>();
        String[] delims4 = {open, open, close};
        for(String s : delims4) delimiters4.add(s);
        System.out.println(d.isBalanced(delimiters4));
    }
}