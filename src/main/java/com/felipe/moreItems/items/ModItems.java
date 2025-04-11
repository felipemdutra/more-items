package com.felipe.moreItems.items;

import com.felipe.moreItems.MoreItems;
import com.felipe.moreItems.items.custom.ObsidianSwordItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static ObsidianSwordItem OBSIDIAN_SWORD;

    @SuppressWarnings("unchecked")
    private static <T extends Item> RegistryKey<T> keyOf(String id) {
        return (RegistryKey<T>) RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreItems.MOD_ID, id));
    }

    @SuppressWarnings("unchecked")
    public static <T extends Item> T register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        T item = (T) factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    private static <T extends Item> T register(String id, Function<Item.Settings, Item> factory) {
        return register(keyOf(id), factory, new Item.Settings()) ;
    }

    public static void initialize() {
        MoreItems.LOGGER.info("INITIALIZING ITEMS - DEBUG");

        OBSIDIAN_SWORD = register("obsidian_sword", (settings) ->
                new ObsidianSwordItem(com.felipe.moreItems.items.ModToolMaterials.OBSIDIAN, 5.5F, -2.8F, settings));

        MoreItems.LOGGER.info("OBSIDIAN SWORD REGISTERED!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> {
                    MoreItems.LOGGER.info("ITEM ADDED TO ITEM GROUP - DEBUG");
                    itemGroup.add(OBSIDIAN_SWORD);
                    // Add more items here
               });
        MoreItems.LOGGER.info("OBSIDIAN SWORD ADDED TO ITEM GROUP");
    }
}
