package com.github.hyperraccoon13.register;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class ModMats {

    public static final ToolMaterial FIRESTONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 5;
        }

        @Override
        public float getAttackDamage() {
            return 5;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return null;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial AIRSTONE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 5;
        }

        @Override
        public float getAttackDamage() {
            return 5;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return null;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial EARTHSTONE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 5;
        }

        @Override
        public float getAttackDamage() {
            return 5;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return null;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static final ToolMaterial WATERSTONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 5;
        }

        @Override
        public float getAttackDamage() {
            return 5;
        }

        @Override
        public TagKey<Block> getInverseTag() {
            return null;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public static void initialize() {}
}
