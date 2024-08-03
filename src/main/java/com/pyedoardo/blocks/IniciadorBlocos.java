package com.pyedoardo.blocks;
import com.pyedoardo.EmeraldProject;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class IniciadorBlocos {
    public static final Block BLOCO_ESMERALDA_DENSA = register("bloco_esmeralda_densa", new Block(AbstractBlock.Settings.create()
            .strength(2.0F, 9.0F)));

    public static <T extends Block> T register(String name, T block){
        return Registry.register(Registries.BLOCK, EmeraldProject.id(name), block);
    }
}
