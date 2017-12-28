package daemonumbra.daemonutil.blocks;

import daemonumbra.daemonutil.DaemonUtil;
import daemonumbra.daemonutil.items.DaemonUtilItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DaemonUtilBlocks {

    public static BlockDebug DEBUG_BLOCK;

    @SubscribeEvent
    public void onBlockRegistry(RegistryEvent.Register<Block> e){
        DaemonUtil.GetLogger().info("Registering Blocks");

        e.getRegistry().register(DEBUG_BLOCK = new BlockDebug());
    }

    @SideOnly(value = Side.CLIENT)
    public static void registerBlockItems(){

        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        mesher.register(Item.getItemFromBlock(DEBUG_BLOCK),0,new ModelResourceLocation(DaemonUtil.MOD_ID + ":" + DEBUG_BLOCK.getBlockName(),"inventory"));
    }
}
