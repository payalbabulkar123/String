@FunctionalInterface
interface Exp{
void show();
default void data1(){
    System.out.println("data....");
}
}
class _81Demo {
    public static void main(String[] args) {
    Exp imp =()->System.out.println("we are child");
    imp.show();
    imp.data1();
    System.out.println(imp);
}
}