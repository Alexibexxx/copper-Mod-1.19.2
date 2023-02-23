package com.Bexxx_.copper.tab;

import com.Bexxx_.copper.CopperMod;
import com.Bexxx_.copper.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static com.Bexxx_.copper.CopperMod.MODID;


public class ModItemGroup {

	public static final ItemGroup COPPER = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab1"), () -> new ItemStack(Items.COPPER_INGOT));
	public static final ItemGroup OP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab2"), () -> new ItemStack(CopperMod.EXTRA_HEART_ITEM));

}
