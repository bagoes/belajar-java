package com.bagoes.javafundamental.accessmodifier.package2;

import com.bagoes.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {

    @Override
    protected void methodC() {
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}