// Lazy Initialization 

/*
*  Lazy Initialization only creates the singleton object when it is required.
*  Below, the Singleton object is only initialized when it is asked for, using the getInstance method
*/

public class Singleton{
  private static Singleton singleton;
  
  private Singleton(){}
  
  public static Singleton getInstance(){
    if(singleton == null){
      singleton = new Singleton();
    }
    return singleton;
  }
}

// Static Initialization

/*
*  Static Initialization is when the object is created as and when the class is loaded
*  The singleton object is created when the program loads, and if a lot of singleton objects 
*  needs to be initialized at program startup, the program may slow down at initial startup phase.
*  Hence, use lazy initialization in such cases.
*/

class StaticSingleton{
  private static Singleton singleton = new Singleton();
  
  private Singleton(){}
  
  public static Singleton getInstance(){
    return singleton;
  }
}

// PS: Note that the singleton variable is static, and also the getInstance method. Also note that the construction is private.
// Try to answer why it is so.

/*
*  Imagine that multiple threads comes concurrently and tries to create the new instance. In such situation the may be three or more
*  threads are waiting on the synchronized block to get access. Since we have used synchronized only one thread will be given access.
*  All the remaining threads which were waiting on the synchronized block will be given access when first thread exits this block.
*  However when the remaining concurrent thread enters the synchronized block they are prevented to enter further due to the double
*  check : null check. Since the first thread has already created an instance no other thread will enter this loop.
*/
class ThreadSafeSingleton{
  private static Singleton singleton;
  
  private Singleton(){}
  
  public static volatile SingletonExample getSingletonInstance() {
        if (null == singletonInstance) {
            synchronized (SingletonExample.class){
                    if (null == singletonInstance) {
            singletonInstance = new SingletonExample();
                    }
            }
        }
        return singletonInstance;
  }
}

// We can make the Singleton classes final so as to prevent other classes from extending it. Extending a singleton class can 
// cause trouble.
