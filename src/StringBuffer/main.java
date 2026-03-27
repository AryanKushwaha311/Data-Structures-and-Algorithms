package StringBuffer;

public class main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Aryan");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Kushwaha");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer(5);
        sb3.append("Naman Kuswhaha");
        System.out.println(sb3);

        //Methods

//        sb3.replace(0,5,"Kunal");
//        System.out.println(sb3);

        sb3.insert(0,"kunal and ");
        System.out.println(sb3);

        sb3.reverse();


        String str = sb3.toString();
        System.out.println(str);
    }
}
