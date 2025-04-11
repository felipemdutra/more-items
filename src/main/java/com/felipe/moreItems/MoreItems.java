package com.felipe.moreItems;

import com.felipe.moreItems.items.ModItems;
import com.felipe.moreItems.items.ModToolMaterials;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreItems implements ModInitializer {
    public static final String MOD_ID = "more-items";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("MoreItems mod initialized!");

        ModToolMaterials.initialize();
        ModItems.initialize();
    }
}
