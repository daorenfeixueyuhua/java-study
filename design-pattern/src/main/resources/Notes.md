# 设计模式
    为了实现代码重用等等
## 1.创建型模式
    提供一种在创建对象的同时，隐藏创建逻辑的方法，而不是直接使用new运算符直接实例化对象
### 1.1工厂模式（Singleton Pattern）
#### 1.1.2 单例模式的几种实现
##### 1.1.2.1 懒汉式，线程不安全
        public class Singleton {  
                    private static Singleton instance;  
                    private Singleton (){}  
                  
                    public static Singleton getInstance() {  
                    if (instance == null) {  
                        instance = new Singleton();  
                    }  
                    return instance;  
                    }  
                }
##### 1.1.2.2 懒汉式，线程安全
        public class Singleton {  
            private static Singleton instance;  
            private Singleton (){}  
            public static synchronized Singleton getInstance() {  
            if (instance == null) {  
                instance = new Singleton();  
            }  
            return instance;  
            }  
        }
##### 1.1.2.3 饿汉式
        public class Singleton {  
            private static Singleton instance = new Singleton();  
            private Singleton (){}  
            public static Singleton getInstance() {  
            return instance;  
            }  
        }
##### 1.1.2.4 饿汉式
        public class Singleton {  
            private volatile static Singleton singleton;  
            private Singleton (){}  
            public static Singleton getSingleton() {  
            if (singleton == null) {  
                synchronized (Singleton.class) {  
                if (singleton == null) {  
                    singleton = new Singleton();  
                }  
                }  
            }  
            return singleton;  
            }  
        }                
##### 1.1.2.5 登记式/静态内部类
        public class Singleton {  
            private static class SingletonHolder {  
            private static final Singleton INSTANCE = new Singleton();  
            }  
            private Singleton (){}  
            public static final Singleton getInstance() {  
            return SingletonHolder.INSTANCE;  
            }  
        }
##### 1.1.2.6 枚举
        public enum Singleton {  
            INSTANCE;  
            public void whateverMethod() {  
            }  
        }
                                               
### 1.2抽象工厂模式
### 1.3单例模式
### 1.4建造者模式
### 1.5原型模式
## 2.结构型模式
    关注类和对象的组合
## 3.行为模式
    关注对象间的通信
## 4.J2EE模式
    特别注重表现层