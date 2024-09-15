package org.example.code_specifications;

/**
 * 代码格式演示代码
 */
public class CodeSpecifications {
    public static void main(String[] args) {
        Integer i = 1;
        if (check(i)) {
            System.out.println("这个数字等于1");
        } else {
            System.out.println("这个数字不等于1");
        }
    }

    /**
     * 判断输入是否等于 1
     *
     * @param integer 输入值
     * @return 判断结果
     */
    public static Boolean check(Integer integer) {
        if (integer.equals(1)) {
            return true;
        }
        return false;
    }
}
