package com.felipe.moreItems.items;

import com.felipe.moreItems.MoreItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = createTag("incorrect_for_obsidian_tool");

        private static TagKey<Block> createTag(String name) {
            MoreItems.LOGGER.info("BLOCK TAG CREATED - DEBUG");
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreItems.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> OBSIDIAN_REPAIR = createTag("obsidian_repair");

        private static TagKey<Item> createTag(String name) {
            MoreItems.LOGGER.info("ITEM TAG CREATED - DEBUG");
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreItems.MOD_ID, name));
        }
    }
}
