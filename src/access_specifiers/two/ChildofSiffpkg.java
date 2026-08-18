package access_specifiers.two;

import access_specifiers.one.Parent;

public class ChildofSiffpkg extends Parent{

    static void main() {

        Parent p =  new Parent();
       // p.m1();//cause this is the default method caan be only accessed within  the samempkg class
        ChildofSiffpkg obj = new ChildofSiffpkg();
//        obj.m1();
        obj.m2();
    }

}
