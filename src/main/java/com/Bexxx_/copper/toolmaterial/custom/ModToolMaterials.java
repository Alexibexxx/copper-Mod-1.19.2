package com.Bexxx_.copper.toolmaterial.custom;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

	COPPER_SWORD(3, 2200, 5.0F, 4.0F, 30, () -> {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}),
	COPPER_AXE(3, 2200, 5.0F, 4.0F, 30, () -> {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}),
	COPPER_PICKAXE(3, 2200, 5.0F, 4.0F, 30, () -> {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}),
	COPPER_HOE(3, 2200, 5.0F, 4.0F, 30, () -> {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}),
	COPPER_SHOVEL(3, 2200, 5.0F, 4.0F, 30, () -> {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	});

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }
    @Override
    public int getDurability() { return itemDurability; }

    @Override
    public float getMiningSpeedMultiplier() { return miningSpeed; }

    @Override
    public float getAttackDamage() { return attackDamage; }

    @Override
    public int getMiningLevel() { return miningLevel; }

    @Override
    public int getEnchantability() { return enchantability; }

    @Override
    public Ingredient getRepairIngredient() { return repairIngredient.get(); }
}
