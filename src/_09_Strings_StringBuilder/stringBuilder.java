package _09_Strings_StringBuilder;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        sb.append(1);
        sb.insert(5,",");
        sb.replace(0,5,"Aryan");
        sb.delete(4,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


    }
}
