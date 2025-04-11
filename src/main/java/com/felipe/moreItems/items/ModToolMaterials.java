package com.felipe.moreItems.items;

import com.felipe.moreItems.MoreItems;
import net.minecraft.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial OBSIDIAN = new ToolMaterial(com.felipe.moreItems.items.ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL, 4031,
            7.0f, 6.0f, 22, com.felipe.moreItems.items.ModTags.Items.OBSIDIAN_REPAIR);

    public static void initialize() {
        MoreItems.LOGGER.info("ModToolMaterials INITIALIZED - DEBUG");
    }
}
