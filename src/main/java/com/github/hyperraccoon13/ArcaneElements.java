package com.github.hyperraccoon13;

import com.github.hyperraccoon13.register.ModBlocks;
import com.github.hyperraccoon13.register.ModItems;
import com.github.hyperraccoon13.register.ModMats;
import com.github.hyperraccoon13.register.ModTabs;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneElements implements ModInitializer {
	public static final String MOD_ID = "arc_elements";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.initialize();
		ModTabs.initialize();
		ModMats.initialize();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}