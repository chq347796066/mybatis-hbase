package com.farben.chen.server;

public class SingleDemo {

    private volatile static SingleDemo instance;
    private  SingleDemo(){
        if(instance!=null){
            throw new RuntimeException("SingleDemo不允许通过反射创建");
        }
    }


    public static SingleDemo getInstance(){
        if(instance==null){
            synchronized (SingleDemo.class){
                if(instance==null){
                    instance=new SingleDemo();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) throws Exception {
        SingleDemo singleDemo=SingleDemo.getInstance();
        System.out.println(singleDemo);
        Class clazz=SingleDemo.class;
        Object in = clazz.newInstance();
        System.out.println(in);

    }



}
