public class J39 {
    //目前观看韩顺平java课程第39节--数据类型
    public static void main(String[] args) {
        /*
        * 1byte = 8bit
        * 数据类型
        *   基本数据类型
        *       数值型
        *           整数类型
        *               byte1个字节
        *               short2个字节
        *               int4个字节
        *               long8个字节
        *           浮点类型
        *               float4个字节
        *               double8个字节
        *       字符型
        *           char2个字节
        *       布尔型
        *           boolean1个字节
        *   引用数据类型
        *       类class
        *       接口interface
        *       数组[]
        * */

        /*
        * java的整型有固定的范围和字段长度，不受具体的操作系统影响（运行在JVM虚拟机）
        * 以保证java程序的可移植性
        * */

        //整型常量（具体的值）默认为int，long常量后面必须加l或者L
        int a = 1;
        System.out.println("int类型变量a的值是:"+a);
        //这句话是会报错的 int b = 1L; 因为1L占用8字节不兼容int类型变量b
        long b = 1L;
        System.out.println("long类型变量b的值是:"+b);
/*
* 与整型类似，java的浮点类型也有固定的范围和长度，不受具体的操作系统影响
* java的浮点型常量（具体的值）默认为double类型，声明float型常量需要加f或F
* 两种表示形式：
* --十进制数形式：5.12、512.0f、.512f（必须有小数点）
* --科学计数法形式：5.12e2[]、5.12E-2[]
* */

        //通常情况需要使用double类型s
    }
}
