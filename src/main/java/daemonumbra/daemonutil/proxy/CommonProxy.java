package daemonumbra.daemonutil.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public interface CommonProxy {
    void preinit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postinit(FMLPostInitializationEvent event);
}
