package daemonumbra.daemonutil.proxy;

import daemonumbra.daemonutil.DaemonUtil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements CommonProxy{
    @Override
    public void preinit(FMLPreInitializationEvent event) {
        DaemonUtil.INSTANCE.GetLogger().info("Server: PreInit");
    }

    @Override
    public void init(FMLInitializationEvent event) {
        DaemonUtil.INSTANCE.GetLogger().info("Server: Init");
    }

    @Override
    public void postinit(FMLPostInitializationEvent event) {
        DaemonUtil.INSTANCE.GetLogger().info("Server: PostInit");
    }
}
