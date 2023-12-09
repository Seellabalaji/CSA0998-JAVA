class cthread extends Thread
{
    public void run()
    {
        setPriority(Thread.MIN_PRIORITY);
        Thread cur=Thread.currentThread();
        int p=cur.getPriority();
        System.out.println("A priority value : "+p);
        for(int i = 1; i<=5; i++)
        {
            System.out.println(i+" X 17 = "+i*17);

        }

        System.out.println("Exiting A Thread");
    }
}
class dthread extends Thread
{
    public void run()
    {
        setPriority(Thread.MAX_PRIORITY);
        Thread cur=Thread.currentThread();
        int p=cur.getPriority();
        System.out.println("B priority value : "+p);
        for(int i = 1; i<=5; i++)
        {
            System.out.println(i+" X 19 = "+i*19);
        }
        System.out.println("Exiting B Thread");
    }
}
class prioritytest
{
    public static void main(String arg[])
    {
        athread a = new athread();
        bthread b = new bthread();
        a.start();
        b.start();
    }
}