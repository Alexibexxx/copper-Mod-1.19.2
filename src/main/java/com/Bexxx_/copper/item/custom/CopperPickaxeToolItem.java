package com.Bexxx_.copper.item.custom;

import com.Bexxx_.copper.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.SwordItem;

public class CopperPickaxeToolItem extends SwordItem {
	public CopperPickaxeToolItem(Settings settings) {
		super(ModToolMaterials.COPPER_PICKAXE, 2, 2f, settings);
	}
}
