package by.belstu.it.perkal.basejava;

import java.util.Objects;
/**
 * @author Anastasia
 * @version 1.0.0.0
 */
public class WrapperString {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }

    public WrapperString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "WrapperString { s = " + str + "}";
    }

    public void replace (char oldchar, char newchar){
        str = str.replace(oldchar, newchar);
    }
    public  void delete(char c) {
        setStr(getStr().replace(c, '\0'));
    }



}
