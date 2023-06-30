package com.liushang.test;

/**
 * @author shang_liu
 * @Description
 * @WeChat liushang
 * @Date 2023/6/30 17:12
 */
public class TestString {

    public static void main(String[] args) {

        // 在堆中创建字符串对象”ab“
        // 将字符串对象”ab“的引用保存在字符串常量池中
        String aa = "ab";
        // 直接返回字符串常量池中字符串对象”ab“的引用
        String bb = "ab";
        System.out.println(aa == bb);// true

        // 在堆中创建字符串对象”Java“
        // 将字符串对象”Java“的引用保存在字符串常量池中
        String s1 = "Java";
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s2 = s1.intern();
        // 会在堆中在单独创建一个字符串对象
        String s3 = new String("Java");
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s4 = s3.intern();
        // s1 和 s2 指向的是堆中的同一个对象
        System.out.println(s1 == s2); // true
        // s3 和 s4 指向的是堆中不同的对象
        System.out.println(s3 == s4); // false
        // s1 和 s4 指向的是堆中的同一个对象
        System.out.println(s1 == s4); //true

        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false

        final String str6 = "str";
        final String str7 = "ing";
        // 下面两个表达式其实是等价的
        String c = "str" + "ing";// 常量池中的对象
        String d = str6 + str7; // 常量池中的对象
        System.out.println(c == d);// true
    }
}
