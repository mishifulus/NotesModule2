package com.example.ejemplo1.lombok;

import java.util.Objects;

public class WithoutLombok {
    int field1;
    int field2;
    int field3;
    int field4;

    public WithoutLombok(int field1, int field2, int field3, int field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public int getField4() {
        return field4;
    }

    public void setField4(int field4) {
        this.field4 = field4;
    }

    @Override
    public String toString() {
        return "WithoutLombok{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                ", field3=" + field3 +
                ", field4=" + field4 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WithoutLombok that = (WithoutLombok) o;
        return field1 == that.field1 && field2 == that.field2 && field3 == that.field3 && field4 == that.field4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2, field3, field4);
    }
}
