package daemonumbra.daemonutil.blocks;

import daemonumbra.daemonutil.DaemonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockDebug extends Block{

    private String blockName = "debug_block";

    public BlockDebug(){
        super(Material.GROUND);
        this.setHardness(0.5f);
        this.setUnlocalizedName(this.blockName);
        this.setCreativeTab(DaemonUtil.modTab);
        this.setRegistryName(DaemonUtil.MOD_ID,this.blockName);
        DaemonUtil.GetLogger().info("*****************Setting Registry Name: " + this.getRegistryName());
    }

    public String getBlockName(){
        return this.blockName;
    }


}
