package test;

public class MyClass
{
    enum myChar
    {
        A,
        B
    }
//    int i = 5;
//    //variable
//    String str = "Hello World";


//    public MyClass(){
////      i = 5;
//        //constructor
//    }

    public static void main (String [] args)
    {
        MyClass myClass = new MyClass();
//        myClass.ifElseCheck();
        myClass.switchCase();

//        MyClass myClass = new MyClass();
//        myClass.stringCheck();

    }

//    public void ifElseCheck(){
//        boolean flag = false;
//        String str = "myStr";
//
//        if (str.equalsIgnoreCase("myStr") || flag){
//            System.out.println("i'm in if");
//        }
//        else {
//            System.out.println("i'm in else");
//        }
//    }
//
//   public void forLoopCheck(){
//        for (int i = 0; i <5; i++){
//            System.out.println("i is " +i);
//            if (i == 3){
//                continue;
//            }
//        }
//   }
//
//    public void forEachLoopCheck(){
//        String[] myArray = {"a", "b","c"};
//
//        for (String str : myArray ){
//            System.out.println(str);
//            if (str.equalsIgnoreCase("b")){
//                break;
//            }
//
//        }
//    }
//
//    public void whileLoopCheck(){
//        int i = 6;
//        while (i > 0) {
//        System.out.println("i is " + i);
//        i--;
//            if (i==3){
//                break;
//            }
//        }
//    }

    public void switchCase() {
//        String str = "c";
        myChar nowChar = myChar.B;
        switch (nowChar) {
            case A:
                System.out.println(nowChar);
                break;
            case B:
                System.out.println(nowChar);
                break;
        }
    }




//    public void stringCheck(){
//        str = str.concat(" ! ! ");
//        System.out.println(str);
//        str = str.toUpperCase();
//        System.out.println(str);
//        str = str.substring(0, 5);
//        System.out.println(str);
//        boolean flag = str.equalsIgnoreCase("HELLO");
//        System.out.println(flag);
//
//        str = "5";
//        int i = Integer.parseInt(str);
//        System.out.println(i);
//
//        i = 6;
//        str = String.valueOf(i);
//        System.out.println(str);
//
////        str = "1";
////        int i = Integer.parseInt(str);
////        System.out.println(i);
//    }
////
//////    public  MyClass(int i){
//////        i = i;
////
////    }
//
//
//    public  MyClass initialize() {
//         i = 6;
//        return this;
//    }
}
