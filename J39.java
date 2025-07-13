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

        //整型常量默认为int，long常量后面必须加l或者L
        int a = 1;
        System.out.println("int类型变量a的值是:"+a);
        //这句话是会报错的 int b = 1L; 因为1L占用8字节不兼容int类型变量b
        long b = 1L;
        System.out.println("long类型变量b的值是:"+b);

    }
}
