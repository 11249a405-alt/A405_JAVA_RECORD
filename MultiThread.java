class MultiThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String args[])
    {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}