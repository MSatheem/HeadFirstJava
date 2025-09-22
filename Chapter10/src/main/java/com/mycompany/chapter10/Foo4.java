/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter10;

/**
 *
 * @author sathe
 */
public class Foo4 {
    static final int x = 12;
    
    int y = 28;
    
    public void go() {
        System.out.println(x);
    }
    
    public void go(final int x) {
        System.out.println(x);
    }
    
    public static void goes(final int x) {
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Foo4 f = new Foo4();
        f.go();
        
        f.go(50);
        Foo4.goes(90);
    }
}
