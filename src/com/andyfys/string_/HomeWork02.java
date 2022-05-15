package com.andyfys.string_;


/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        User user = new User("jack", "123456", "1258551550@qq.com");
        try {
            user.signIn();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class User {
    String name;
    String pwd;
    String email;

    public User(String name, String pwd, String email) {
        this.name = name;
        this.pwd = pwd;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getEmail() {
        return email;
    }

    public void signIn() {
//        if (!(name.length() > 1 && name.length() < 5 && isDigital(pwd) && pwd.length() == 6 && email.lastIndexOf(".") > email.lastIndexOf("@") && email.lastIndexOf("@") > 0)) {
//            throw new RuntimeException("注册不成功");
//        } else {
//            System.out.println("注册成功");
//        }
        if(!(name.length() > 1 && name.length() < 5)){
            throw new RuntimeException("名字长度应为2或3或4");
        }
        if(!(isDigital(pwd) && pwd.length() == 6)){
            throw new RuntimeException("密码长度应为6，且全为数字");
        }
        if(!(email.lastIndexOf(".") > email.lastIndexOf("@") && email.lastIndexOf("@") > 0)){
            throw new RuntimeException(".应该在@的位置后面");
        }
        System.out.println("注册成功！！！！！");
    }



    public boolean isDigital(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
        // try-catch需要创建无用变量，浪费资源
//        try {
//            Integer i1 = new Integer(pwd);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }

    }
}