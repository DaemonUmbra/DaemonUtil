package daemonumbra.daemonutil.items;

import daemonumbra.daemonutil.DaemonUtil;
import daemonumbra.daemonutil.blocks.DaemonUtilBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DaemonUtilItems {

    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> e){
        DaemonUtil.GetLogger().info("Registering Items");
        e.getRegistry().register(new ItemBlockDebug(DaemonUtilBlocks.DEBUG_BLOCK).setRegistryName(DaemonUtilBlocks.DEBUG_BLOCK.getRegistryName()));
    }

    @SideOnly(value = Side.CLIENT)
    public static void registerItems() {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        //Items go here
    }
}
