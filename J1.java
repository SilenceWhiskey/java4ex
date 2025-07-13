//公开的J1类下，存在公开的静态main方法，无需return

public class J1 {
    //每一个java有且只有一个public class类
    //class类的名字一般首字母大写
    //java严格校验字母大小写
    public static void main(String[] args) {
        //接下来，我们在J1这个class中声明了一个名为main的方法，并且为这个方法指定了入参
        //public static void分别表示这个方法是一个公开的、静态的、无需返回参数的方法
        //每一行代码需要使用英文分号作为结束;
        //同时，java规定，每个类的psvm是固定入口，java总是从main方法开始执行

        //需要注意，java源码本质上是一个txt文本文件
        //需要先用javac这个程序把J1.java[编译]成字节码文件J1.class，然后使用java命令执行这个字节码文件
        //javac J1.java-->J1.class-->java J1.class[run]
        //在上面这一步，实际javac.exe是[编译器]，java.exe是作为JVM虚拟机存在

        /*
        * 需要注意，一个.java文件有且只有一个public class，且这个唯一的public class必须和.java文件名一致
        * */

        //修改后的.java源文件需要重新[编译]，生成新的.class后使用JVM执行才能生效。

        //也可以将main方法写在非public class中，并指定运行非public class，若如此做，则从main方法开始执行。
        System.out.println("hello java");
    }
}
