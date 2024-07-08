package com.github.hyperraccoon13.register;

import com.github.hyperraccoon13.ArcaneElements;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block FIRESTONE_ORE_BLOCK = registerWithItem("firestone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block DEEPSLATE_FIRESTONE_ORE_BLOCK = registerWithItem("deepslate_firestone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block AIRSTONE_ORE_BLOCK = registerWithItem("airstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block DEEPSLATE_AIRSTONE_ORE_BLOCK = registerWithItem("deepslate_airstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block EARTHSTONE_ORE_BLOCK = registerWithItem("earthstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block DEEPSLATE_EARTHSTONE_ORE_BLOCK = registerWithItem("deepslate_earthstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block WATERSTONE_ORE_BLOCK = registerWithItem("waterstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));
    public static final Block DEEPSLATE_WATERSTONE_ORE_BLOCK = registerWithItem("deepslate_waterstone_ore_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4, 6)));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, ArcaneElements.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }


    public static void initialize() {}
}
