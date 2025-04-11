package com.felipe.moreItems.items.custom;

import com.felipe.moreItems.MoreItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ObsidianSwordItem extends Item {

    public ObsidianSwordItem(ToolMaterial material, float attackDmg, float attackSpeed, Settings settings) {
        super(settings.sword(material, attackDmg, attackSpeed));
        MoreItems.LOGGER.info("OBSIDIAN SWORD CONSTRUCTOR CALLED - DEBUG");
    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);

        // Apply "bleeding" effect.
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 80, 3, false, true, true));
        MoreItems.LOGGER.info("OBSIDIAN SWORD HIT - DEBUG");
    }
}
