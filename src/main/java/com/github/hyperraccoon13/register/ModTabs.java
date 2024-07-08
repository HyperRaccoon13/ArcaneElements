package com.github.hyperraccoon13.register;

import com.github.hyperraccoon13.ArcaneElements;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ModTabs {
    public static final ItemGroup ARCANE_ELEMENTS = register("arcane_elements", FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup." + ArcaneElements.MOD_ID + "arcane_elements"))
            .icon(Items.DIRT::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(ArcaneElements.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());


    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, ArcaneElements.id(name), itemGroup);
    }

    public static void initialize() {}
}
