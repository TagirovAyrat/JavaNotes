package ru.lambdabasic;

public class LambdaBasic {
    public static void main(String[] args) {
        StringFunc sf = str -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        String inStr = "Ламбда выражения просто офигенно";
        String result = changeStr(sf, inStr);
        System.out.println(result);
        System.out.println(changeStr(s -> s.replace(" ", "-"), inStr));
        System.out.println(changeStr(s -> s.toUpperCase(), inStr));
        try {
            changeStr(s -> {
                throw new IllegalArgumentException(String.format("Исключение внутри Lambda %s", s));
                    }, inStr
            );
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (numTest(MyPredicate::isPrime, 17)) {
            System.out.println("17 - простое число");
        }
        if (numTest(MyPredicate::isPositive, 12)) {
            System.out.println("12 - положительное число");
        }
        if (numTest(MyPredicate::isEvent, 16)) {
            System.out.println("16 - четное число");
        }

        MyIntNum test = new MyIntNum(10);
        MyIntNum test1 = new MyIntNum(16);
        if (numTest(test::isFactor, 5)) {
            System.out.println("5 является делителем " + test.getV());
        }
        if (numTest(test1::isFactor, 8)) {
            System.out.println("8 является делителем " + test1.getV());
        }
        MyFunc runnable = MyClass::new;
        System.out.println(runnable.func("Тестим"));

    }

    static String changeStr(StringFunc fc, String s) {
        return fc.func(s);
    }

    static boolean numTest(IntPredicate p, int v){
        return p.test(v);
    }

}
