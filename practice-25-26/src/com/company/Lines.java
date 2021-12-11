package com.company;

import java.util.Objects;

public class Lines {

    private String num;
    private String name;

    public Lines(String id, String name) {
        this.num = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Lines line = (Lines) o;
        return Objects.equals(num, line.num) && Objects.equals(name, line.name);
    }


    public String getID() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}
