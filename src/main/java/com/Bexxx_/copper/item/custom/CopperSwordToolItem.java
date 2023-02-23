package com.Bexxx_.copper.item.custom;

import com.Bexxx_.copper.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.SwordItem;

public class CopperSwordToolItem extends SwordItem {
	public CopperSwordToolItem(Settings settings) {
		super(ModToolMaterials.COPPER_SWORD, 4, 3f, settings);
	}
}
