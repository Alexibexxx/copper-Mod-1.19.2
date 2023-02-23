package com.Bexxx_.copper.item.custom;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.UUID;

public class ExtraHeartItem extends Item {
	private static final UUID HEART_UUID = UUID.fromString("7108c3d3-22e3-4a29-bec9-830e55c18416");
	private static final EntityAttributeModifier HEART_MODIFIER = new EntityAttributeModifier(
			HEART_UUID, "Extra Heart", 2.0, EntityAttributeModifier.Operation.ADDITION);

	public ExtraHeartItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		ItemStack itemStack = player.getStackInHand(hand);
		if (!world.isClient) {
			// Determine the number of extra hearts to add based on the number of times the item has been used
			int numExtraHearts = (int) itemStack.getNbt().("numExtraHearts");

			player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)
					.removeModifier(HEART_MODIFIER); // Remove the existing modifier

			player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)
					.addTemporaryModifier(new EntityAttributeModifier(
							"Permanent Heart Modifier", 2.0 * numExtraHearts, EntityAttributeModifier.Operation.ADDITION));

			// Increment the number of extra hearts for the next use
			itemStack.getOrCreateNbt().putInt("numExtraHearts", numExtraHearts + 1);

			itemStack.damage(1, player, (entity) -> entity.sendToolBreakStatus(hand));
		}

		return TypedActionResult.success(itemStack);
	}

	// Remove the heart modifier when the player dies
	@Override
	public void onCraft(ItemStack stack, World world, PlayerEntity player) {
		player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).removeModifier(HEART_MODIFIER);
	}
}
