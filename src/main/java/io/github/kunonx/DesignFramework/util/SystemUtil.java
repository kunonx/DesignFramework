package io.github.kunonx.DesignFramework.util;

import com.sun.management.OperatingSystemMXBean;
import java.io.File;
import java.lang.management.ManagementFactory;
//import io.github.kunonx.DesignFramework.DesignFramework;
//import org.apache.commons.lang3.SystemUtils;

/**
 * Get and control information about your system or manage external libraries.
 * @deprecated The class is not configured
 */
public class SystemUtil
{
    //
    // Unfortunately, this class is not currently in use.
    // There was still a problem loading the external library module, and JNI related methods are still being studied.
    // If you have designed the function, the class will be used normally.
    //

    /*
    private static final String SYSTEM_UTIL_LIBRARY = "DesignFrameworkSystemUtil.dll";

    static
    {
        if(new File(DesignFramework.getInstance().getDataFolder().getAbsoluteFile(), "DesignFrameworkSystemUtil.dll").exists())
        {
            try
            {
                Runtime.getRuntime().load(DesignFramework.getInstance().getDataFolder().getAbsoluteFile() + "\\" + SYSTEM_UTIL_LIBRARY);
            }
            catch(SecurityException e)
            {

            }
        }
    }

    public static native String getSimpleOSType();

    public static native String getPlatformType();

    public static String getOS()
    {
        if(SystemUtils.IS_OS_WINDOWS)
            return "WINDOWS";
        else if(SystemUtils.IS_OS_LINUX)
            return "LINUX";
        else if(SystemUtils.IS_OS_MAC_OSX)
            return "MAC_OSX";
        else
            return "UNKNOWN";
    }
    public static String getNativeInterfaceExtensionName(String filename) throws UnsupportedOperationException
    {
        if(getSimpleOSType().equalsIgnoreCase("WINDOWS"))
            if(!filename.endsWith(".dll"))
                return filename + ".dll";
            else
                return filename;
        else if(getSimpleOSType().equalsIgnoreCase("LINUX"))
            if(!filename.endsWith(".so"))
                return filename + ".so";
            else
                return filename;
        else if(getSimpleOSType().equalsIgnoreCase("MAC_OSX"))
            if(!filename.endsWith(".jnilib"))
                return filename + ".jnilib";
            else
                return filename;
        else
            throw new UnsupportedOperationException();
    }
*/
   public static long getMaxMemory()
    {
        return Runtime.getRuntime().maxMemory();
    }

    public static long getDiskSize()
    {
        return new File("/").getTotalSpace();
    }

    public static long getMemorySize() {
        return ((OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
    }
}
