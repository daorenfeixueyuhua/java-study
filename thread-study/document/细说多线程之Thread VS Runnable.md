# 细说多线程之Thread VS Runnable

## 前页
    

## 1.Thread VS Runnable
### 1.1.继承Thread类：
    class MyThread extends Thread{
            ....
            @Override
            public void run(){
                    ...
                }
            }
            MyThread mt = new MyThread();   // 创建线程
            mt.start();                     // 启动线程

    
### 1.2.实现Runnable接口
    class MyThread implements Runnable{
                ...
                @Override
                public void run(){
                    ...
                }
            }
            MyThread mt = new MyThread();
            Thread td = new Thread(mt);
            td.start();
        
### 1.3.两种方式的比较
    Runnable方式可以避免thread方法由于单继承特性带来的缺陷
    
    Runnable的代码可以被多个线程(Thread实例)共享，适合于多线程处理同一资源的情况
     
### 1.4.引用探秘
    

## 2.线程的生命周期和守护线程

### 2.1.线程的生命周期
                   杜塞状态
    创建------>就绪------>运行状态------>终止
    创建：new
    就绪：start()
    杜塞：sleep()
    运行：run()
    终止：stop()

### 2.2.守护线程的理论知识
    用户线程：前台运行
    守护线程：运行在后台，为其他用户线程服务
        特点：一旦所有用户线程都结束运行，守护线程会随JVM一起结束工作
        应用：数据库连接池中的检测线程
            JVM虚拟机启动后的检测线程
            垃圾回收线程
    设置守护线程：
        可以通过调用Thread类的setDaemo(true)方法来设置当前的线程为守护线程
    注意事项：
        setDaemon(true)必须在start()方法前调用，否则会抛出IllegalThreadStateException异常
        在守护线程中产生的新线程也是守护线程
        不是所有的任务都可以分配给守护线程来执行，比如读写，计算逻辑
        

### 2.3.守护线程的代码实例

### 2.4.使用jstack生成线程快照
    jstack
    作用：生成jvm当前时刻线程的快照（threaddump，即当前进程中所有线程的信息）
    目的：帮助定位程序问题出现的原因，入长时间停顿，CPU占用率过高等 
    
## 总结

### 4.1.课程总结
    线程创建的两种方法回顾
    线程创建的两种方式比较
    补充：
        1.程序中的统一资源是指同一个Runnable
    线程的生命周期
    守护线程