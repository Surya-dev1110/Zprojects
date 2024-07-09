package calculatetime;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
class Calculate_Main
{
    public static void main(String[] args) throws Exception
    {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        ObjectName name = new ObjectName("calculatetime:type=Timer");

        Timer mbean = new Timer();
        mbs.registerMBean(mbean,name);

        mbean.start();
        //Code to calculate time
        SampleProgram.printTable(5);
        mbean.stop();

        System.out.println("Elapsed time : "+mbean.getTime());
    }
}
