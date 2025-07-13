public class J20 {
    //目前观看韩顺平java课程第20节--转义字符
    public static void main(String[] args) {
        /*
         * Java常用转义字符
         * 1.\t 制表位(tab)，实现对齐的功能
         * 2.\n 换行符
         * 3.\\ 一个\
         * 4.\" 一个"
         * 5.\' 一个'
         * 6.\r 回车
         * */
        System.out.println("每两个J之间存在一个制表位J\tJ\tJ\tJ");
        System.out.println("每两个J之间存在一个换行符J\nJ\nJ\nJ");
        System.out.println("现在你需要输出一个斜杠\\");
        System.out.println("现在你需要输出一个双引号\"");
        System.out.println("现在你需要输出一个单引号\'");
        System.out.println("每两个J之间存在一个回车符J\rJ\rJ\rJ");

        //执行后可以看出\n可以做到换行后继续输出，但是回车符\r不可以继续输出了，为什么？
        //1.输出第一个J
        //2.\r表示回车，指打印的游标从头开始，所以四个J只显示了一个，可以换成JAVA试试呢？

    }
}
