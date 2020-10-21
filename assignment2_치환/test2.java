public class test2 {
    public static String getHtmlStrCnvr(String srcString) {
        String tmpString = srcString;
        tmpString = tmpString.replaceAll("&lt;", "<");
        tmpString = tmpString.replaceAll("&gt;", ">");
        tmpString = tmpString.replaceAll("&#38;", "&");
        tmpString = tmpString.replaceAll("&#x27;", "\'");
        tmpString = tmpString.replaceAll("&quot;", "\"");
        tmpString = tmpString.replaceAll("&#35;", "#");
        tmpString = tmpString.replaceAll("&#40;", "(");
        tmpString = tmpString.replaceAll("&#41;", ")");
        tmpString = tmpString.replaceAll("&#x2F;", "/");
        return tmpString;
    }

    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}