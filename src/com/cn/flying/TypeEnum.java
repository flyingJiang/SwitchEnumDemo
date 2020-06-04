package com.cn.flying;

public enum TypeEnum {

    A("A", "AAA"),
    B("B", "BBB"),
    C("C", "CCC");

    private String name;

    private String value;

    TypeEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
