public class Demo6a{
    public static void main(String[] args) {
        String x1 = "[\t5";
        String x2 = "0%\t]";
        String color1="\033[32m",color2="\033[31m";
        String RESET="\033[0m";

        System.out.printf("%s%s%s%s%s%s\n ",color1,x1,RESET,color2,x2,RESET);

    }
}