package com.soft1851.alibaba.study.week;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/26
 **/
public class Student {
    public static void main(String[] args) {
        System.out.println("这是一个简单的java应用程序");
        Student student=new Student();
        student.speak("We are students");
    }

    private void speak(String s) {
        System.out.println(s);
    }

}