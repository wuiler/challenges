public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //String s = squeeze("hola");
        String s = squeeze("holla");
        System.out.println(s);
        String s1 = squeeze("hello wooorld"); // -> "helo world"
        System.out.println(s1);
        String s2 = squeeze("hello wooorld"); // -> "helo world"
        System.out.println(s2);
        String s3 = squeeze(1233344556); // -> "helo world"
        System.out.println(s3);
        //squeeze("hola") // -> "hola"
        //squeeze("hello") // -> "helo"
        //squeeze("hello wooorld") // -> "helo world"
    }

    public static String squeeze(String text) {
        StringBuffer sb = new StringBuffer();
        String ctl = "";

        for(int i=0; i<text.length();i++) {
            String c = String.valueOf(text.charAt(i));
            
            if (!c.equals(ctl)) { 
                sb.append(c);
                ctl=c;
            }            
        }

        return sb.toString();

    }


    public static String squeeze(Object text) {
        
        return squeeze(String.valueOf(text));

    }

}