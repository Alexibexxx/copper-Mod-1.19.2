package com.Bexxx_.copper;

import com.Bexxx_.copper.item.ModItems;
import com.Bexxx_.copper.item.custom.ExtraHeartItem;
import com.Bexxx_.copper.tab.ModItemGroup;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CopperMod implements ModInitializer {
	public static final String MODID = "copper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID.getClass());
	public static final Item EXTRA_HEART_ITEM = new ExtraHeartItem(new Item.Settings().group(ModItemGroup.OP).rarity(Rarity.EPIC));



	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.registerModItems();
		Registry.register(Registry.ITEM, new Identifier(MODID, "extra_heart"), EXTRA_HEART_ITEM);

	}
}


