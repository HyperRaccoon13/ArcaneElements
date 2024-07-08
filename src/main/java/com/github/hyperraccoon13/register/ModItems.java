package com.github.hyperraccoon13.register;

import com.github.hyperraccoon13.ArcaneElements;
import com.github.hyperraccoon13.items.tools.airstone.AirstonePickaxe;
import com.github.hyperraccoon13.items.tools.earthstone.EarthstonePickaxe;
import com.github.hyperraccoon13.items.tools.firestone.FirestonePickaxe;
import com.github.hyperraccoon13.items.tools.waterstone.WaterstonePickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ModItems {

    public static final Item TUNING_FORK = register("tuning_fork", new Item(new Item.Settings()));

    public static final ToolItem FIRESTONE_PICKAXE = registerTool("firestone_pickaxe", new FirestonePickaxe(ModMats.FIRESTONE, new Item.Settings()));
    public static final ToolItem AIRSTONE_PICKAXE = registerTool("airstone_pickaxe", new AirstonePickaxe(ModMats.AIRSTONE, new Item.Settings()));
    public static final ToolItem EARTHSTONE_PICKAXE = registerTool("earthstone_pickaxe", new EarthstonePickaxe(ModMats.EARTHSTONE, new Item.Settings()));
    public static final ToolItem WATERSTONE_PICKAXE = registerTool("waterstone_pickaxe", new WaterstonePickaxe(ModMats.WATERSTONE, new Item.Settings()));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ArcaneElements.id(name), item);
    }

    public static <T extends ToolItem> T registerTool(String name, T item) {
        return Registry.register(Registries.ITEM, ArcaneElements.id(name), item);
    }


    public static void initialize() {}
}

