package com.github.hyperraccoon13.register;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class ModMats {

    public static final ToolMaterial FIRESTONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 1700;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8;
        }

        @Override
        public float getAttackDamage() {
            return 4.5F;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial AIRSTONE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 1700;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8;
        }

        @Override
        public float getAttackDamage() {
            return 4.5F;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial EARTHSTONE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 1700;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8;
        }

        @Override
        public float getAttackDamage() {
            return 4.5F;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial WATERSTONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 1700;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8;
        }

        @Override
        public float getAttackDamage() {
            return 4.5F;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static void initialize() {}
}
