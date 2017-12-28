package daemonumbra.daemonutil;

import daemonumbra.daemonutil.blocks.DaemonUtilBlocks;
import daemonumbra.daemonutil.exceptions.FingerprintViolationException;
import daemonumbra.daemonutil.items.DaemonUtilItems;
import daemonumbra.daemonutil.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = DaemonUtil.MOD_ID,
        name = DaemonUtil.MOD_NAME,
        version = DaemonUtil.VERSION,
        certificateFingerprint = DaemonUtil.FINGERPRINT
)
public class DaemonUtil {

    public static final String MOD_ID = "daemonutil";
    public static final String MOD_NAME = "DaemonUtil";
    public static final String VERSION = "@VERSION@"; //Set during build
    protected static final String FINGERPRINT = "1ab8da1fa691eb8f19e396f068432220649c7e4f";
    public static CreativeTabs modTab = new CreativeTabs(MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(DaemonUtilBlocks.DEBUG_BLOCK);
        }
    };

    private static final Logger DUtilLogger = LogManager.getLogger(MOD_ID);

    public DaemonUtil() {
        DUtilLogger.info("Instantiating "+ MOD_ID);
        DaemonUtilItems itemInstance = new DaemonUtilItems();
        DaemonUtilBlocks blockInstance = new DaemonUtilBlocks();

        MinecraftForge.EVENT_BUS.register(blockInstance);
        MinecraftForge.EVENT_BUS.register(itemInstance);
    }

    @SidedProxy(
            clientSide = "daemonumbra.daemonutil.proxy.ClientProxy",
            serverSide = "daemonumbra.daemonutil.proxy.ServerProxy"
    )
    public static CommonProxy Proxy;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static DaemonUtil INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        Proxy.preinit(event);

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        Proxy.postinit(event);
    }

    @Mod.EventHandler
    public void keyviolation(FMLFingerprintViolationEvent event) throws Exception{
        if(!event.isDirectory()) {
            throw new FingerprintViolationException("Modified DaemonUtil jar detected, please get an original jar and try again");
        }
     }

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
    }

    public static Logger GetLogger(){
        return DUtilLogger;
    }
}
