package com.company;

import by.belstu.it.kovalchuk.basejava.WrapperString;

public class Main {

    public static void main(String[] args) {

        // write your code here
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        WrapperString ff = new WrapperString() {
            String str1;

            public void delete(){
                this.str1 = null;
            }

            @Override
            public void replcae(String old, String newstr) {
                super.replcae(old, newstr);
            }
        };
    }
}
