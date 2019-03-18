package org.iota.ict.ixi;

public class HelloIxiWorld extends IxiModule {

    public HelloIxiWorld(Ixi ixi) {
        super(ixi);
    }

    @Override
    public void run() {
        System.out.println("HelloIxiWorld run()");
    }

    @Override
    public void onStart() {
        System.out.println("HelloIxiWorld onStart()");
    }

    @Override
    public void onStarted() {
        System.out.println("HelloIxiWorld onStarted()");
    }

    @Override
    public void onTerminate() {
        System.out.println("HelloIxiWorld onTerminate()");
    }

    @Override
    public void onTerminated() {
        System.out.println("HelloIxiWorld onTerminated()");
    }
}
