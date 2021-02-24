package by.belstu.it.perkal;

import by.belstu.it.perkal.basejava.WrapperString;

public class Main {

    public static void main(String[] args) {
        //TODO Empty project 2.0

        TestFunction obj = new TestFunction();
        int i = 0;
        while (i < 5) {
            Print(obj);
            i++;
        }
        for (int count = 0; count < 4; count++) {
            System.out.println("Counter " + count);
        }

        WrapperString ws = new WrapperString("lalalalalala");
        ws.replace('l', 'a');

        System.out.println(ws.getStr());
        System.out.println(ws);
    }

    private static void Print(TestFunction obj) {
        System.out.println(obj.getValue());
    }
}
