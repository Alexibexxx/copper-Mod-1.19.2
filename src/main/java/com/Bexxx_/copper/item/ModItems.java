package com.Bexxx_.copper.item;

import com.Bexxx_.copper.item.custom.*;
import com.Bexxx_.copper.tab.ModItemGroup;
import com.Bexxx_.copper.toolmaterial.custom.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.Bexxx_.copper.CopperMod.MODID;
import static com.Bexxx_.copper.CopperMod.LOGGER;

public class ModItems {
	public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
			new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
	public static final Item COPPER_SWORD = registerItem("copper_sword",
			new CopperSwordToolItem(new FabricItemSettings().group(ModItemGroup.COPPER)));
	public static final Item COPPER_AXE = registerItem("copper_axe",
			new CopperAxeToolItem(new FabricItemSettings().group(ModItemGroup.COPPER)));
	public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
			new CopperPickaxeToolItem(new FabricItemSettings().group(ModItemGroup.COPPER)));
	public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
			new CopperShovelToolItem(new FabricItemSettings().group(ModItemGroup.COPPER)));
	public static final Item COPPER_HOE = registerItem("copper_hoe",
			new CopperHoeToolItem(new FabricItemSettings().group(ModItemGroup.COPPER)));







	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MODID, name), item);

	}

	public static void registerModItems() { LOGGER.debug("Registering Mod Items for " + MODID);
	}





}
