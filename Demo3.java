public class Demo3 {
    public static void main(String[] args) {
        int a1=123;
        int a2=456;
        int a3=7890;
        String color="\033[32m";
        String reset="\033[0m";

        System.out.printf("%s(%d)%s %d-%d\n",color,a1,reset,a2,a3);
    }
    
}
