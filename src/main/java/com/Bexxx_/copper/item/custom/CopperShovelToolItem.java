package com.Bexxx_.copper.item.custom;

import com.Bexxx_.copper.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.SwordItem;

public class CopperShovelToolItem extends SwordItem {
	public CopperShovelToolItem(Settings settings) {
		super(ModToolMaterials.COPPER_SHOVEL, 1, 2f, settings);
	}
}
